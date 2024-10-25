package Quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField t1;
    JButton b1,b2;
    Login(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,400,600);
        add(image);

        JLabel l1 = new JLabel("Enter Your Name");
        l1.setBounds(500, 120, 500, 70);
        l1.setFont(new Font("Monospaced", Font.BOLD, 25));
        add(l1);

        t1 = new JTextField(null);
        t1.setFont(new Font("Monospaced", Font.BOLD, 20));
        t1.setBackground(Color.WHITE);
        t1.setForeground(Color.BLACK);
        t1.setBounds(520, 200, 190, 40);
        add(t1);

        b1 = new JButton("START");
        b1.setBounds(450, 300, 150, 30);
        b1.setFont(new Font("Monospaced", Font.ITALIC, 20));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.YELLOW);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("EXIT");
        b2.setBounds(680, 300, 150, 30);
        b2.setFont(new Font("Monospaced", Font.ITALIC, 20));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.YELLOW);
        b2.addActionListener(this);
        add(b2);

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
            String name = t1.getText();
            if(e.getSource()==b1){
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter Your Name","Name Not Entered",JOptionPane.ERROR_MESSAGE);
                } else{
                    new Rules(name);
                    setVisible(false);
                }

            }
            else{
                setVisible(false);
            }

        } catch (Exception E) {
            JOptionPane.showMessageDialog(null,E.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

        }

    }

    public static void main(String[] args) {
        new Login();
    }
}