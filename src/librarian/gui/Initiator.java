package librarian.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.GridLayout;
import librarian.handlers.UsersHandler;
import librarian.utils.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import librarian.handlers.LogHandler;

/**
 *
 * @author Miltiadis Parcharidis 011873
 */
public class Initiator extends javax.swing.JFrame {

    /**
     * Creates new form initiator
     */
    public Initiator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(new GridLayout(1,2));
        jLabel4 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to our Library");
        setBackground(new java.awt.Color(242, 182, 128));

        jPanel1.setBackground(new java.awt.Color(201, 210, 216));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel4.setText("password");

        loginBtn.setText("Login");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetBtnMouseExited(evt);
            }
        });
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(jPanel1.getBackground());
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please login");

        usernameText.setBorder(null);
        usernameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFocusLost(evt);
            }
        });

        passwordText.setBorder(null);
        passwordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFocusLost(evt);
            }
        });

        jLabel3.setText("email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(resetBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(loginBtn))
                        .addComponent(usernameText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordText, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetBtn)
                    .addComponent(loginBtn))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        usernameText.setText("");
        passwordText.setText("");
        usernameText.requestFocus();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        ResultSet rs = UsersHandler.loginUser(usernameText.getText(), passwordText.getText());
        if (rs != null) {
            try {
                rs.next();
                User.setUserid(rs.getInt(1));
                User.setName(rs.getString(2));
                User.setSurname(rs.getString(3));
                User.setRole(rs.getInt(4));
                LogHandler.insertActivityLog("User " + User.getUserid() + " "
                    + User.getName() + " " + User.getSurname() + " has logged in");
                this.setVisible(false);
                if (User.getRole() == 1) {
                    MenuAdmin menuAdmin = new MenuAdmin();
                    menuAdmin.setVisible(true);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Initiator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void usernameTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFocusGained
        usernameText.setBackground(new java.awt.Color(156,193,194));
    }//GEN-LAST:event_usernameTextFocusGained

    private void usernameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFocusLost
        usernameText.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_usernameTextFocusLost

    private void passwordTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusGained
        passwordText.setBackground(new java.awt.Color(156,193,194));
    }//GEN-LAST:event_passwordTextFocusGained

    private void passwordTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusLost
        passwordText.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_passwordTextFocusLost

    private void resetBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseEntered
        resetBtn.setBackground(new java.awt.Color(156,193,194));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    }//GEN-LAST:event_resetBtnMouseEntered

    private void resetBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseExited
        resetBtn.setBackground(new java.awt.Color(255,255,255));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
    }//GEN-LAST:event_resetBtnMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setBackground(new java.awt.Color(156,193,194));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setBackground(new java.awt.Color(255,255,255));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
    }//GEN-LAST:event_loginBtnMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Initiator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
