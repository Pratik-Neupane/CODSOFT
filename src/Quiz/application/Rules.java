package Quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton b1;
    Rules(String name){
        this.name=name;
        JLabel l1 = new JLabel("Hello "+ name +" !! Welcome to quiz");
        l1.setBounds(180, 10, 700, 70);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l1);

        JLabel l2 = new JLabel("RULES");
        l2.setBounds(10, 70, 100, 70);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Monospaced", Font.ITALIC, 30));
        add(l2);

        JLabel rule1 = new JLabel("1. No Googling! Or you'll only get cat facts.");
        rule1.setBounds(10, 150, 800, 30);
        rule1.setFont(new Font("Monospaced", Font.PLAIN, 18));
        add(rule1);

        JLabel rule2 = new JLabel("2. Creative wrong answers earn you imaginary points.");
        rule2.setBounds(10, 190, 800, 30);
        rule2.setFont(new Font("Monospaced", Font.PLAIN, 18));
        add(rule2);

        JLabel rule3 = new JLabel("3. Only your pet can help you, and we need proof!");
        rule3.setBounds(10, 230, 800, 30);
        rule3.setFont(new Font("Monospaced", Font.PLAIN, 18));
        add(rule3);

        JLabel rule4 = new JLabel("4. Dance after every correct answer, or jazz hands if wrong.");
        rule4.setBounds(10, 270, 800, 30);
        rule4.setFont(new Font("Monospaced", Font.PLAIN, 18));
        add(rule4);

        JLabel rule5 = new JLabel("5. Timer Rule: Answer in 15 seconds or face the elevator music!");
        rule5.setBounds(10, 310, 800, 30);
        rule5.setFont(new Font("Monospaced", Font.PLAIN, 18));
        add(rule5);

        b1 = new JButton("Start Playing");
        b1.setBounds(270, 450, 300, 30);
        b1.setFont(new Font("Monospaced", Font.BOLD, 20));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.YELLOW);
        b1.addActionListener(this);
        add(b1);

        setUndecorated(false);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLocation(350, 100);
        setSize(900, 600);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            new Questions(name);
            setVisible(false);

        }
        catch (Exception E){
            JOptionPane.showMessageDialog(null,E.getMessage(),"",JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] args) {
        new Rules("");

    }
}
