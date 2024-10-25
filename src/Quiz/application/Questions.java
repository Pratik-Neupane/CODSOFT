package Quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questions extends JFrame implements ActionListener{
    JButton b2,b3;
    JLabel l1,l2;
    JRadioButton r1,r2,r3,r4;
    String questions[][]= new String[10][5];
    String correctAnswers[][]=new String[10][2];
    public static int timer = 30;

        Questions() {
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
            Image i2 = i1.getImage().getScaledInstance(400,600, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(0,0,400,600);
            add(image);

            l1 = new JLabel();
            l1.setBounds(480, 100, 500, 70);
            l1.setFont(new Font("Monospaced", Font.BOLD, 18));
            add(l1);

            l2 = new JLabel();
            l2.setBounds(480, 150, 500, 70);
            l2.setFont(new Font("Monospaced", Font.BOLD, 18));
            add(l2);

            b2 = new JButton("Next");
            b2.setBounds(680, 460, 150, 30);
            b2.setFont(new Font("Monospaced", Font.ITALIC, 20));
            b2.setForeground(Color.BLACK);
            b2.setBackground(Color.YELLOW);
            b2.addActionListener(this);
            add(b2);

            b3 = new JButton("Submit");
            b3.setBounds(680, 500, 150, 30);
            b3.setFont(new Font("Monospaced", Font.ITALIC, 20));
            b3.setForeground(Color.BLACK);
            b3.setBackground(Color.YELLOW);
            b3.setEnabled(false);
            b3.addActionListener(this);
            add(b3);

            questions[0][0] = "Which file is used to run Java?";
            questions[0][1] = "JDK";
            questions[0][2] = "SDK";
            questions[0][3] = "PDK";
            questions[0][4] = "EDK";

            questions[1][0] = "What does JVM stand for?";
            questions[1][1] = "Java Virtual Machine";
            questions[1][2] = "Java Variable Machine";
            questions[1][3] = "Java Value Method";
            questions[1][4] = "Java Version Manager";

            questions[2][0] = "Which method is used to start a Java program?";
            questions[2][1] = "init()";
            questions[2][2] = "main()";
            questions[2][3] = "start()";
            questions[2][4] = "run()";

            questions[3][0] = "Which keyword is used to define a class?";
            questions[3][1] = "class";
            questions[3][2] = "define";
            questions[3][3] = "new";
            questions[3][4] = "object";

            questions[4][0] = "What is the default value of an int variable?";
            questions[4][1] = "0";
            questions[4][2] = "1";
            questions[4][3] = "-1";
            questions[4][4] = "null";

            questions[5][0] = "Which symbol is used for inheritance?";
            questions[5][1] = ":";
            questions[5][2] = "::";
            questions[5][3] = "->";
            questions[5][4] = "extends";

            questions[6][0] = "Which operator is used for multiplication?";
            questions[6][1] = "*";
            questions[6][2] = "&";
            questions[6][3] = "x";
            questions[6][4] = "/";

            questions[7][0] = "Which is a reserved keyword in Java?";
            questions[7][1] = "goto";
            questions[7][2] = "public";
            questions[7][3] = "class";
            questions[7][4] = "All of the above";

            questions[8][0] = "What is the size of int in Java?";
            questions[8][1] = "4 bytes";
            questions[8][2] = "2 bytes";
            questions[8][3] = "8 bytes";
            questions[8][4] = "1 byte";

            questions[9][0] = "Which company originally developed Java?";
            questions[9][1] = "Oracle";
            questions[9][2] = "Microsoft";
            questions[9][3] = "Sun Microsystems";
            questions[9][4] = "IBM";

            correctAnswers[0][0] = "JDK";
            correctAnswers[1][0] = "Java Virtual Machine";
            correctAnswers[2][0] = "main()";
            correctAnswers[3][0] = "class";
            correctAnswers[4][0] = "0";
            correctAnswers[5][0] = "extends";
            correctAnswers[6][0] = "*";
            correctAnswers[7][0] = "All of the above";
            correctAnswers[8][0] = "4 bytes";
            correctAnswers[9][0] = "Sun Microsystems";

            r1 = new JRadioButton("");
            r1.setBounds(500, 290, 150, 20);
            add(r1);

            r2 = new JRadioButton("");
            r2.setBounds(500, 320, 150, 20);
            add(r2);

            r3 = new JRadioButton("");
            r3.setBounds(500, 350, 150, 20);
            add(r3);

            r4 = new JRadioButton("");
            r4.setBounds(500, 380, 150, 20);
            add(r4);

            ButtonGroup b1 = new ButtonGroup();
            b1.add(r1);
            b1.add(r2);
            b1.add(r3);
            b1.add(r4);
            setUndecorated(false);
            setLayout(null);
            getContentPane().setBackground(Color.white);
            setVisible(true);
            setLocation(350, 100);
            setSize(900, 600);
            start(0);
        }
        @Override
        public void paint(Graphics g){
            super.paint(g);
            String time = "Time left is "+timer+" Seconds";
            g.setColor(new Color(255, 0, 0));
            g.setFont(new Font("monospaced",Font.BOLD,15));
            if(timer>0){
                g.drawString(time,650,100);
                timer--;
            }

        }
        public void start(int Count){
            l1.setText("Question no "+ (Count +1)+"." );
            l2.setText(questions[Count][0]);
            r1.setText(questions[Count][1]);
            r2.setText(questions[Count][2]);
            r3.setText(questions[Count][3]);
            r4.setText(questions[Count][4]);

        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Questions();
    }

}