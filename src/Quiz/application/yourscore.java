package Quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yourscore extends JFrame implements ActionListener {
    int score;
    String name;
    JButton b2,b3;
    yourscore(int score, String name){
        this.score=score;
        this.name=name;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,300);
        add(image);

        JLabel l1 = new JLabel(""+name+" Your Score is "+ score);
        l1.setBounds(250, 300, 800, 70);
        l1.setFont(new Font("Monospaced", Font.BOLD, 30));
        add(l1);

        b2 = new JButton("Exit");
        b2.setBounds(550, 500, 150, 30);
        b2.setFont(new Font("Monospaced", Font.ITALIC, 20));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.YELLOW);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Play Again");
        b3.setBounds(200, 500, 250, 30);
        b3.setFont(new Font("Monospaced", Font.ITALIC, 20));
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.YELLOW);
        b3.addActionListener(this);
        add(b3);

        setUndecorated(false);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLocation(350, 100);
        setSize(900, 600);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2) {
            setVisible(false);
        }else{
            new Login();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new yourscore(0,"");

    }
}
