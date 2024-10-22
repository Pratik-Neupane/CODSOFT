package Number_Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGame extends JFrame implements ActionListener {
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;
    int chances = 10;
    int times = 0;
    JTextField t1;

    NumberGame() {
        JLabel l1 = new JLabel("WELCOME TO NUMBER GAME");
        l1.setBounds(190, 30, 500, 70);
        l1.setFont(new Font("Times new roman", Font.BOLD, 25));
        add(l1);

        JLabel l2 = new JLabel("Enter Your Number" + randomNumber);
        l2.setBounds(280, 100, 500, 70);
        l2.setFont(new Font("Times new roman", Font.BOLD, 20));
        add(l2);

        t1 = new JTextField(null);
        t1.setFont(new Font("Times new roman", Font.BOLD, 20));
        t1.setBackground(Color.white);
        t1.setForeground(Color.BLACK);
        t1.setBounds(320, 190, 120, 40);
        add(t1);

        JButton b1 = new JButton("SUBMIT");
        b1.setBounds(310, 250, 150, 30);
        b1.setFont(new Font("Times new roman", Font.ITALIC, 20));
        b1.addActionListener(this);
        add(b1);

        getContentPane().setBackground(new Color(0xFFB700));
        setLayout(null);
        setLocation(300, 150);
        setSize(800, 600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String userGuess = t1.getText();
            int userNumber = Integer.parseInt(userGuess);


            if (userNumber >= 1 && userNumber <= 100) {
                times++;


                if (userNumber == randomNumber) {
                    String message = "<html>You Won!!! <br> Your Score is " + (chances - times + 1) + "</html>";
                    JOptionPane.showMessageDialog(null, message, "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                    playAgain();
                } else if (userNumber < randomNumber) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Greater Number. Chances left: " + (chances - times), "OOPS!", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter a Lower Number. Chances left: " + (chances - times), "OOPS!", JOptionPane.ERROR_MESSAGE);
                }

                t1.setText("");


                if (times == chances) {
                    JOptionPane.showMessageDialog(null, "Game Over! You've used all your chances.", "Game Over", JOptionPane.ERROR_MESSAGE);
                    playAgain();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter a Number between 1 to 100", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                t1.setText("");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            t1.setText("");
        }
    }


    public void playAgain() {
        int response = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            randomNumber = new Random().nextInt(100) + 1;
            times = 0;
            t1.setText("");
        } else if (response == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new NumberGame();
    }
}