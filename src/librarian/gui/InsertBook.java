package librarian.gui;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import librarian.handlers.AuthorsHandler;
import librarian.handlers.BookHandler;
import librarian.handlers.PublHouseHandler;
import librarian.handlers.LendHandler;

/**
 *
 * @author Miltiadis Parcharidis 011873
 */
public class InsertBook extends javax.swing.JFrame {

    private ArrayList bookCatiDs = new ArrayList();
    private ArrayList publiDs = new ArrayList();
    private ArrayList lendiDs = new ArrayList();
    private ArrayList authoriDs = new ArrayList();

    /**
     * Creates new form InsertUser
     */
    public InsertBook() {
        initComponents();

        ResultSet rsB = BookHandler.selectBookCategories();
        bookCatCombo.addItem("- Select Category - ");
        bookCatiDs.add("");
        try {
            while (rsB.next()) {
                bookCatiDs.add(rsB.getString(1));
                bookCatCombo.addItem(rsB.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        bookCatCombo.setSelectedIndex(0);

        ResultSet rsA = AuthorsHandler.selectAuthors(0, -1, null); // δείξτους όλους
        int row = 0;

        try {
            while (rsA.next()) {
                jTableAuthors.getModel().setValueAt(rsA.getInt(1), row, 0);
                authoriDs.add(rsA.getInt(1));
                jTableAuthors.getModel().setValueAt(rsA.getString(2), row, 1);
                jTableAuthors.getModel().setValueAt(rsA.getString(3), row, 2);
                jTableAuthors.getModel().setValueAt(rsA.getString(4), row, 3);
                row++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewUsers.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet rsPub = PublHouseHandler.selectPublHouses();

        publHouseCombo.addItem("- Select Publishing House - ");
        publiDs.add("");
        try {
            while (rsPub.next()) {
                publiDs.add(rsPub.getInt(1));
                publHouseCombo.addItem(rsPub.getString(2) + " - founded: " + rsPub.getString(3).substring(0, 4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        publHouseCombo.setSelectedIndex(0);

        ResultSet rsL = LendHandler.selectLendCategories();

        lendCatCombo.addItem("- Select Lend Category - ");
        lendiDs.add("");
        try {
            while (rsL.next()) {
                lendiDs.add(rsL.getInt(1));
                lendCatCombo.addItem(rsL.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        lendCatCombo.setSelectedIndex(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        publDateTxt = new javax.swing.JTextField();
        bookCatCombo = new javax.swing.JComboBox<>();
        resetBtn = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        lendCatCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAuthors = new javax.swing.JTable();
        publHouseCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        stockTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        isbnTxt = new javax.swing.JTextField();
        labelBrowse = new javax.swing.JLabel();
        browseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Insert New Book");

        jLabel2.setText("Title:");

        jLabel3.setText("Category:");

        jLabel4.setText("Authors:");

        jLabel5.setText("Publish Date:");

        jLabel6.setText("Publishing House:");

        jLabel7.setText("Lend Category:");

        publDateTxt.setText("dd/mm/yyyy");
        publDateTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                publDateTxtMouseClicked(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jTableAuthors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "AuthorID", "Name", "Surname", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAuthors);
        if (jTableAuthors.getColumnModel().getColumnCount() > 0) {
            jTableAuthors.getColumnModel().getColumn(0).setResizable(false);
            jTableAuthors.getColumnModel().getColumn(1).setResizable(false);
            jTableAuthors.getColumnModel().getColumn(2).setResizable(false);
            jTableAuthors.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setText("ISBN:");

        jLabel9.setText("Stock:");

        labelBrowse.setText("Image Cover:");

        browseBtn.setText("Browse Image");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelBrowse, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(resetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertBtn)
                        .addContainerGap(343, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(titleTxt)
                                .addComponent(bookCatCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(publDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lendCatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(publHouseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isbnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browseBtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(bookCatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(publDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(publHouseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lendCatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(isbnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBrowse)
                    .addComponent(browseBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn)
                    .addComponent(resetBtn)
                    .addComponent(backBtn))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        titleTxt.setText("");
        bookCatCombo.setSelectedIndex(0);
        publDateTxt.setText("dd/mm/yyyy");
        publHouseCombo.setSelectedIndex(0);
        lendCatCombo.setSelectedIndex(0);
        isbnTxt.setText("");
        stockTxt.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed

        /**
         * bookCatiDs publiDs IMPLEMENTATION lendiDs
         */
        // Prepare values
        String title = titleTxt.getText();
        int bookcat = bookCatCombo.getSelectedIndex();
        int rows[] = jTableAuthors.getSelectedRows();
        int authors[] = new int[rows.length];
        for (int i = 0; i < rows.length; i++) {
            authors[i] = (Integer) authoriDs.get(rows[i]);

        }

        String pubDate = publDateTxt.getText();
        int publisher = publHouseCombo.getSelectedIndex();
        int lendcat = lendCatCombo.getSelectedIndex();
        String isbn = isbnTxt.getText();
        int stock = Integer.parseInt(stockTxt.getText());

        // Execute
        boolean inserted = BookHandler.insertBook(title,
                bookcat, authors, pubDate,
                publisher, lendcat, isbn, stock);

        if (inserted) {
            JOptionPane.showMessageDialog(null, "Book Inserted successfully", "Create New Author", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Book While Inserting Author!", "Create New Author", JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
        }

        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.setVisible(true);
    }//GEN-LAST:event_insertBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void publDateTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publDateTxtMouseClicked
        publDateTxt.setText("");
    }//GEN-LAST:event_publDateTxtMouseClicked

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File src = chooser.getSelectedFile();

        String path = InsertBook.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        try {
            String decodedPath = URLDecoder.decode(path, "UTF-8");
            int countslash = decodedPath.length() - decodedPath.replace("/", "").length();
            countslash -= 2;

            String finalPath = "";
            int counting = 0;
            for (int i = 0; i < decodedPath.length(); i++) {
                finalPath += decodedPath.charAt(i);
                if (decodedPath.charAt(i) == '/') {
                    counting++;
                }
                if (counting == 6) {
                    break;
                }

            }
            finalPath += "src/external/images/bookImages/"+titleTxt.getText()+".jpg";
            File dest = new File(finalPath);
            System.out.println(dest.getPath());
            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException ex) {
            Logger.getLogger(InsertBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_browseBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InsertBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> bookCatCombo;
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JTextField isbnTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAuthors;
    private javax.swing.JLabel labelBrowse;
    private javax.swing.JComboBox<String> lendCatCombo;
    private javax.swing.JTextField publDateTxt;
    private javax.swing.JComboBox<String> publHouseCombo;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField stockTxt;
    private javax.swing.JTextField titleTxt;
    // End of variables declaration//GEN-END:variables
}
