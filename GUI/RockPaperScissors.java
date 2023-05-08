import javax.script.ScriptContext;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissors implements ActionListener {
    JFrame frame;
    JButton BRock;
    JButton BPaper;
    JButton BScissors;
    String ComChoice = "";
    public RockPaperScissors(){

        frame = new JFrame("Rock Paper Scissors");
        JLabel label = new JLabel();
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BRock = new JButton("✊ Rock");
        BRock.setBounds(125,120,200,55);
        BRock.addActionListener(this);
        label.add(BRock);
        BPaper = new JButton("✋ Paper");
        BPaper.setBounds(125,176,200,55);
        BPaper.addActionListener(this);
        label.add(BPaper);
        BScissors = new JButton("✌ Scissors");
        BScissors.setBounds(125,232,200,55);
        BScissors.addActionListener(this);
        label.add(BScissors);
        frame.add(label);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double COM = Math.random() * 3;
        System.out.println(COM);
        if (COM >= 0 && COM <= 1)
            ComChoice = "Rock";
        else if (COM > 1 && COM <= 2)
            ComChoice = "Paper";
        else if (COM > 2 && COM <= 3)
            ComChoice = "Scissors";
        String word = "";
        if (e.getSource() == BRock)word = "Rock";
        else if (e.getSource() == BPaper)word = "Paper";
        else if (e.getSource() == BScissors)word = "Scissors";
        if (e.getSource() == BRock && ComChoice.equals("Scissors") || e.getSource() == BPaper && ComChoice.equals("Rock") || e.getSource() == BScissors && ComChoice.equals("Paper"))
            JOptionPane.showMessageDialog(frame,"You win\nYour choice:"+ word + "\nComputer's choice:'" + ComChoice);
        if (e.getSource() == BRock && ComChoice.equals("Paper") || e.getSource() == BPaper && ComChoice.equals("Scissors") || e.getSource() == BScissors && ComChoice.equals("Rock"))
            JOptionPane.showMessageDialog(frame,"You Lose\nYour choice:" + word + "\nComputer's choice:" + ComChoice);
        if (e.getSource() ==BRock && ComChoice.equals("Rock") || e.getSource() == BPaper && ComChoice.equals("Paper") || e.getSource() == BScissors && ComChoice.equals("Scissors"))
            JOptionPane.showMessageDialog(frame,"Draw\nYour choice:" + word + "\nComputer's choice" + ComChoice);
    }
}
