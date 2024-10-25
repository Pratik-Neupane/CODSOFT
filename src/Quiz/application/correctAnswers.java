package Quiz.application;

import javax.swing.*;
import java.awt.*;

public class correctAnswers extends JFrame {
    correctAnswers() {
        JLabel l1 = new JLabel("1. JDK");
        l1.setBounds(50, 50, 800, 70);
        l1.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l1);
        JLabel l2 = new JLabel("2. Java Virtual Machine");
        l2.setBounds(50, 80, 800, 70);
        l2.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l2);
        JLabel l3 = new JLabel("3. main()");
        l3.setBounds(50, 110, 800, 70);
        l3.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l3);
        JLabel l4 = new JLabel("4. class");
        l4.setBounds(50, 140, 800, 70);
        l4.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l4);
        JLabel l5 = new JLabel("5. 0");
        l5.setBounds(50, 170, 800, 70);
        l5.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l5);
        JLabel l6 = new JLabel("6. extends");
        l6.setBounds(50, 200, 800, 70);
        l6.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l6);
        JLabel l7 = new JLabel("7. *");
        l7.setBounds(50, 230, 800, 70);
        l7.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l7);
        JLabel l8 = new JLabel("8. All of the above");
        l8.setBounds(50, 260, 800, 70);
        l8.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l8);
        JLabel l9 = new JLabel("9. 4 bytes");
        l9.setBounds(50, 290, 800, 70);
        l9.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l9);
        JLabel l10 = new JLabel("10. Sun Microsystems");
        l10.setBounds(40, 320, 800, 70);
        l10.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l10);
        setUndecorated(false);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLocation(350, 100);
        setSize(900, 600);

    }

    public static void main(String[] args) {
        new correctAnswers();
    }
}
