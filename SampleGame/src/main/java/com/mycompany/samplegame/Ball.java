
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ball extends Thread {
    int x,y=30;
    int width;
    int delay;
    Color[] colorList={Color.BLACK,Color.BLUE,Color.GREEN,Color.ORANGE,Color.RED};
    Color color;
    boolean play=true;
    
    public Ball(int width){
        this.width=width;
            Random random =new Random();
            x=random.nextInt(width-50);
            int c = random.nextInt(colorList.length);
            color= colorList[c];
            delay=random.nextInt(480)+20;
    }
    
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, 50, 50);
    }  
    public void run(){
        while(y+10<width-50){
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
            y=y+10;
        }
        play=false;
    }
}

