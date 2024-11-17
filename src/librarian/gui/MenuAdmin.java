package librarian.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import librarian.handlers.LogHandler;
import librarian.utils.User;

/**
 *
 * @author Miltiadis Parcharidis 011873
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuAdmin() {
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

        dialogAbout = new javax.swing.JDialog();
        panelAbout = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        labelImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaAbout = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        returnBookBtn = new javax.swing.JButton();
        insertBookBtn = new javax.swing.JButton();
        insertAuthorBtn = new javax.swing.JButton();
        newUserBtn = new javax.swing.JButton();
        editUserBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        searchBooksBtn = new javax.swing.JButton();
        editAuthorBtn = new javax.swing.JButton();
        lendBookBtn = new javax.swing.JButton();
        labelFullname = new javax.swing.JLabel();
        logBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuViewLog = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();
        menuBooks = new javax.swing.JMenu();
        menuLend = new javax.swing.JMenuItem();
        menuReturn = new javax.swing.JMenuItem();
        menuInsert = new javax.swing.JMenuItem();
        menuSearch = new javax.swing.JMenuItem();
        menuAuthors = new javax.swing.JMenu();
        menuAuthorInsert = new javax.swing.JMenuItem();
        menuViewAuthor = new javax.swing.JMenuItem();
        menuUsers = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        dialogAbout.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        dialogAbout.setTitle("About this app");
        dialogAbout.setBackground(new java.awt.Color(156, 193, 194));
        dialogAbout.setResizable(false);
        dialogAbout.setSize(new java.awt.Dimension(439, 242));

        panelAbout.setBackground(new java.awt.Color(156, 193, 194));
        panelAbout.setPreferredSize(new java.awt.Dimension(427, 230));

        buttonOK.setText("OK");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/external/images/libraryAbout.png"))); // NOI18N
        labelImage.setToolTipText("Library logo");

        jScrollPane2.setHorizontalScrollBar(null);

        textAreaAbout.setEditable(false);
        textAreaAbout.setBackground(new java.awt.Color(156, 193, 194));
        textAreaAbout.setColumns(20);
        textAreaAbout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textAreaAbout.setForeground(new java.awt.Color(140, 112, 104));
        textAreaAbout.setRows(5);
        textAreaAbout.setText("Librarian App\n\nCreated by SoftGen Inc.\n\nversion: 1.41\nRelease date: 01/12/2024");
        textAreaAbout.setToolTipText("About this application");
        textAreaAbout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 210, 216), 3, true));
        textAreaAbout.setMargin(new java.awt.Insets(6, 6, 6, 6));
        textAreaAbout.setSelectedTextColor(new java.awt.Color(201, 210, 216));
        textAreaAbout.setSelectionColor(new java.awt.Color(140, 112, 104));
        jScrollPane2.setViewportView(textAreaAbout);

        javax.swing.GroupLayout panelAboutLayout = new javax.swing.GroupLayout(panelAbout);
        panelAbout.setLayout(panelAboutLayout);
        panelAboutLayout.setHorizontalGroup(
            panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAboutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAboutLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(buttonOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAboutLayout.setVerticalGroup(
            panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonOK)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogAboutLayout = new javax.swing.GroupLayout(dialogAbout.getContentPane());
        dialogAbout.getContentPane().setLayout(dialogAboutLayout);
        dialogAboutLayout.setHorizontalGroup(
            dialogAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogAboutLayout.setVerticalGroup(
            dialogAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(156, 193, 194));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                logoutHandler(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(156, 193, 194));

        returnBookBtn.setText("Return Book");
        returnBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookBtnActionPerformed(evt);
            }
        });

        insertBookBtn.setText("Insert Book");
        insertBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBookBtnActionPerformed(evt);
            }
        });

        insertAuthorBtn.setText("Insert Author");
        insertAuthorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertAuthorBtnActionPerformed(evt);
            }
        });

        newUserBtn.setText("Insert User");
        newUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserBtnActionPerformed(evt);
            }
        });

        editUserBtn.setText("View/Edit User");
        editUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserBtnActionPerformed(evt);
            }
        });

        logOutBtn.setBackground(new java.awt.Color(156, 193, 194));
        logOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logOutBtn.setMnemonic('O');
        logOutBtn.setText("Log Out");
        logOutBtn.setBorder(null);
        logOutBtn.setBorderPainted(false);
        logOutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutBtn.setDisplayedMnemonicIndex(4);
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        searchBooksBtn.setText("Browse Books");
        searchBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBooksBtnActionPerformed(evt);
            }
        });

        editAuthorBtn.setMnemonic('v');
        editAuthorBtn.setText("View/Edit Author");
        editAuthorBtn.setToolTipText("View or Edit Authors");
        editAuthorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAuthorBtnActionPerformed(evt);
            }
        });

        lendBookBtn.setText("Lend a Book");
        lendBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lendBookBtnActionPerformed(evt);
            }
        });

        labelFullname.setText(User.getName() + " " + User.getSurname());
        labelFullname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFullname.setText(User.getName() + " " + User.getSurname());
        labelFullname.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        logBtn.setText("View Log");
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lendBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(insertAuthorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(insertBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(returnBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(editAuthorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(newUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(298, Short.MAX_VALUE)
                    .addComponent(labelFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(logOutBtn)
                    .addGap(21, 21, 21)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lendBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertAuthorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAuthorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logOutBtn)
                        .addComponent(labelFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(501, Short.MAX_VALUE)))
        );

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuFile.setMnemonic('O');
        menuFile.setText("File");
        menuFile.setToolTipText("Actions about the Application");
        menuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileActionPerformed(evt);
            }
        });

        menuViewLog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuViewLog.setMnemonic('g');
        menuViewLog.setText("View Log");
        menuViewLog.setToolTipText("Examine the application log");
        menuViewLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewLogActionPerformed(evt);
            }
        });
        menuFile.add(menuViewLog);

        menuLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuLogout.setText("Logout");
        menuLogout.setToolTipText("Exit safely from the application");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        menuFile.add(menuLogout);

        menuBar.add(menuFile);

        menuBooks.setMnemonic('S');
        menuBooks.setText("Books");
        menuBooks.setToolTipText("Actions about Books");
        menuBooks.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuBooksMenuSelected(evt);
            }
        });
        menuBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuBooksMouseEntered(evt);
            }
        });
        menuBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBooksActionPerformed(evt);
            }
        });

        menuLend.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuLend.setMnemonic('L');
        menuLend.setText("Lend a Book");
        menuLend.setToolTipText("Lend a book to a user");
        menuLend.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                menuLendStateChanged(evt);
            }
        });
        menuLend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuLendMouseEntered(evt);
            }
        });
        menuLend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLendActionPerformed(evt);
            }
        });
        menuBooks.add(menuLend);

        menuReturn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuReturn.setMnemonic('R');
        menuReturn.setText("Return Book");
        menuReturn.setToolTipText("Return a book to the Library");
        menuReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReturnActionPerformed(evt);
            }
        });
        menuBooks.add(menuReturn);

        menuInsert.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuInsert.setMnemonic('I');
        menuInsert.setText("Insert Book");
        menuInsert.setToolTipText("Register a new book to the Library");
        menuInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertActionPerformed(evt);
            }
        });
        menuBooks.add(menuInsert);

        menuSearch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuSearch.setMnemonic('S');
        menuSearch.setText("Browse Books");
        menuSearch.setToolTipText("Find books based on title");
        menuSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSearchActionPerformed(evt);
            }
        });
        menuBooks.add(menuSearch);

        menuBar.add(menuBooks);

        menuAuthors.setText("Authors");
        menuAuthors.setToolTipText("Actions about Authors");

        menuAuthorInsert.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuAuthorInsert.setMnemonic('A');
        menuAuthorInsert.setText("Insert Author");
        menuAuthorInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAuthorInsertActionPerformed(evt);
            }
        });
        menuAuthors.add(menuAuthorInsert);

        menuViewAuthor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuViewAuthor.setMnemonic('V');
        menuViewAuthor.setText("View/Edit Author");
        menuViewAuthor.setToolTipText("View or Edit Authors");
        menuViewAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewAuthorActionPerformed(evt);
            }
        });
        menuAuthors.add(menuViewAuthor);

        menuBar.add(menuAuthors);

        menuUsers.setText("Users");
        menuUsers.setToolTipText("Action about Users");
        menuUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsersActionPerformed(evt);
            }
        });

        menuUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuUser.setMnemonic('U');
        menuUser.setText("Insert User");
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        menuUsers.add(menuUser);

        jMenuItem1.setText("View/Edit User");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuUsers.add(jMenuItem1);

        menuBar.add(menuUsers);

        menuHelp.setText("Help");
        menuHelp.setToolTipText("Find help for issues");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setMnemonic('b');
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuHelp.add(jMenuItem4);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserBtnActionPerformed
        this.setVisible(false);
        InsertUser insUser = new InsertUser();
        insUser.setVisible(true);
    }//GEN-LAST:event_newUserBtnActionPerformed

    private void insertAuthorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertAuthorBtnActionPerformed
        this.setVisible(false);
        InsertAuthor insAuth = new InsertAuthor();
        insAuth.setVisible(true);
    }//GEN-LAST:event_insertAuthorBtnActionPerformed

    private void editUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserBtnActionPerformed
        this.setVisible(false);
        ViewUsers viewUsers = new ViewUsers();
        viewUsers.setVisible(true);
    }//GEN-LAST:event_editUserBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        try {
            LogHandler.insertActivityLog("User " + User.getUserid() + " "
                    + User.getName() + " " + User.getSurname() + " has logged off");
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        Initiator init = new Initiator();
        init.setVisible(true);

    }//GEN-LAST:event_logOutBtnActionPerformed

    private void lendBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lendBookBtnActionPerformed
        this.setVisible(false);
        LendBook lendBook = new LendBook();
        lendBook.setVisible(true);
    }//GEN-LAST:event_lendBookBtnActionPerformed

    private void insertBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBookBtnActionPerformed
        this.setVisible(false);
        InsertBook insertBook = new InsertBook();
        insertBook.setVisible(true);
    }//GEN-LAST:event_insertBookBtnActionPerformed

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        this.setVisible(false);
        ViewLog lendBook = new ViewLog();
        lendBook.setVisible(true);
    }//GEN-LAST:event_logBtnActionPerformed

    private void returnBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookBtnActionPerformed
        this.setVisible(false);
        ReturnBook returnBook = new ReturnBook();
        returnBook.setVisible(true);
    }//GEN-LAST:event_returnBookBtnActionPerformed

    private void searchBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBooksBtnActionPerformed
        this.setVisible(false);
        ViewBooks viewBooks = new ViewBooks();
        viewBooks.setVisible(true);
    }//GEN-LAST:event_searchBooksBtnActionPerformed

    private void editAuthorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAuthorBtnActionPerformed
        this.setVisible(false);
        ViewAuthors viewAuthors = new ViewAuthors();
        viewAuthors.setVisible(true);
    }//GEN-LAST:event_editAuthorBtnActionPerformed

    private void logoutHandler(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_logoutHandler
        try {
            LogHandler.insertActivityLog("User " + User.getUserid() + " "
                    + User.getName() + " " + User.getSurname() + " closed the application");
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_logoutHandler

    private void menuLendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLendActionPerformed
        lendBookBtnActionPerformed(evt);
    }//GEN-LAST:event_menuLendActionPerformed

    private void menuAuthorInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAuthorInsertActionPerformed
        insertAuthorBtnActionPerformed(evt);
    }//GEN-LAST:event_menuAuthorInsertActionPerformed

    private void menuBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBooksMouseEntered

    }//GEN-LAST:event_menuBooksMouseEntered

    private void menuBooksMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuBooksMenuSelected

    }//GEN-LAST:event_menuBooksMenuSelected

    private void menuLendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLendMouseEntered

    }//GEN-LAST:event_menuLendMouseEntered

    private void menuLendStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_menuLendStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLendStateChanged

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dialogAbout.setLocationRelativeTo(this);
        dialogAbout.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        dialogAbout.dispose();
    }//GEN-LAST:event_buttonOKActionPerformed

    private void menuViewLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewLogActionPerformed
        logBtnActionPerformed(evt);
    }//GEN-LAST:event_menuViewLogActionPerformed

    private void menuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileActionPerformed
        logOutBtnActionPerformed(evt);
    }//GEN-LAST:event_menuFileActionPerformed

    private void menuReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReturnActionPerformed
        returnBookBtnActionPerformed(evt);
    }//GEN-LAST:event_menuReturnActionPerformed

    private void menuInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertActionPerformed
        insertBookBtnActionPerformed(evt);
    }//GEN-LAST:event_menuInsertActionPerformed

    private void menuBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBooksActionPerformed
        searchBooksBtnActionPerformed(evt);
    }//GEN-LAST:event_menuBooksActionPerformed

    private void menuViewAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewAuthorActionPerformed
        editAuthorBtnActionPerformed(evt);
    }//GEN-LAST:event_menuViewAuthorActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        newUserBtnActionPerformed(evt);
    }//GEN-LAST:event_menuUserActionPerformed

    private void menuUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsersActionPerformed
        editUserBtnActionPerformed(evt);
    }//GEN-LAST:event_menuUsersActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        logOutBtnActionPerformed(evt);
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSearchActionPerformed
        searchBooksBtnActionPerformed(evt);
    }//GEN-LAST:event_menuSearchActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        editUserBtnActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatLightLaf.setup();
        UIManager.put("Component.hideMnemonics", false);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOK;
    private javax.swing.JDialog dialogAbout;
    private javax.swing.JButton editAuthorBtn;
    private javax.swing.JButton editUserBtn;
    private javax.swing.JButton insertAuthorBtn;
    private javax.swing.JButton insertBookBtn;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFullname;
    private javax.swing.JLabel labelImage;
    private javax.swing.JButton lendBookBtn;
    private javax.swing.JButton logBtn;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JMenuItem menuAuthorInsert;
    private javax.swing.JMenu menuAuthors;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBooks;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuInsert;
    private javax.swing.JMenuItem menuLend;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuReturn;
    private javax.swing.JMenuItem menuSearch;
    private javax.swing.JMenuItem menuUser;
    private javax.swing.JMenu menuUsers;
    private javax.swing.JMenuItem menuViewAuthor;
    private javax.swing.JMenuItem menuViewLog;
    private javax.swing.JButton newUserBtn;
    private javax.swing.JPanel panelAbout;
    private javax.swing.JButton returnBookBtn;
    private javax.swing.JButton searchBooksBtn;
    private javax.swing.JTextArea textAreaAbout;
    // End of variables declaration//GEN-END:variables
}
