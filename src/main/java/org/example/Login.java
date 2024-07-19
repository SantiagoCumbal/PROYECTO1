package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public JPanel MainPanel;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton aceptarButton;
    private JButton cancelarButton;

    public Login() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox1.getSelectedItem());
            }
        });
    }
}
