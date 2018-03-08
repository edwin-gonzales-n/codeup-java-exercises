package Applets;

import javax.swing.*;
import java.awt.*;

public class WelcomeApplet extends JPanel{
        public void paint (Graphics g){
            super.paint(g);
            g.drawString("Welcome to the Jungle!",35,35);
        }

    public static void main(String[] args) {
        WelcomeApplet panel = new WelcomeApplet();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230,250);
        application.setVisible(true);
    }
}
