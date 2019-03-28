package program;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLOutput;

public class GameWindow extends JFrame {
    public static boolean isUpPressed=false, isDownPressed=false, isLeftPressed=false, isRightPressed=false;

    public GameWindow()
    {
        this.setTitle("Game Touhou");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);

        //key
        this.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
//                System.out.println(e.getKeyCode()+" Pressed!");
                if (e.getKeyCode() == KeyEvent.VK_UP)
                    isUpPressed = true;
                if (e.getKeyCode() == KeyEvent.VK_DOWN)
                    isDownPressed = true;
                if (e.getKeyCode() == KeyEvent.VK_LEFT)
                    isLeftPressed = true;
                if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                    isRightPressed = true;
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
//                System.out.println("Released!");
                if (e.getKeyCode() == KeyEvent.VK_UP)
                    isUpPressed = false;
                if (e.getKeyCode() == KeyEvent.VK_DOWN)
                    isDownPressed = false;
                if (e.getKeyCode() == KeyEvent.VK_LEFT)
                    isLeftPressed = false;
                if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                    isRightPressed = false;
            }

        });

        //mouse
    }


}
