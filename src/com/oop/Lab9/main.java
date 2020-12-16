package com.oop.Lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.showMessageDialog;

public class main {
    private JButton divideButton;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;

    private static DecimalFormat df4 = new DecimalFormat("#.####");
    public main() {

        divideButton.addActionListener(new ActionListener() {
            double num1;
            double num2;
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String  text1 = textField1.getText();
                    num1 = Integer.parseInt(text1);
                }
                catch(Exception e1)
                {
                    showMessageDialog(null,"First input is invalid");
                    textField1.setText(null);
                }
                try{
                    String  text2 = textField2.getText();
                    num2 = Integer.parseInt(text2);
                }
                catch(Exception e1)
                {
                    showMessageDialog(null,"Second input is invalid");
                    textField2.setText(null);
                }
                try{
                    if (num2 == 0) throw new ArithmeticException("Error.Division by 0");
                    if (num2 == 13) throw new UnluckyException("Unlucky is 13!");
                   double res = num1 / num2;
                    showMessageDialog(null,"Result is " + String.format("%.4f", res));
                }
                catch(Exception e1)
                {

                    if (num2 == 0)  showMessageDialog(null,"Error.Division by 0");
                    else
                    if (num2 == 13)  showMessageDialog(null,"Unlucky, it's 13!");
                    else
                        showMessageDialog(null,"Error on division");
                    textField1.setText(null);
                    textField2.setText(null);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("main");
        frame.setContentPane(new main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

