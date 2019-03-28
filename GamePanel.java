package program;

import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel
{
    BufferedImage backgroundImage, playerImage;
    int playerX=(384-32)/2, playerY=350, bgrX=0, bgrY=-2509;
    public GamePanel()
    {
        backgroundImage = SpriteUtils.loadImage("assets/images/background/0.png");
        playerImage = SpriteUtils.loadImage("assets/images/players/straight/0.png");
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(backgroundImage, bgrX, bgrY, null);
        g.drawImage(playerImage, playerX, playerY, null);
    }
    int paceStraight=7;
    public void runAll()
    {
        //BGR run
        bgrY+=2;
        if (bgrY>0) bgrY=0;

        //Player Move
        int paceDiagonal=5;
        System.out.println(paceDiagonal);
        if (GameWindow.isRightPressed && GameWindow.isLeftPressed)
        {

        }
        else if (GameWindow.isDownPressed && GameWindow.isUpPressed)
        {

        }
        else if (GameWindow.isLeftPressed && GameWindow.isUpPressed)
        {
            playerX-=paceDiagonal;
            playerY-=paceDiagonal;
        }
        else if (GameWindow.isRightPressed && GameWindow.isUpPressed)
        {
            playerX+=paceDiagonal;
            playerY-=paceDiagonal;
        }
        else if (GameWindow.isLeftPressed && GameWindow.isDownPressed)
        {
            playerX-=paceDiagonal;
            playerY+=paceDiagonal;
        }
        else if (GameWindow.isRightPressed && GameWindow.isDownPressed)
        {
            playerX+=paceDiagonal;
            playerY+=paceDiagonal;
        }
        else if (GameWindow.isUpPressed)
            playerY-=paceStraight;
        else if (GameWindow.isDownPressed)
            playerY+=paceStraight;
        else if (GameWindow.isLeftPressed)
            playerX-=paceStraight;
        else if (GameWindow.isRightPressed)
            playerX+=paceStraight;

        if (playerY<0) playerY=0;
        if (playerY>600-48) playerY=600-48;
        if (playerX<0) playerX=0;
        if (playerX>384-32) playerX=384-32;
    }

    public void gameLoop()
    {
        long prevTime = System.currentTimeMillis();
        while (true)
        {
            long currentTime = System.currentTimeMillis();
            if (currentTime-prevTime >= 1000/60)
            {
//                System.out.println(currentTime-prevTime);
//                System.out.println(playerX);
                this.repaint();
                this.runAll();
                prevTime=currentTime;
            }
        }
    }
}
