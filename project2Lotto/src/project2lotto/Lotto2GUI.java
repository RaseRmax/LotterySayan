/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2lotto;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author x15022790
 */
public class Lotto2GUI extends JFrame {
    //Declaring Objects
    private JPanel p;
    /*private JLabel LottoLabel;
    private JLabel Plus1Label;
    private JLabel Plus2Label;
    private JLabel GenNumLabel;
    private JLabel UrNumLabel;
    private JLabel WonNumLabel;
    private JTextField Text1;
    private JTextField Text2;
    private JTextField Text3;
    private JTextField Text4;
    private JTextField Text5;
    private JTextField Text6;
    private JTextField Text7;
    private JTextField Text8;
    private JTextField Text9;
    */
    /**
     * Creates new form Lotto2GUI
     */
    public Lotto2GUI() {
        initComponents();
        
        //size and location of JFrame
        setSize(575,900);
        setLocation(10,10);
        //create panel
        p = new JPanel();
        //set panel layout
        p.setLayout(null);
        //set background color of panel
        p.setBackground(Color.ORANGE);
        //add panel to JFrame
        add(p);
        //creating objects
        /*LottoLabel = new JLabel ("Lotto");
        Plus1Label = new JLabel ("Plus 1");
        Plus2Label = new JLabel ("Plus 2");
        */
        //set bounds		 
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Lotto = new javax.swing.JButton();
        Plus1 = new javax.swing.JButton();
        Plus2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("There was a time in universe where people was living in peace.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 250, 480, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("But one day, everything changed.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 280, 260, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Sayans! Gather together! Train hard to become strong enough.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 320, 480, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 102));
        jLabel5.setText("It is your turn, choose the way how you gonna train.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 360, 520, 40);

        Lotto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2lotto/dragonball_z_battle_of_z___icon_by_moonschool-d73v943.png"))); // NOI18N
        Lotto.setText("jButton1");
        Lotto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LottoActionPerformed(evt);
            }
        });
        getContentPane().add(Lotto);
        Lotto.setBounds(20, 490, 160, 90);

        Plus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2lotto/740356168.jpg"))); // NOI18N
        Plus1.setText("jButton1");
        Plus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plus1ActionPerformed(evt);
            }
        });
        getContentPane().add(Plus1);
        Plus1.setBounds(220, 490, 130, 140);

        Plus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2lotto/dragon ball xenoverse_zpsufrdiscs.png"))); // NOI18N
        Plus2.setText("jButton1");
        Plus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plus2ActionPerformed(evt);
            }
        });
        getContentPane().add(Plus2);
        Plus2.setBounds(390, 490, 160, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2lotto/b8afbecaafc99441e96a084971e44324.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(3, 0, 570, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LottoActionPerformed
        LottoGUI lgui = new LottoGUI();
        lgui.setVisible(true);
    }//GEN-LAST:event_LottoActionPerformed

    private void Plus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Plus1ActionPerformed
        LottoPlus1GUI lp1GUI = new LottoPlus1GUI();
        lp1GUI.setVisible(true);
    }//GEN-LAST:event_Plus1ActionPerformed

    private void Plus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Plus2ActionPerformed
        LottoPlus2GUI lp2GUI = new LottoPlus2GUI();
        lp2GUI.setVisible(true);
    }//GEN-LAST:event_Plus2ActionPerformed

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
            java.util.logging.Logger.getLogger(Lotto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lotto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lotto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lotto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lotto2GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lotto;
    private javax.swing.JButton Plus1;
    private javax.swing.JButton Plus2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}