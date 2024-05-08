/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wein
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        try{
            File fontStyle = new File("src/fonts/8-bit-hud.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT,fontStyle);
            
            Font titleFont = font.deriveFont(44f);
            lblLogin.setFont(titleFont);
            
            Font btnFont = font.deriveFont(20f);
            btnLogin.setFont(btnFont);
            btnRegister.setFont(btnFont);
            btnExit.setFont(btnFont);
            
            Font txtFont = font.deriveFont(12f);
            txtUsername.setFont(txtFont);
            pwdPassword.setFont(txtFont);
        
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnLogin.setForeground(Color.YELLOW); 
            }

            @Override
            public void mouseExited(MouseEvent e) {
                fadeText(btnLogin, Color.WHITE);
            }
            
            
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopfinals", "root", "");

                String username=txtUsername.getText();
                String password=String.valueOf(pwdPassword.getPassword());

                Statement st = con.createStatement();

                String sql = "select * from login where Username='"+username+"' and Password='"+password+"'";
                ResultSet rs = st.executeQuery(sql);

                if(rs.next()){
                    dispose();
                    new Menu().setVisible(true);

                }else{
                    JOptionPane.showMessageDialog(Login.this,"Username or password is wrong or unexisting","Error",JOptionPane.ERROR_MESSAGE);
                    txtUsername.setText("");
                    pwdPassword.setText("");
                }
                con.close();
           }catch(Exception f){
               System.out.println(f.getMessage());
           }
            }
        });
        
        btnRegister.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnRegister.setForeground(Color.YELLOW); 
            }

            @Override
            public void mouseExited(MouseEvent e) {
                fadeText(btnRegister, Color.WHITE);
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                new Register().setVisible(true);
                Login.this.dispose();
            }
        });
        
        btnExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnExit.setForeground(Color.YELLOW); 
            }

            @Override
            public void mouseExited(MouseEvent e) {
                fadeText(btnExit, Color.WHITE);
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                Login.this.dispose();
            }
        });
    }
    
    private void fadeText(JLabel label, Color originalColor) {
        Timer timer = new Timer(10, new ActionListener() {
            float alpha = 1.0f;
            @Override
            public void actionPerformed(ActionEvent e) {
                alpha -= 0.05f;
                if (alpha <= 0.0f) {
                    ((Timer) e.getSource()).stop();
                    label.setForeground(originalColor);
                } else {
                    label.setForeground(new Color(
                            (int) (originalColor.getRed() * alpha + 255 * (1 - alpha)),
                            (int) (originalColor.getGreen() * alpha + 255 * (1 - alpha)),
                            (int) (originalColor.getBlue() * alpha + 255 * (1 - alpha))
                    ));
                }
            }
        });
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Galactic Wanderers");
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        txtUsername.setBackground(new java.awt.Color(0, 0, 0));
        txtUsername.setForeground(new java.awt.Color(153, 255, 255));
        txtUsername.setActionCommand("<Not Set>");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 153, 0)));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 350, 40));
        txtUsername.getAccessibleContext().setAccessibleName("");

        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, -1, -1));

        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, -1, -1));

        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, -1, -1));

        pwdPassword.setBackground(new java.awt.Color(0, 0, 0));
        pwdPassword.setForeground(new java.awt.Color(153, 255, 255));
        pwdPassword.setActionCommand("<Not Set>");
        pwdPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 153, 0)));
        pwdPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(pwdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 350, 40));

        lblBackground.setForeground(new java.awt.Color(153, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background/GWTitleScreen.gif"))); // NOI18N
        lblBackground.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void pwdPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdPasswordActionPerformed
 
//Connection con; //variable for databse connection
//Statement st; //variable for the sql

  
  
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
