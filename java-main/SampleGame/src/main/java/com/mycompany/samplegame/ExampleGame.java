/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.samplegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author User
 */
public class ExampleGame extends javax.swing.JFrame implements KeyListener {

    Color boxColor; // เพิ่มตัวแปรนี้ในคลาส
    Image backgroundImage;
    Image image;
    Clip clip;
    int x = 10;
    int y = 640;
    int x2, y2;
    int score = 0;

    public ExampleGame() {
        initComponents();
        setSize(700, 700);
        setTitle("โมเดลเล่นๆ");
        image = Toolkit.getDefaultToolkit().createImage("E:\\004\\1.jpg");
        backgroundImage = Toolkit.getDefaultToolkit().createImage("E:\\004\\background.jpg"); // เพิ่มเส้นนี้
        this.addKeyListener(this);
        createSound();
    }

    public void createBox() {
        Random random = new Random();
        x2 = random.nextInt(getWidth() - 50);
        y2 = random.nextInt(getHeight() - 50);

        // สุ่มสีสำหรับกล่อง
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        boxColor = new Color(red, green, blue);
    }
//
//    public void paint(Graphics g) {
//        super.setSize(700, 700);
//
//        g.setColor(Color.WHITE);
//        g.fillRect(0, 0, getWidth(), getHeight());
//        g.drawImage(image, x, y, 50, 50, this);
//        g.setColor(boxColor); // ใช้สีที่สุ่มได้ในการวาดกล่อง
//        g.fillRect(x2, y2, 50, 50);
//        Font font = new Font("Angsana new", Font.BOLD, 30);
//        g.setFont(font);
//        g.setColor(Color.BLACK);
//        g.drawString("Score:" + score, 600, 100);
//        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this); // วาดภาพพื้นหลัง
//    }

    public void createSound() {
        try {
            File[] soundFiles = {
                new File("E:\\004\\01.wav"),
                new File("E:\\004\\02.wav"),
                new File("E:\\004\\03.wav")
            };

            Random random = new Random();
            File soundFile = soundFiles[random.nextInt(soundFiles.length)];
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    boolean showCollisionMessage = false;

    public void checkCollission() {
        Rectangle rPlayer = new Rectangle(x, y, 50, 50);
        Rectangle rBox = new Rectangle(x2, y2, 50, 50);
        if (rPlayer.intersects(rBox)) {
            System.out.println("Collision");
            createBox();
            showCollisionMessage = true; // แสดงข้อความการชนกัน
            new java.util.Timer().schedule(new java.util.TimerTask() {
                @Override
                public void run() {
                    showCollisionMessage = false; // ซ่อนข้อความหลังจาก 1 วินาที
                    repaint();
                }
            }, 1000);
            if (clip != null) {
                clip.setFramePosition(0);
                clip.start();
            }
            score++;
            repaint();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(image, x, y, 50, 50, this);
        g.setColor(boxColor);
        g.fillRect(x2, y2, 50, 50);

        Font font = new Font("Angsana new", Font.BOLD, 30);
        g.setFont(font);
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 600, 100);

        if (showCollisionMessage) {
            g.setColor(Color.RED);
            g.setFont(new Font("Angsana new", Font.BOLD, 50));
            g.drawString("Collision!", getWidth() / 2 - 100, getHeight() / 2);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExampleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExampleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExampleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExampleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExampleGame().setVisible(true);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
  
          switch (e.getKeyCode()) {
            case 39:
                if (x < 700) {
                    x = x + 10; // เปลี่ยน x ทีละ 10
                    repaint();
                }
                break;

            case 37:
                if (x > 10) {
                    x = x - 10; // เปลี่ยน x ทีละ 10
                    repaint();
                }
                break;

            case 38:
                if (y > 30) {
                    y = y - 10; // เปลี่ยน y ทีละ 10
                    repaint();
                }
                break;

            case 40:
                if (y < 700) {
                    y = y + 10; // เปลี่ยน y ทีละ 10
                    repaint();
                }
                break;
        }

        checkCollission();
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
