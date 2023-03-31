package com.mycompany.project;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DataBase_class {

    public String username = "root";
    String password = "12345";
    String url = "jdbc:mysql://localhost:3306/project";

    private Connection con = null;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps = null;


    // Burada sunucuma bağlanmaya çalışıyorum.
    public void initializeConnection() {

        try {

            con = DriverManager.getConnection(url, username, password);
            System.out.println("Bağlandı");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Burada rezervasyon bilgilerini database tablosuna eklediğim metod var.
    public void addReservation(String mail, String salonAdi, String ay, int gun, String saat) {

        String query = "INSERT INTO reservations (email, auditorium, month, day, time,confirmation)"
                + " VALUES (?,?,?,?,?,?)";

        try {
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query);

            ps.setString(1, mail);
            ps.setString(2, salonAdi);
            ps.setString(3, ay);
            ps.setInt(4, gun);
            ps.setString(5, saat);
            ps.setString(6, "false");


            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Burada kullanıcı bilgilerini database tablosuna eklediğim metod var.
    public void addUser(String ad, String soyad, String telefon, String mail, String sifre) throws SQLException {

        String query = "INSERT INTO users (name, surname, phone, email, password)"
                + " VALUES (?,?,?,?,?)";

        con = DriverManager.getConnection(url, username, password);
        ps = con.prepareStatement(query);
        ps.setString(1, ad);
        ps.setString(2, soyad);
        ps.setString(3, telefon);
        ps.setString(4, mail);
        ps.setString(5, sifre);

        ps.executeUpdate();
        System.out.println("Bilgiler Başarıyla Kaydedildi");

    }

    // Burada kullanıcının email adresini kullanarak database'den ismini ve soyismini alıp başka bir frame de yansıttığım kodum var.
    public String getFullNameFromDB(String email) {
        String query = "SELECT name,surname FROM users where email = ?";
        String fullName = "";

        try {
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();

            if (rs.next()) {
                fullName += (rs.getString("name")) + (" ");
                fullName += (rs.getString("surname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fullName;

    }


    // Burada kayıtlı olan kullanıcı girişi için database'den bilgilerin eşleşip eşleşmediğini kontrol eden metodum var.
    public boolean userControl(String mail, String sifre) {
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";
        boolean b = false;

        try {

            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query);

            ps.setString(1, mail);
            ps.setString(2, sifre);

            rs = ps.executeQuery();

            b = rs.next();
        } catch (SQLException e) {

            e.printStackTrace();

        }
        return b;
    }

    // Burada kullanıcıların bilgilerini database'den alıp JTablo'ya aktardığım metod var.
    public void dbToTable(DefaultTableModel tableModel) {

        tableModel.setRowCount(0);

        try {
            con = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM users";

            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {

                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String phone = rs.getString("phone");

                tableModel.addRow(new Object[]{name, surname, email, phone});

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void getReservations(DefaultTableModel tableModel) {
        String query2 = "SELECT * FROM reservations where confirmation = ?";
        tableModel.setRowCount(0);
        try {
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query2);
            ps.setString(1, "true");
            rs = ps.executeQuery();
            while (rs.next()) {
                String email = rs.getString("email");
                String auditorium = rs.getString("auditorium");
                String month = rs.getString("month");
                String day = rs.getString("day");
                String time = rs.getString("time");

                tableModel.addRow(new Object[]{email, auditorium, month, day, time});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void getReservations(DefaultListModel<String> listModel, String mail) {
        String query2 = "SELECT * FROM reservations where email = ?";
        try {
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query2);
            ps.setString(1, mail);
            rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String email = rs.getString("email");
                String auditorium = rs.getString("auditorium");
                String month = rs.getString("month");
                String day = rs.getString("day");
                int time = Integer.parseInt(rs.getString("time"));
                int tm = time;

                listModel.add(0, id + ": " + email + ", " + auditorium + ", " + day + " " + month + " Saat: " + time + ".00" + "-" + (tm + 1) + ".00 arası");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void getNotConfirmedReservations(DefaultTableModel tableModel) {
        String query2 = "SELECT * FROM reservations where confirmation = ?";
        tableModel.setRowCount(0);
        try {
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query2);
            ps.setString(1, "false");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String auditorium = rs.getString("auditorium");
                String month = rs.getString("month");
                String day = rs.getString("day");
                String time = rs.getString("time");

                tableModel.addRow(new Object[]{id, email, auditorium, month, day, time});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteReservation(int id) {
        String query = "DELETE FROM reservations where id = ?";
        try {
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addReservation(int id) {
        String query = "UPDATE reservations SET confirmation = ? where id = ?";
        try {
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query);
            ps.setString(1, "true");
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Burada popup menü ile eklediğim kullanıcıyı database'den silme metodum var.
    public void deleteUser(String mail) {
        String sorgu = "DELETE FROM users WHERE email = ?";

        try {
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(sorgu);
            ps.setString(1, mail);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getDayReservedTimes(String auditorium, String month, int day) {
        String query = "SELECT time FROM reservations WHERE auditorium = ? and month = ? and day = ?";
        ArrayList<String> reservedTimes = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query);
            ps.setString(1, auditorium);
            ps.setString(2, month);
            ps.setInt(3, day);
            rs = ps.executeQuery();

            while (rs.next()) {
                reservedTimes.add(rs.getString("time"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservedTimes;

    }


}
