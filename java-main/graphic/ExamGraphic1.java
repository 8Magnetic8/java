/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.graphic;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author User
 */
public class ExamGraphic1 extends javax.swing.JFrame {

    /**
     * Creates new form ExamGraphic1
     */
    public ExamGraphic1() {
        initComponents();
        setSize(800,600);
    }
    public void paint(Graphics g){
        g.setColor(Color.white);
 g.fillRect(0,0,getWidth(), getHeight());
  Graphics2D g2d = (Graphics2D) g;
         //Graf
        Font font=new Font("Angsana new", Font.BOLD, 21);
        
        //5,500,000
        g.setFont(font);
       g.setColor(Color.BLACK);
       g.drawString("2561",110, 585);
       g.drawString("5,500,000",10, 525);
       g.drawLine(70, 525, 650, 525);
       g.setColor(Color.GREEN);
       g.fillRect(100, 500+25, 50, 45);
       //6,000,000
       g.setFont(font);
       g.setColor(Color.BLACK);
       g.drawString("2562",170, 585);
       g.drawString("6,000,000",10, 500);
       g.drawString("6,500,000",10, 475);
       g.drawLine(70, 500, 650, 500);
       g.drawLine(70, 475, 650, 475);
       g.setColor(Color.red);
       g.fillRect(160, 500-25, 50, 95);
       //7,500,000
       g.setFont(font);
       g.setColor(Color.BLACK);
       g.drawString("2563",230, 585);
       g.drawString("7,000,000",10, 450);
       g.drawString("7,500,000",10, 425);
       g.drawLine(70, 450, 650, 450);
       g.drawLine(70, 425, 650, 425);
       g.setColor(Color.blue);
       g.fillRect(220, 500-75, 50, 145);
       //8,000,000
       g.setFont(font);
       g.setColor(Color.BLACK);
       g.drawString("2564",290, 585);
       g.drawString("8,000,000",10, 400);
       g.drawString("8,500,000",10, 375);
       g.drawString("9,000,000",10, 350);
       g.drawLine(70, 400, 650, 400);
       g.drawLine(70, 375, 650, 375);
       g.drawLine(70, 350, 650, 350);
       g.setColor(Color.pink);
       g.fillRect(280, 500-150, 50, 220);
       //9,500,000
       g.setFont(font);
       g.setColor(Color.BLACK);
       g.drawString("2565",350, 585);
       g.drawString("9,500,000",10, 325);
       g.drawLine(70, 325, 650, 325);
       g.setColor(Color.orange);
       g.fillRect(340, 500-175, 50, 245);
       //5,000,000
       g.setFont(font);
       g.setColor(Color.BLACK);
       g.drawString("2566",410, 585);
       g.drawString("5,000,000",10, 550);
       g.drawString("0",50, 575);
       g.drawLine(70, 550, 650, 550);
      
       g.setColor(Color.gray);
       g.fillRect(400, 500+50, 50, 20);
       //GrafLine   
       g2d.setColor(Color.red);
       g2d.setStroke(new BasicStroke(5.0f));
       g.drawLine(70, 570, 70, 100);
       g.drawLine(70, 570, 650, 570);     
           
       g.setFont(font);
       g.setColor(Color.BLACK);
       g.drawString("Year", 655, 570);
       g.drawString("Sales", 70, 90);
}
 
    /*g.setColor(Color.RED);
g.fillOval(400, 400, 100, 100);

 g.setColor(Color.BLACK);
 g.fillArc(405, 400, 45, 45, 0, -180);
 g.fillArc(450, 400, 45, 45, 0, -180);
 
 g.setColor(Color.BLUE);
 g.fillRoundRect(400,490, 100, 180, 50, 30);
  g.fillOval(450, 490, 150, 50);
 g.fillOval(300, 490, 150, 50);
 
 g.setColor(Color.darkGray);
  g.fillRoundRect(400,600, 100, 100, 50, 30);*/

 /* // Body
        g.setColor(Color.blue);
        g.fillOval(700, 500, 200, 200);
         // Head
        g.setColor(Color.white);
        g.fillOval(725, 550, 150, 150);
        // Eyes
        g.setColor(Color.white);
        g.fillOval(750, 530, 50, 60);
        g.fillOval(800, 530, 50, 60);
        g.setColor(Color.BLACK);
        g.drawOval(750, 530, 50, 60);
        g.drawOval(800, 530, 50, 60);
        g.setColor(Color.black);
        g.fillOval(770, 540, 20, 30);
        g.fillOval(810, 539, 20, 30);
        
         // Nose
        g.setColor(Color.red);
        g.fillOval(785, 570, 30, 30);
        // Mouth
        g.setColor(Color.black);
        g.drawArc(760, 625, 80, 40, 0, -180);
        g.drawLine(800, 600, 800, 660);
          // Whiskers
        g.drawLine(740, 600, 790, 610);
        g.drawLine(740, 620, 790, 620);
        g.drawLine(740, 640, 790, 630);
        g.drawLine(810, 630, 860, 640);
        g.drawLine(810, 620, 860, 620);
        g.drawLine(810, 610, 860, 600);
        // Bell
        g.setColor(Color.RED);
        g.fillOval(745, 690, 110, 10);
        g.setColor(Color.yellow);
        g.fillOval(785, 690, 30, 30);
        g.setColor(Color.black);
        g.drawLine(815, 705, 805, 705);
        g.drawOval(795, 700, 10, 10);
        g.drawLine(805, 705, 785, 705);*/
       
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GraphicTest in Java");

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
            java.util.logging.Logger.getLogger(ExamGraphic1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamGraphic1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamGraphic1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamGraphic1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamGraphic1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
