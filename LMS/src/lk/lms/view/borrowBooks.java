package lk.lms.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.lms.controller.BorrowBookController;

public class borrowBooks extends javax.swing.JFrame {

    public borrowBooks() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblBookImg = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtTotalBooks = new javax.swing.JTextField();
        lblBookId = new javax.swing.JLabel();
        lblReturned = new javax.swing.JLabel();
        lblBorrowed = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        jDateReturn = new com.toedter.calendar.JDateChooser();
        jDateBorrowed = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();
        btnIssue = new javax.swing.JButton();
        txtMemberId = new javax.swing.JTextField();
        lblMemberId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTopic.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTopic.setForeground(new java.awt.Color(0, 0, 102));
        lblTopic.setText("Borrow");
        jPanel2.add(lblTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 399, 72));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1161, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblBookImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/book img.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBookImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBookImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblTotal.setBackground(new java.awt.Color(153, 153, 255));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total Borrowed");
        lblTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTotalBooks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotalBooks.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblBookId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBookId.setText("Book ID");

        lblReturned.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReturned.setText("Date Return");

        lblBorrowed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBorrowed.setText("Date Borrowed");

        txtBookId.setBackground(new java.awt.Color(255, 255, 204));
        txtBookId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookIdActionPerformed(evt);
            }
        });

        jDateReturn.setBackground(new java.awt.Color(255, 255, 204));

        jDateBorrowed.setBackground(new java.awt.Color(255, 255, 204));

        btnSearch.setBackground(new java.awt.Color(204, 204, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/search icon 2.png"))); // NOI18N
        btnSearch.setText("Search By ID");
        btnSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnIssue.setBackground(new java.awt.Color(0, 153, 51));
        btnIssue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIssue.setForeground(new java.awt.Color(255, 255, 255));
        btnIssue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/issue icon.png"))); // NOI18N
        btnIssue.setText("Issue");
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });

        txtMemberId.setBackground(new java.awt.Color(255, 255, 204));
        txtMemberId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberIdActionPerformed(evt);
            }
        });

        lblMemberId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMemberId.setText("Member Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblBorrowed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReturned, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtTotalBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateBorrowed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBookId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemberId)
                                    .addComponent(jDateReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateBorrowed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBorrowed, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReturned, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTotalBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       this.dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookIdActionPerformed

    }//GEN-LAST:event_txtBookIdActionPerformed

    private void txtMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberIdActionPerformed

    }//GEN-LAST:event_txtMemberIdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            int memberId = Integer.parseInt(txtMemberId.getText());
            int count = BorrowBookController.getBorrowedCount(memberId);
            txtTotalBooks.setText(String.valueOf(count));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(borrowBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(borrowBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        try {
            int memberId = Integer.parseInt(txtMemberId.getText());
            String bookId = txtBookId.getText();
            java.sql.Date dateBorrowed = new java.sql.Date(jDateBorrowed.getDate().getTime());
            java.sql.Date dateReturn = new java.sql.Date(jDateReturn.getDate().getTime());
            
            boolean success = BorrowBookController.issueBook(memberId, bookId, dateBorrowed, dateReturn);
            
            if (success) {
                JOptionPane.showMessageDialog(this, "Book issued successfully!");
                clearBorrowBookFields();
            } else {
                JOptionPane.showMessageDialog(this, "Maximum borrowed books reached. Cannot issue more.");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(borrowBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(borrowBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIssueActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borrowBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnSearch;
    private com.toedter.calendar.JDateChooser jDateBorrowed;
    private com.toedter.calendar.JDateChooser jDateReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBookId;
    private javax.swing.JLabel lblBookImg;
    private javax.swing.JLabel lblBorrowed;
    private javax.swing.JLabel lblMemberId;
    private javax.swing.JLabel lblReturned;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JTextField txtTotalBooks;
    // End of variables declaration//GEN-END:variables

     public void clearBorrowBookFields() {
        txtMemberId.setText("");
        txtBookId.setText("");
        jDateBorrowed.setDate(null);
        jDateReturn.setDate(null); 
    }




}

