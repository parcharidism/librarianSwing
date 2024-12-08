package librarian.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import librarian.handlers.UsersHandler;
import librarian.utils.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.UIManager;
import librarian.handlers.LogHandler;

/**
 *
 * @author Miltiadis Parcharidis 011873
 */
public class Initiator extends javax.swing.JFrame {

    static Clip clip = null;

    private static void initializeAudio() {
        URI uri = null;
        try {
            uri = Initiator.class.getProtectionDomain().getCodeSource().getLocation().toURI();
        } catch (URISyntaxException ex) {
            Logger.getLogger(Initiator.class.getName()).log(Level.SEVERE, null, ex);
        }
        Path path = Paths.get(uri).getParent().getParent().resolve("src/external/audio/relaxingPiano.wav");

        File audioFile = new File(path.toUri());

        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Initiator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Initiator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Initiator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip.open(audioStream);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Initiator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Initiator.class.getName()).log(Level.SEVERE, null, ex);
        }
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        User.setClip(clip);
    }

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

        dialogWelcome = new javax.swing.JDialog();
        labelWelcome = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        labelImage = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        labelPassword = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        labelUsername = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        labelForgot = new javax.swing.JLabel();
        labelResolution = new javax.swing.JLabel();
        musicBtn = new javax.swing.JButton();

        dialogWelcome.setTitle("Successful login");
        dialogWelcome.setBackground(new java.awt.Color(156, 193, 194));

        labelWelcome.setText("jLabel1");

        javax.swing.GroupLayout dialogWelcomeLayout = new javax.swing.GroupLayout(dialogWelcome.getContentPane());
        dialogWelcome.getContentPane().setLayout(dialogWelcomeLayout);
        dialogWelcomeLayout.setHorizontalGroup(
            dialogWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(dialogWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogWelcomeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelWelcome)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dialogWelcomeLayout.setVerticalGroup(
            dialogWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(dialogWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogWelcomeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelWelcome)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to the Michigan University Library");
        setBackground(new java.awt.Color(242, 182, 128));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jSplitPane1.setDividerLocation(320);
        jSplitPane1.setDividerSize(8);
        jSplitPane1.setEnabled(false);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(690, 520));

        leftPanel.setBackground(new java.awt.Color(190, 132, 81));
        leftPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        leftPanel.setFocusable(false);
        leftPanel.setPreferredSize(new java.awt.Dimension(316, 480));
        leftPanel.setRequestFocusEnabled(false);

        labelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/external/images/library.jpg"))); // NOI18N
        labelImage.setAlignmentY(0.0F);
        labelImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelImage.setIconTextGap(0);
        labelImage.setMaximumSize(new java.awt.Dimension(300, 480));
        labelImage.setMinimumSize(new java.awt.Dimension(300, 480));
        labelImage.setPreferredSize(new java.awt.Dimension(320, 460));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(156, 193, 194));
        rightPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        rightPanel.setPreferredSize(new java.awt.Dimension(316, 480));

        labelPassword.setText("password");

        loginBtn.setMnemonic('L');
        loginBtn.setText("Login");
        loginBtn.setToolTipText("Login to the application");
        loginBtn.setMnemonic(KeyEvent.VK_L);
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

        resetBtn.setMnemonic('C');
        resetBtn.setText("Clear");
        resetBtn.setToolTipText("Clear Fields");
        resetBtn.setMnemonic(KeyEvent.VK_C);
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

        labelLogin.setBackground(rightPanel.getBackground());
        labelLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("Welcome back");

        usernameText.setText("parharidis@gmail.com");
        usernameText.setToolTipText("Type your registered email");
        usernameText.setBorder(null);
        usernameText.setCaretColor(new java.awt.Color(140, 112, 104));
        usernameText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFocusLost(evt);
            }
        });
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        passwordText.setText("123");
        passwordText.setToolTipText("Type your password");
        passwordText.setBorder(null);
        passwordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFocusLost(evt);
            }
        });
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        labelUsername.setText("email");

        labelError.setForeground(new java.awt.Color(193, 81, 135));

        labelForgot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelForgot.setForeground(new java.awt.Color(193, 81, 135));
        labelForgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelResolution.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        labelResolution.setText("Suggested Resolution: 1024x768");

        musicBtn.setMnemonic('M');
        musicBtn.setText("\u25A0");
        if (User.isMusicPlaying()) {
            musicBtn.setText("\u25A0");
        }
        else {
            musicBtn.setText("\u25B6");
        }
        musicBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musicBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musicBtnMouseExited(evt);
            }
        });
        musicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelPassword)
                                    .addComponent(labelUsername))
                                .addGap(18, 18, 18)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rightPanelLayout.createSequentialGroup()
                                        .addComponent(resetBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(loginBtn))
                                    .addComponent(usernameText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordText, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(labelForgot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelResolution)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(musicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(labelLogin)
                .addGap(48, 48, 48)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword))
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetBtn)
                    .addComponent(loginBtn))
                .addGap(19, 19, 19)
                .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelForgot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResolution)
                    .addComponent(musicBtn))
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusLost
        passwordText.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_passwordTextFocusLost

    private void passwordTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusGained
        passwordText.setBackground(new java.awt.Color(201, 210, 216));
    }//GEN-LAST:event_passwordTextFocusGained

    private void usernameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFocusLost
        usernameText.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_usernameTextFocusLost

    private void usernameTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFocusGained
        usernameText.setBackground(new java.awt.Color(201, 210, 216));
    }//GEN-LAST:event_usernameTextFocusGained

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        usernameText.setText("");
        passwordText.setText("");
        usernameText.requestFocus();
        labelError.setText("");
        labelForgot.setText("");
        labelForgot.setBorder(null);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void resetBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseExited
        resetBtn.setBackground(new java.awt.Color(255, 255, 255));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
    }//GEN-LAST:event_resetBtnMouseExited

    private void resetBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseEntered
        resetBtn.setBackground(new java.awt.Color(201, 210, 216));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    }//GEN-LAST:event_resetBtnMouseEntered

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        ResultSet rs = null;
        try {
            rs = UsersHandler.loginUser(usernameText.getText(), passwordText.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Initiator.class.getName()).log(Level.SEVERE, null, ex);
            labelError.setText("Connection Error, try again in a while");
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
        if (rs != null) {
            try {
                if (rs.next()) {
                    User.setUserid(rs.getInt(1));
                    User.setName(rs.getString(2));
                    User.setSurname(rs.getString(3));
                    User.setRole(rs.getInt(4));
                    LogHandler.insertActivityLog("User " + User.getUserid() + " "
                            + User.getName() + " " + User.getSurname() + " has logged in");

                    if (User.getRole() == 1) {
                        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                        MenuAdmin menuAdmin = new MenuAdmin();
                        menuAdmin.setVisible(true);
                        this.setVisible(false);
                    }
                } else {
                    throw new SQLException("wrong credentials");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Initiator.class.getName()).log(Level.SEVERE, null, ex);
                if (ex.getMessage().equals("wrong credentials")) {
                    labelError.setText("Wrong password or user does not exists");
                    labelForgot.setText("Forgot your password?");
                    labelForgot.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
                    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                }
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setBackground(new java.awt.Color(201, 210, 216));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    }//GEN-LAST:event_loginBtnMouseEntered

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        loginBtnActionPerformed(evt);
    }//GEN-LAST:event_usernameTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        loginBtnActionPerformed(evt);
    }//GEN-LAST:event_passwordTextActionPerformed

    private void musicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicBtnActionPerformed
        if (musicBtn.getText().equalsIgnoreCase("\u25B6")) {
            User.playMusic();
            musicBtn.setText("\u25A0");

        } else {
            User.stopMusic();
            musicBtn.setText("\u25B6");
        }
    }//GEN-LAST:event_musicBtnActionPerformed

    private void musicBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicBtnMouseExited
        musicBtn.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_musicBtnMouseExited

    private void musicBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicBtnMouseEntered
        musicBtn.setBackground(new java.awt.Color(201, 210, 216));
        if (musicBtn.getText().equalsIgnoreCase("\u25B6")) {
            musicBtn.setToolTipText("Start the music");
        } else {
            musicBtn.setToolTipText("Stop the music");
        }
    }//GEN-LAST:event_musicBtnMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        initializeAudio();
        User.playMusic();

        UIManager.put("Component.hideMnemonics", false);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Initiator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog dialogWelcome;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelForgot;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelResolution;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton musicBtn;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton resetBtn;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables

    private void stopMusic() {
        clip.stop();
    }
}
