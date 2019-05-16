import javax.swing.*;
import java.awt.*;


public class Runner {

    public static void main(String[] args) {
        initializeWindow();
    }
    public static void initializeWindow(){
        Dimension SCREENSIZE = Toolkit.getDefaultToolkit().getScreenSize();
        int SCREENWIDTH = SCREENSIZE.width;
        int SCREENHEIGHT = SCREENSIZE.height;

        JFrame f = new JFrame("Finding Agent Mirah");

        f.setAlwaysOnTop(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(SCREENWIDTH, SCREENHEIGHT);
        f.setVisible(true);
    }
}
