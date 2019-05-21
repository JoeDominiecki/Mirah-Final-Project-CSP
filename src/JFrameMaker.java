import sun.security.ssl.Debug;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JFrameMaker extends JFrame implements ActionListener {
    static int x;
    static int[] pointsArray;

    public JFrameMaker(String[] s, int[] numPoints){

        this.setTitle("Finding Agent Mirah");
        pointsArray = numPoints;
        Dimension SCREENSIZE = Toolkit.getDefaultToolkit().getScreenSize();
        int SCREENWIDTH = SCREENSIZE.width;
        int SCREENHEIGHT = SCREENSIZE.height;

        JButton button1 = new JButton(s[0]);
        button1.setPreferredSize(new Dimension(200,200));
        button1.addActionListener(this);
        button1.setActionCommand("b1");

        JButton button2 = new JButton(s[1]);
        button2.setPreferredSize(new Dimension(200,200));
        button2.addActionListener(this);
        button2.setActionCommand("b2");

        JButton button3 = new JButton(s[2]);
        button3.setPreferredSize(new Dimension(200,200));
        button3.addActionListener(this);
        button3.setActionCommand("b3");

        JButton quitButton = new JButton("Quit");
        quitButton.setPreferredSize(new Dimension(200,200));
        quitButton.addActionListener(this);
        quitButton.setActionCommand("quit");

        JLabel question = new JLabel(s[3],SwingConstants.CENTER);
        question.setPreferredSize(new Dimension(600,200));

        JPanel p = new JPanel(new BorderLayout());

        p.add(question, BorderLayout.NORTH);
        p.add(button1, BorderLayout.WEST);
        p.add(button2, BorderLayout.CENTER);
        p.add(button3, BorderLayout.EAST);
        p.add(quitButton, BorderLayout.SOUTH);


        this.setContentPane(p);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setLocation((SCREENWIDTH/2)-this.getWidth()/2, (SCREENHEIGHT/2)-this.getHeight()/2);
        this.setVisible(true);

        while(x==0){
            System.out.println("ignore this");
        }
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(s.equals("b1")){
            CounterClass.score+=pointsArray[0];
            x=1;
            System.out.println("Button1");
            closeClass();
        }else if(s.equals("b2")){
            CounterClass.score+=pointsArray[1];
            x=1;
            System.out.println("Button2");
            closeClass();
        }else if(s.equals("b3")){
            CounterClass.score+=pointsArray[3];
            x=1;
            System.out.println("Button3");
            closeClass();
        }else if(s.equals("quit")){
            System.exit(0);
        }
    }

    public void closeClass(){
        this.dispose();
    }

}
