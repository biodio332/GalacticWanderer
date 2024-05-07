/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game.ui;

import game.gameLogic.pvp;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 *
 * @author Wein
 */
public class CharacterPicking extends javax.swing.JFrame {

    /**
     * Creates new form CharacterPicking
     */
    
    int character1=0;
    int character2=0;
    int confirm=0;
    public CharacterPicking() {
        initComponents();
        this.setResizable(false);
        
        try{
            File fontStyle = new File("src/fonts/8-bit-hud.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT,fontStyle);
            
            Font playerFont = font.deriveFont(28f);
            lblPlayer.setFont(playerFont);

            Font charFont = font.deriveFont(20f);
            lblChar1.setFont(charFont);
            lblChar2.setFont(charFont);
            lblChar3.setFont(charFont);
            lblChar4.setFont(charFont);
            
            Font btnFont = font.deriveFont(26f);
            lblConfirm.setFont(btnFont);
            lblBack.setFont(btnFont);
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        lblChar1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(confirm==0){
                    character1=1;
                    lblChar1.setEnabled(false);
                    lblChar2.setEnabled(true);
                    lblChar3.setEnabled(true);
                    lblChar4.setEnabled(true);
                }else if(confirm==1){
                    character2=1;
                    lblChar1.setEnabled(false);
                    lblChar2.setEnabled(true);
                    lblChar3.setEnabled(true);
                    lblChar4.setEnabled(true);
                }
            }
        }); 
        
        lblChar2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(confirm==0){
                    character1=2;
                    lblChar2.setEnabled(false);
                    lblChar1.setEnabled(true);       
                    lblChar3.setEnabled(true);
                    lblChar4.setEnabled(true);
                }else if(confirm==1){
                    character2=2;
                    lblChar2.setEnabled(false);
                    lblChar1.setEnabled(true);       
                    lblChar3.setEnabled(true);
                    lblChar4.setEnabled(true);
                }
            }
        });
        
        lblChar3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(confirm==0){
                    character1=3;
                    lblChar2.setEnabled(true);
                    lblChar1.setEnabled(true);       
                    lblChar3.setEnabled(false);
                    lblChar4.setEnabled(true);
                }else if(confirm==1){
                    character2=3;
                    lblChar2.setEnabled(true);
                    lblChar1.setEnabled(true);       
                    lblChar3.setEnabled(false);
                    lblChar4.setEnabled(true);
                }
            }
        }); 
        
        lblChar4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(confirm==0){
                    character1=4;
                    lblChar4.setEnabled(false);
                    lblChar2.setEnabled(true);
                    lblChar1.setEnabled(true);       
                    lblChar3.setEnabled(true);
                }else if(confirm==1){
                    character2=4;
                    lblChar4.setEnabled(false);
                    lblChar2.setEnabled(true);
                    lblChar1.setEnabled(true);       
                    lblChar3.setEnabled(true);
                }
            }
        });
        
        lblConfirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            lblPlayer.setText("Player 2");
            confirm++;
            if(confirm==2){
                    //pvp characters = new pvp(character1, character2);
                    new PickBackground(character1,character2).setVisible(true);
                    setVisible(false);
                }
            }
        });
        
        lblBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (confirm==0) {                    
                    CharacterPicking.this.dispose();
                    new PickGamemode().setVisible(true);
                } else if (confirm==1){
                    confirm--;
                    lblPlayer.setText("Player 1");
                }
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        brett = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gabe = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        marga = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        sirKhai = new javax.swing.JLabel();
        lblPlayer = new javax.swing.JLabel();
        lblChar1 = new javax.swing.JLabel();
        lblChar2 = new javax.swing.JLabel();
        lblChar3 = new javax.swing.JLabel();
        lblChar4 = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        charPickbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brett.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(brett, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(brett, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 225, 225));
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        gabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gabe.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 225, 225));
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        marga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marga.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 225, 225));

        sirKhai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sirKhai.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sirKhai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sirKhai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 160, 225, 225));

        lblPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer.setText("Player 1");
        getContentPane().add(lblPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 270, 70));

        lblChar1.setForeground(new java.awt.Color(255, 255, 255));
        lblChar1.setText("Brett");
        getContentPane().add(lblChar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        lblChar2.setForeground(new java.awt.Color(255, 255, 255));
        lblChar2.setText("Gabe");
        getContentPane().add(lblChar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        lblChar3.setForeground(new java.awt.Color(255, 255, 255));
        lblChar3.setText("Migantron");
        getContentPane().add(lblChar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, -1, -1));

        lblChar4.setForeground(new java.awt.Color(255, 255, 255));
        lblChar4.setText("SirKhai");
        getContentPane().add(lblChar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 440, -1, -1));

        lblConfirm.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirm.setText("Confirm");
        getContentPane().add(lblConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, -1, -1));

        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setText("Back");
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, -1, -1));

        charPickbg.setForeground(new java.awt.Color(255, 255, 255));
        charPickbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background/charSelectbg.gif"))); // NOI18N
        charPickbg.setAlignmentY(0.0F);
        getContentPane().add(charPickbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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
            java.util.logging.Logger.getLogger(CharacterPicking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterPicking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterPicking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterPicking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterPicking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brett;
    private javax.swing.JLabel charPickbg;
    private javax.swing.JLabel gabe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblChar1;
    private javax.swing.JLabel lblChar2;
    private javax.swing.JLabel lblChar3;
    private javax.swing.JLabel lblChar4;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JLabel marga;
    private javax.swing.JLabel sirKhai;
    // End of variables declaration//GEN-END:variables
}
