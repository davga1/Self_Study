package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    JFrame frame;
    JTextField tf;
    JButton B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, BPlus, BMinus, BMultiplicate, BDivide, BPoint, BEquals, BDelete, BClear,
            BSquareRoot, BPower;
    String text = "";
    String[] arr;

    public calculator() {
        frame = new JFrame("Calculator");
        frame.setResizable(false);
        frame.setSize(300, 347);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        B7 = new JButton("7");
        B7.setBounds(1, 200, 75, 25);
        B7.addActionListener(this);
        label.add(B7);
        B8 = new JButton("8");
        B8.setBounds(76, 200, 75, 25);
        B8.addActionListener(this);
        label.add(B8);
        B9 = new JButton("9");
        B9.setBounds(151, 200, 75, 25);
        B9.addActionListener(this);
        label.add(B9);
        BPlus = new JButton("+");
        BPlus.setBounds(226, 252, 57, 25);
        label.add(BPlus);
        BPlus.addActionListener(this);
        B4 = new JButton("4");
        B4.setBounds(1, 226, 75, 25);
        label.add(B4);
        B4.addActionListener(this);
        B5 = new JButton("5");
        B5.setBounds(76, 226, 75, 25);
        label.add(B5);
        B5.addActionListener(this);
        B6 = new JButton("6");
        B6.setBounds(151, 226, 75, 25);
        label.add(B6);
        B6.addActionListener(this);
        BMinus = new JButton("-");
        BMinus.setBounds(226, 226, 57, 25);
        label.add(BMinus);
        BMinus.addActionListener(this);
        B1 = new JButton("1");
        B1.setBounds(1, 252, 75, 25);
        label.add(B1);
        B1.addActionListener(this);
        B2 = new JButton("2");
        B2.setBounds(76, 252, 75, 25);
        label.add(B2);
        B2.addActionListener(this);
        B3 = new JButton("3");
        B3.setBounds(151, 252, 75, 25);
        label.add(B3);
        B3.addActionListener(this);
        BMultiplicate = new JButton("*");
        BMultiplicate.setBounds(226, 200, 57, 25);
        label.add(BMultiplicate);
        BMultiplicate.addActionListener(this);
        BDivide = new JButton("÷");
        BDivide.setBounds(226, 174, 57, 25);
        label.add(BDivide);
        BDivide.addActionListener(this);
        B0 = new JButton("0");
        B0.setBounds(76, 278, 75, 25);
        B0.addActionListener(this);
        label.add(B0);
        BPoint = new JButton(".");
        BPoint.setBounds(1, 278, 75, 25);
        label.add(BPoint);
        BPoint.addActionListener(this);
        BEquals = new JButton("=");
        BEquals.setBounds(226, 278, 57, 25);
        label.add(BEquals);
        BEquals.addActionListener(this);
        BDelete = new JButton("⌫");
        BDelete.setBounds(226, 148, 57, 25);
        BDelete.addActionListener(this);
        label.add(BDelete);
        BClear = new JButton("C");
        BClear.setBounds(151, 278, 75, 25);
        BClear.addActionListener(this);
        label.add(BClear);
        BSquareRoot = new JButton("√");
        BSquareRoot.setBounds(151, 174, 75, 25);
        BSquareRoot.addActionListener(this);
        label.add(BSquareRoot);
        BPower = new JButton("xʸ");
        BPower.setBounds(76, 174, 75, 25);
        BPower.addActionListener(this);
        label.add(BPower);
        tf = new JTextField();
        tf.setBounds(0, 50, 300, 80);
        label.add(tf);
        frame.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        calculator C1 = new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean containsMinus = false;
        if (e.getSource() == BPower) text += "^";
        if (e.getSource() == BSquareRoot) text += "√";
        if (e.getSource() == BClear) text = "";
        if (e.getSource() == B9) text += 9;
        if (e.getSource() == B8) text += 8;
        if (e.getSource() == B7) text += 7;
        if (e.getSource() == B6) text += 6;
        if (e.getSource() == B5) text += 5;
        if (e.getSource() == B4) text += 4;
        if (e.getSource() == B3) text += 3;
        if (e.getSource() == B2) text += 2;
        if (e.getSource() == B1) text += 1;
        if (e.getSource() == B0) text += 0;
        if (e.getSource() == BPlus) text += "+";
        if (e.getSource() == BMinus) text += "-";
        if (e.getSource() == BDivide) text += "÷";
        if (e.getSource() == BMultiplicate) text += "*";
        if (e.getSource() == BPoint) text += ".";
        if (e.getSource() == BDelete) {
            StringBuffer sb = new StringBuffer(text);
            sb.deleteCharAt(sb.length() - 1);
            text = String.valueOf(sb);
        }
        if (e.getSource() == BEquals) {
            if (text.contains("√")) {
                arr = text.split("√");
                text = String.valueOf(Math.sqrt(Integer.parseInt(arr[1])));
            }
            if (text.contains("+")) {
                try {
                    arr = text.split("\\+");
                    text = String.valueOf(Long.parseLong(arr[0]) + Long.parseLong(arr[1]));
                } catch (NumberFormatException E) {
                    text = String.valueOf(Double.parseDouble(arr[0]) + Double.parseDouble(arr[1]));
                }
            }
            if (text.contains("-")) {
                try {
                    arr = text.split("-");
                    text = String.valueOf(Long.parseLong(arr[0]) - Long.parseLong(arr[1]));
                } catch (NumberFormatException E) {
                    text = String.valueOf(Double.parseDouble(arr[0]) - Double.parseDouble(arr[1]));
                }
            }
            if (text.contains("*")) {
                try {
                    arr = text.split("\\*");
                    text = String.valueOf(Long.parseLong(arr[0]) * Long.parseLong(arr[1]));
                } catch (NumberFormatException E) {
                    text = String.valueOf(Double.parseDouble(arr[0]) * Double.parseDouble(arr[1]));
                }
            }
            if (text.contains("÷")) {
                arr = text.split("÷");
                text = String.valueOf(Double.parseDouble(arr[0]) / Double.parseDouble(arr[1]));
            }
            if (text.contains("^")) {
                arr = text.split("\\^");
                try {
                    text = String.valueOf(Math.pow(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
                } catch (NumberFormatException E) {
                    text = String.valueOf(Math.pow(Double.parseDouble(arr[0]), Double.parseDouble(arr[1])));
                }
            }
        }
        tf.setText(text);
    }
}