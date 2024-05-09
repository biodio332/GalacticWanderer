/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game.ui;

import game.gameLogic.pvp;
import game.characters.Character;
import game.gameLogic.StoryMode;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 *
 * @author Wein
 */
public class SMCharacterPicking extends javax.swing.JFrame {

    /**
     * Creates new form CharacterPicking
     */
    int char1;//character
    int confirm=0;
    String character;
    public SMCharacterPicking(){
        initComponents();
    }
    public SMCharacterPicking(String Character) {
        initComponents();
        this.setResizable(false);
        this.character=Character;
        try{
            File fontStyle = new File("src/fonts/8-bit-hud.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT,fontStyle);
            
            Font playerFont = font.deriveFont(28f);
            lblPlayer.setFont(playerFont);

            Font charFont = font.deriveFont(20f);
            lblChar1.setFont(charFont);
            lblChar2.setFont(charFont);
            lblChar3.setFont(charFont);
            
            Font btnFont = font.deriveFont(26f);
            lblConfirm.setFont(btnFont);
            lblBack.setFont(btnFont);
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }              
        
        lblConfirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SMCharacterPicking.this.dispose();
                new StoryMode(char1,character).setVisible(true);                       
            }            
        });
        
        lblBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SMCharacterPicking.this.dispose();
                new PickGamemode(character).setVisible(true);
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

        JPBrett = new javax.swing.JPanel();
        JPGabe = new javax.swing.JPanel();
        JPMigan = new javax.swing.JPanel();
        brett = new javax.swing.JLabel();
        gabe = new javax.swing.JLabel();
        migan = new javax.swing.JLabel();
        lblPlayer = new javax.swing.JLabel();
        lblChar1 = new javax.swing.JLabel();
        lblChar2 = new javax.swing.JLabel();
        lblChar3 = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        charPickbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galactic Wanderers");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPBrett.setOpaque(false);
        JPBrett.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPBrettMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPBrettMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPBrettMouseExited(evt);
            }
        });

        javax.swing.GroupLayout JPBrettLayout = new javax.swing.GroupLayout(JPBrett);
        JPBrett.setLayout(JPBrettLayout);
        JPBrettLayout.setHorizontalGroup(
            JPBrettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        JPBrettLayout.setVerticalGroup(
            JPBrettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(JPBrett, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, 280));

        JPGabe.setOpaque(false);
        JPGabe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPGabeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPGabeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPGabeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout JPGabeLayout = new javax.swing.GroupLayout(JPGabe);
        JPGabe.setLayout(JPGabeLayout);
        JPGabeLayout.setHorizontalGroup(
            JPGabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        JPGabeLayout.setVerticalGroup(
            JPGabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(JPGabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 200, 280));

        JPMigan.setOpaque(false);
        JPMigan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPMiganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPMiganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPMiganMouseExited(evt);
            }
        });

        javax.swing.GroupLayout JPMiganLayout = new javax.swing.GroupLayout(JPMigan);
        JPMigan.setLayout(JPMiganLayout);
        JPMiganLayout.setHorizontalGroup(
            JPMiganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        JPMiganLayout.setVerticalGroup(
            JPMiganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(JPMigan, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 200, 280));

        brett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Brett/idle/char-brett.png"))); // NOI18N
        brett.setToolTipText("");
        brett.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brettMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                brettMouseExited(evt);
            }
        });
        getContentPane().add(brett, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 225, 225));

        gabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Gabe/Idle/char-gabe.png"))); // NOI18N
        gabe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gabeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gabeMouseExited(evt);
            }
        });
        getContentPane().add(gabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 225, 225));

        migan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Migantron/Idle/char-migan.png"))); // NOI18N
        migan.setText("jLabel1");
        migan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miganMouseExited(evt);
            }
        });
        getContentPane().add(migan, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 225, 225));

        lblPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer.setText("Player 1");
        getContentPane().add(lblPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 270, 70));

        lblChar1.setForeground(new java.awt.Color(255, 255, 255));
        lblChar1.setText("Brett");
        lblChar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblChar1MouseExited(evt);
            }
        });
        getContentPane().add(lblChar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        lblChar2.setForeground(new java.awt.Color(255, 255, 255));
        lblChar2.setText("Gabe");
        lblChar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblChar2MouseExited(evt);
            }
        });
        getContentPane().add(lblChar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, -1, -1));

        lblChar3.setForeground(new java.awt.Color(255, 255, 255));
        lblChar3.setText("Migantron");
        lblChar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblChar3MouseExited(evt);
            }
        });
        getContentPane().add(lblChar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, -1, -1));

        lblConfirm.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirm.setText("Confirm");
        lblConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConfirmMouseExited(evt);
            }
        });
        getContentPane().add(lblConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, -1, -1));

        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setText("Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, -1, -1));

        charPickbg.setForeground(new java.awt.Color(255, 255, 255));
        charPickbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background/charSelectbg.gif"))); // NOI18N
        charPickbg.setAlignmentY(0.0F);
        getContentPane().add(charPickbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblChar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChar1MouseEntered
    }//GEN-LAST:event_lblChar1MouseEntered

    private void lblChar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChar1MouseExited
    }//GEN-LAST:event_lblChar1MouseExited

    private void lblChar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChar2MouseEntered

    }//GEN-LAST:event_lblChar2MouseEntered

    private void lblChar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChar2MouseExited

    }//GEN-LAST:event_lblChar2MouseExited

    private void lblChar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChar3MouseEntered

    }//GEN-LAST:event_lblChar3MouseEntered

    private void lblChar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChar3MouseExited

    }//GEN-LAST:event_lblChar3MouseExited

    private void lblConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmMouseEntered
        lblConfirm.setForeground(Color.YELLOW); 
    }//GEN-LAST:event_lblConfirmMouseEntered

    private void lblConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmMouseExited
        lblConfirm.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblConfirmMouseExited

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        lblBack.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblBackMouseExited

    private void brettMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brettMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_brettMouseEntered

    private void gabeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gabeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_gabeMouseEntered

    private void miganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miganMouseEntered
        
    }//GEN-LAST:event_miganMouseEntered

    private void brettMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brettMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_brettMouseExited

    private void gabeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gabeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_gabeMouseExited

    private void miganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miganMouseExited
        
    }//GEN-LAST:event_miganMouseExited

    private void JPMiganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPMiganMouseExited
        lblChar3.setForeground(Color.WHITE); 
        migan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Migantron/Idle/char-migan.png")));
    }//GEN-LAST:event_JPMiganMouseExited

    private void JPMiganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPMiganMouseEntered
        lblChar3.setForeground(Color.YELLOW); 
        migan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Migantron/Idle/char-miganIdle-unscreen.gif")));
    }//GEN-LAST:event_JPMiganMouseEntered

    private void JPMiganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPMiganMouseClicked
        if(confirm==0){
            char1=3;
            lblChar3.setEnabled(false);
            lblChar1.setEnabled(true);       
            lblChar2.setEnabled(true);
        }
    }//GEN-LAST:event_JPMiganMouseClicked

    private void JPGabeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPGabeMouseExited
        lblChar2.setForeground(Color.WHITE); 
        gabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Gabe/Idle/char-gabe.png")));
    }//GEN-LAST:event_JPGabeMouseExited

    private void JPGabeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPGabeMouseEntered
        lblChar2.setForeground(Color.YELLOW); 
        gabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Gabe/Idle/char-gabeIdle-unscreen.gif")));
    }//GEN-LAST:event_JPGabeMouseEntered

    private void JPGabeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPGabeMouseClicked
        if(confirm==0){
            char1=2;
            lblChar2.setEnabled(false);
            lblChar1.setEnabled(true);       
            lblChar3.setEnabled(true);
        }
    }//GEN-LAST:event_JPGabeMouseClicked

    private void JPBrettMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBrettMouseExited
        lblChar1.setForeground(Color.WHITE); 
        brett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Brett/Idle/char-brett.png")));
    }//GEN-LAST:event_JPBrettMouseExited

    private void JPBrettMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBrettMouseEntered
        lblChar1.setForeground(Color.YELLOW);
        brett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Brett/Idle/char-brettIdle-unscreen.gif")));
    }//GEN-LAST:event_JPBrettMouseEntered

    private void JPBrettMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBrettMouseClicked
        if(confirm==0){
            char1=1;
            lblChar1.setEnabled(false);
            lblChar2.setEnabled(true);
            lblChar3.setEnabled(true);
        }
    }//GEN-LAST:event_JPBrettMouseClicked

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
            java.util.logging.Logger.getLogger(SMCharacterPicking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SMCharacterPicking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SMCharacterPicking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SMCharacterPicking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SMCharacterPicking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPBrett;
    private javax.swing.JPanel JPGabe;
    private javax.swing.JPanel JPMigan;
    private javax.swing.JLabel brett;
    private javax.swing.JLabel charPickbg;
    private javax.swing.JLabel gabe;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblChar1;
    private javax.swing.JLabel lblChar2;
    private javax.swing.JLabel lblChar3;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JLabel migan;
    // End of variables declaration//GEN-END:variables
}
