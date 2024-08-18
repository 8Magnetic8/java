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

public class Game1 extends javax.swing.JFrame implements KeyListener {

    Image image;
    Clip clip;
    int x = 10;
    int y = 640;
    int x2, y2;
    int count = 0;


    public Game1() {
        initComponents();
        setSize(700, 700);
        setTitle("โมเดลเล่นๆl");
        image = Toolkit.getDefaultToolkit().createImage("E:\\004\\1.jpg");
        this.addKeyListener(this);
        createSound();
    }
    public void createBox() {
        Random random = new Random();
        x2 = random.nextInt(getWidth() - 50);
        y2 = random.nextInt(getHeight() - 50);
    }

    public void createSound() {
        try {
            File soundFile = new File("E:\\004\\01.wav"); // ไฟล์เสียง
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip(); // สร้าง Clip
            clip.open(audioIn); // เปิด AudioInputStream กับ Clip
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
//    public void checkCollision(){
//    Rectangle rPlayer = new Rectangle(x, y, 50, 50);
//    Rectangle rBox = new Rectangle(x2, y2, 50, 50);
//    if(rPlayer.intersects(rBox)){
//        System.out.println("Collision");
//        createBox();
//        if (clip != null) {
//            clip.setFramePosition(0); // เริ่มเล่นเสียงจากตำแหน่งเริ่มต้น
//            clip.start(); // เล่นเสียง
//        }
//    }
//}

    public void paint(Graphics g) {
        super.setSize(700, 700);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(image, x, y, 50, 50, this);
        g.setColor(Color.red);
        g.fillRect(x2, y2, 50, 50);
         Font font=new Font("Angsana new", Font.BOLD, 30);
        g.setFont(font);
         g.setColor(Color.BLACK);
         g.drawString("Score:"+ count ,600, 100);
         
         if(count >= 5){
            g.setColor(Color.GRAY);
            g.fillRect(0, 0, super.getWidth(), super.getHeight());
            g.setColor(Color.RED);
            g.setFont(new Font("Angsana new", Font.BOLD, 90));
            g.drawString("THE WINNER",((super.getWidth()-350)/2), (super.getHeight()/2));
        }
    }

    public void checkCollission() {
        Rectangle rPlayer = new Rectangle(x, y, 50, 50);
        Rectangle rBox = new Rectangle(x2, y2, 50, 50);
        if (rPlayer.intersects(rBox)) {
            System.out.println("Collission");
            createBox();
            if (clip != null) {
                clip.setFramePosition(0); // เริ่มเล่นเสียงจากตำแหน่งเริ่มต้น
                clip.start(); // เล่นเสียง
                if (rPlayer.intersects(rBox)) {
                    //System.out.println(count);
                    clip.loop(0);
                    count++;
                    repaint();
                }
            }
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
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game1().setVisible(true);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//         
        //System.out.println(ke.getKeyCode());
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

    private Clip open(AudioInputStrem adioIn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Clip open(AudioInputStream adioIn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
