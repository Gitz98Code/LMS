package lk.lms.view;

public class home extends javax.swing.JFrame {

    
    public home() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnNewMember = new javax.swing.JButton();
        btnBorrow = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnNewBook = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        lblHomeBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblHead.setForeground(new java.awt.Color(0, 0, 102));
        lblHead.setText("Library Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblHead)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 100));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        btnNewMember.setBackground(new java.awt.Color(102, 102, 255));
        btnNewMember.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNewMember.setForeground(new java.awt.Color(255, 255, 255));
        btnNewMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/member icon.png"))); // NOI18N
        btnNewMember.setText("New Member");
        btnNewMember.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMemberActionPerformed(evt);
            }
        });

        btnBorrow.setBackground(new java.awt.Color(102, 102, 255));
        btnBorrow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBorrow.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/book.png"))); // NOI18N
        btnBorrow.setText("Borrow");
        btnBorrow.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(172, 11, 23));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/exit2.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnNewBook.setBackground(new java.awt.Color(102, 102, 255));
        btnNewBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNewBook.setForeground(new java.awt.Color(255, 255, 255));
        btnNewBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/New book.png"))); // NOI18N
        btnNewBook.setText("New Book");
        btnNewBook.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBookActionPerformed(evt);
            }
        });

        btnReturn.setBackground(new java.awt.Color(102, 102, 255));
        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/return book 2.png"))); // NOI18N
        btnReturn.setText("Return ");
        btnReturn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReturn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrow, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(btnNewMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnNewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 380, 660));

        lblHomeBackground.setBackground(new java.awt.Color(0, 0, 255));
        lblHomeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/home.png"))); // NOI18N
        jPanel1.add(lblHomeBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 990, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMemberActionPerformed
       new newMember().setVisible(true);
    }//GEN-LAST:event_btnNewMemberActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
      setVisible(false);
       new login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBookActionPerformed
         new newBook().setVisible(true);
    }//GEN-LAST:event_btnNewBookActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
       new borrowBooks().setVisible(true);
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
          new returnBook().setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewBook;
    private javax.swing.JButton btnNewMember;
    private javax.swing.JButton btnReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblHomeBackground;
    // End of variables declaration//GEN-END:variables
}
