import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameMaker {
    static int pointsToAdd = 0;
    static JFrame f = new JFrame("Finding Agent Mirah");

    public JFrameMaker() {

    }

    public int returnMethod(String[] s, int[] numPoints){

        Dimension SCREENSIZE = Toolkit.getDefaultToolkit().getScreenSize();
        int SCREENWIDTH = SCREENSIZE.width;
        int SCREENHEIGHT = SCREENSIZE.height;


        JButton button1 = new JButton(s[1]);
        button1.setPreferredSize(new Dimension(200,200));
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                 pointsToAdd+=numPoints[1];
            }
        });
        JButton button2 = new JButton(s[2]);
        button2.setPreferredSize(new Dimension(200,200));
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                pointsToAdd+=numPoints[2];
            }
        });
        JButton button3 = new JButton(s[3]);
        button3.setPreferredSize(new Dimension(200,200));
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                pointsToAdd+=numPoints[3];
            }
        });
        JButton quitButton = new JButton("Quit");
        quitButton.setPreferredSize(new Dimension(200,200));
        quitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                f.setEnabled(false);
                return;
            }
        });
        JLabel question = new JLabel(s[0],SwingConstants.CENTER);
        question.setPreferredSize(new Dimension(600,200));

        JPanel p = new JPanel(new BorderLayout());

        p.add(question, BorderLayout.NORTH);
        p.add(button1, BorderLayout.WEST);
        p.add(button2, BorderLayout.CENTER);
        p.add(button3, BorderLayout.EAST);
        p.add(quitButton, BorderLayout.SOUTH);


        f.setContentPane(p);
        f.setAlwaysOnTop(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.pack();
        f.setLocation((SCREENWIDTH/2)-f.getWidth()/2, (SCREENHEIGHT/2)-f.getHeight()/2);
        f.setVisible(true);

        while(pointsToAdd==0){

        }
        f.setEnabled(false);
        f.setVisible(false);
        return pointsToAdd;

    }


}
