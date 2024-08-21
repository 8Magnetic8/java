/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author com4936
 */
public class Bullet extends Thread {

    int x, y;
    int width;
    boolean play;
    Clip clip;

    public Bullet(int width,int x) {
        this.width = width;
        Random random = new Random();
//            y=random.nextInt(width-50);
        y = width - 50;
        this.x=x;
        createSound();
    }
  public void createSound() {
        try {
            File soundFile = new File("D:\\004\\001.wav"); // ไฟล์เสียง
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip(); // สร้าง Clip
            clip.open(audioIn); // เปิด AudioInputStream กับ Clip
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void paint(Graphics g) {
        Color color;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 10, 30);
    }

    public void run() {
        while (y + 10 >= 30) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bullet.class.getName()).log(Level.SEVERE, null, ex);
            }
            y=y-10;
        }
        play = false;
    }
}
