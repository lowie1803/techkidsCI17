package program;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by huynq on 7/4/17.
 */
public class Program
{
    public static void main(String[] args)
    {
        GameWindow window = new GameWindow();
        GamePanel panel = new GamePanel();
        window.add(panel);
        panel.setBackground(Color.cyan);

        window.setVisible(true);

        panel.gameLoop();

    }
}
