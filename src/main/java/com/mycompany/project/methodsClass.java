package com.mycompany.project;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class methodsClass {
    DataBase_class db = new DataBase_class();

    // Burada maili regex kurallarıyla kontrol ediyorum.
    public boolean mailRegexControl(String email) {

        boolean a = false;

        String regex = "^(.+)@(.+)$";
        if (email.matches(regex)) {
            a = true;
        }
        return a;

    }


    // Burada yazılan yazıların içinde sadece harf olması için
    // girdiyi regex ile kontrol ediyorum.
    public boolean textRegexControl(String yazi) {

        boolean a = false;

        String regex = "^[a-zA-ZşŞçÇĞğÖöÜüİı]*$";
        if (yazi.matches(regex)) {
            a = true;
        }
        return a;

    }


    // Burada girilen telefonda sadece sayı olması için regex ile kontrol ediyorum.
    public boolean phoneRegexControl(String phone) {

        boolean a = false;

        String regex = "[0-9]{10}";
        if (phone.matches(regex)) {
            a = true;
        }
        return a;

    }


    // Burada rezervasyon için tarih alırken comboBox içinde seçilen aya göre
    // spinner'in max alacağı değeri kontrol ediyorum.
    public void setupDays(JComboBox comboBox, JSpinner spinner) {
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 31, 1);
        Object selectedItem = comboBox.getSelectedItem();
        if ("Ocak".equals(selectedItem) || "Aralık".equals(selectedItem) || "Mart".equals(selectedItem) || "Ekim".equals(selectedItem) || "Ağustos".equals(selectedItem) || "Temmuz".equals(selectedItem) || "Mayıs".equals(selectedItem)) {
            model.setMaximum(31);
        } else if ("Şubat".equals(selectedItem)) {
            model.setMaximum(28);
        } else if ("Nisan".equals(selectedItem) || "Haziran".equals(selectedItem) || "Eylül".equals(selectedItem) || "Kasım".equals(selectedItem)) {
            model.setMaximum(30);
        }
        spinner.setModel(model);

    }


    // Burada rezervasyon alırken hem ayın hem de günün seçili olduğundan emin
    // olmak için ikisini de kontrol ediyorum.
    public boolean isMonthAndDaySelected(JComboBox monthComboBox, JSpinner daySpinner) {
        Object selectedItem = monthComboBox.getSelectedItem();
        return !"Ay Seçiniz".equals(selectedItem) && (int) daySpinner.getValue() != 0;
    }


    // Burada kırmızı, mavi ve sarı salonlarda saat seçimi yapılırken
    //seçilen yerlerin renginin değişmesini ve ,geçici olarak, daha sonra
    // database'e aktarılmak üzere bir array içine kayıt ediyorum.
    public void changeButtonColorsAndPutClocksArraylist(JPanel panelOfButtons, java.awt.event.ActionEvent evt, ArrayList selectedButtons) {

        JButton buttonPressed = (JButton) evt.getSource();
        for (Component component : panelOfButtons.getComponents()) {
            if (component instanceof JButton button) {
                if (button == buttonPressed) {
                    if (!button.isSelected()) {
                        button.setBackground(Color.red);
                        button.setForeground(Color.red);
                        button.setSelected(true);

                    } else if (button.isSelected()) {
                        button.setBackground(Color.green);
                        button.setForeground(Color.green);
                        button.setSelected(false);
                    }
                }
            }
        }
        for (Component component : panelOfButtons.getComponents()) {
            if (component instanceof JButton button) {
                if (button.isSelected()) {
                    if (button == buttonPressed) {
                        selectedButtons.add(button.getText());
                    }
                } else if (!button.isSelected()) {
                    selectedButtons.remove(button.getText());
                }
            }
        }
    }


    // Burada alınmış olan randevu saatlerini diğer kullanıcılar alamasın
    // diye siyah renge çevirip butonları kapatan metod yazılı.
    public void setReservationsOff(JPanel panelOfButtons, ArrayList reservedTimes) {
        for (Component component : panelOfButtons.getComponents()) {
            if (component instanceof JButton button) {
                for (int i = 0; i < reservedTimes.size(); i++) {
                    if (reservedTimes.get(i).equals(button.getText())) {
                        button.setBackground(Color.BLACK);
                        button.setEnabled(false);

                    }
                }
            }
        }
    }


    // Burada tarih her yenilendiğinde buttonların durumları resetleniyor.
    public void setDefaultButtons(JPanel panelOfButtons) {
        for (Component component : panelOfButtons.getComponents()) {
            if (component instanceof JButton button) {
                button.setBackground(Color.green);
                button.setForeground(Color.green);
                button.setEnabled(true);
            }
        }
    }


}
