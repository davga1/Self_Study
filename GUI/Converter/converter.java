package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class converter implements ActionListener {
    JFrame frame;
    JButton Ruble1, Dollar1, Euro1, Dram1, Convert,
            Ruble2, Dollar2, Euro2, Dram2;
    boolean isDollar1, isDollar2, isEuro1, isEuro2, isRuble1, isRuble2, isDram1, isDram2;

    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    String text = "";

    public converter() {
        frame = new JFrame("Converter");
        frame.setSize(410, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        Dollar1 = new JButton("$");
        Dollar1.setBounds(60, 50, 100, 30);
        Dollar1.setBackground(Color.white);
        Dollar1.addActionListener(this);
        label.add(Dollar1);
        Ruble1 = new JButton("₽");
        Ruble1.setBounds(60, 85, 100, 30);
        Ruble1.setBackground(Color.white);
        Ruble1.addActionListener(this);
        label.add(Ruble1);
        Euro1 = new JButton("€");
        Euro1.setBounds(60, 120, 100, 30);
        Euro1.setBackground(Color.white);
        Euro1.addActionListener(this);
        label.add(Euro1);
        Dram1 = new JButton("֏");
        Dram1.setBounds(60, 155, 100, 30);
        Dram1.setBackground(Color.white);
        Dram1.addActionListener(this);
        label.add(Dram1);
        Convert = new JButton("=");
        Convert.setBounds(175, 85, 50, 65);
        Convert.addActionListener(this);
        label.add(Convert);
        tf1.setBounds(175, 50, 50, 30);
        tf1.addActionListener(this);
        label.add(tf1);
        tf2.setBounds(175, 155, 50, 30);
        label.add(tf2);
        Dollar2 = new JButton("$");
        Dollar2.setBounds(240, 50, 100, 30);
        Dollar2.setBackground(Color.white);
        Dollar2.addActionListener(this);
        label.add(Dollar2);
        Ruble2 = new JButton("₽");
        Ruble2.setBounds(240, 85, 100, 30);
        Ruble2.setBackground(Color.white);
        Ruble2.addActionListener(this);
        label.add(Ruble2);
        Euro2 = new JButton("€");
        Euro2.setBounds(240, 120, 100, 30);
        Euro2.setBackground(Color.white);
        Euro2.addActionListener(this);
        label.add(Euro2);
        Dram2 = new JButton("֏");
        Dram2.setBounds(240, 155, 100, 30);
        Dram2.setBackground(Color.white);
        Dram2.addActionListener(this);
        label.add(Dram2);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        converter c = new converter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Dollar1) {
            isDollar1 = true;
            isRuble1 = false;
            isEuro1 = false;
            isDram1 = false;
            Dollar1.setBackground(Color.LIGHT_GRAY);
            Euro1.setBackground(Color.white);
            Ruble1.setBackground(Color.white);
            Dram1.setBackground(Color.white);
        } else if (e.getSource() == Euro1) {
            isEuro1 = true;
            isDollar1 = false;
            isDram1 = false;
            isRuble1 = false;
            Euro1.setBackground(Color.LIGHT_GRAY);
            Dollar1.setBackground(Color.white);
            Ruble1.setBackground(Color.white);
            Dram1.setBackground(Color.white);
        } else if (e.getSource() == Ruble1) {
            isRuble1 = true;
            isDram1 = false;
            isDollar1 = false;
            isEuro1 = false;
            Ruble1.setBackground(Color.LIGHT_GRAY);
            Dollar1.setBackground(Color.white);
            Euro1.setBackground(Color.white);
            Dram1.setBackground(Color.white);
        } else if (e.getSource() == Dram1) {
            isDram1 = true;
            isDollar1 = false;
            isEuro1 = false;
            isRuble1 = false;
            Dram1.setBackground(Color.LIGHT_GRAY);
            Dollar1.setBackground(Color.white);
            Euro1.setBackground(Color.white);
            Ruble1.setBackground(Color.white);
        }
        if (e.getSource() == Dollar2) {
            isDollar2 = true;
            isEuro2 = false;
            isRuble2 = false;
            isDram2 = false;
            Dollar2.setBackground(Color.LIGHT_GRAY);
            Euro2.setBackground(Color.white);
            Ruble2.setBackground(Color.white);
            Dram2.setBackground(Color.white);
        } else if (e.getSource() == Euro2) {
            isEuro2 = true;
            isDollar2 = false;
            isRuble2 = false;
            isDram2 = false;
            Euro2.setBackground(Color.LIGHT_GRAY);
            Dollar2.setBackground(Color.white);
            Ruble2.setBackground(Color.white);
            Dram2.setBackground(Color.white);
        } else if (e.getSource() == Ruble2) {
            isRuble2 = true;
            isDollar2 = false;
            isEuro2 = false;
            isDram2 = false;
            Ruble2.setBackground(Color.LIGHT_GRAY);
            Dollar2.setBackground(Color.white);
            Euro2.setBackground(Color.white);
            Dram2.setBackground(Color.white);
        } else if (e.getSource() == Dram2) {
            isDram2 = true;
            isDollar2 = false;
            isEuro2 = false;
            isRuble2 = false;
            Dram2.setBackground(Color.LIGHT_GRAY);
            Dollar2.setBackground(Color.white);
            Euro2.setBackground(Color.white);
            Ruble2.setBackground(Color.white);
        }
        text = tf1.getText();
        //Setting converter
        if (e.getSource() == Convert) {
            if (isDollar1 && isDollar2) {
                tf2.setText(text);
            }//For dollar
            if (isDollar1 && isRuble2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 75.0914));
            }
            if (isDollar1 && isEuro2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 0.9155));
            }
            if (isDollar1 && isDram2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 400));
            }
            //for Ruble
            if (isRuble1 && isDollar2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 0.0132));
            }
            if (isRuble1 && isRuble2) {
                tf2.setText(text);
            }
            if (isRuble1 && isEuro2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 0.0121));
            }
            if (isRuble1 && isDram2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 5));
            }
            //For Euro
            if (isEuro1 && isDollar2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 1.0923));
            }
            if (isEuro1 && isRuble2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 82.8887));
            }
            if (isEuro1 && isEuro2) {
                tf2.setText(text);
            }
            if (isEuro1 && isDram2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 420.73));
            }
            //For Dram
            if (isDram1 && isDollar2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 0.0026));
            }
            if (isDram1 && isRuble2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 0.20));
            }
            if (isDram1 && isEuro2) {
                tf2.setText(String.valueOf(Double.parseDouble(text) * 0.0024));
            }
            if (isDram1 && isDram2) {
                tf2.setText(text);
            }
        }
    }
}
