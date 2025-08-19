package lk.lms.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;
import lk.lms.controller.ReturnController;
import lk.lms.model.ReturnRecord;
import java.util.List;

public class returnBook extends javax.swing.JFrame {

    public returnBook() {
        initComponents();
        setLocationRelativeTo(null);

        //Row styling 
        tblReturn.setBackground(new Color(173, 216, 230));
        tblReturn.setForeground(Color.BLACK);
        tblReturn.setRowHeight(25);
        tblReturn.setFont(new Font("Segoe UI", Font.BOLD, 14));

        // Header styling
        tblReturn.getTableHeader().setBackground(new Color(0, 51, 102));
        tblReturn.getTableHeader().setForeground(Color.WHITE);
        tblReturn.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));

        // Grid / border styling
        tblReturn.setShowGrid(true);
        tblReturn.setGridColor(new Color(100, 149, 237));
        tblReturn.setIntercellSpacing(new java.awt.Dimension(1, 1));

        // Cell padding with empty border 
        DefaultTableCellRenderer rendererBook = new DefaultTableCellRenderer();
        rendererBook.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        tblReturn.setDefaultRenderer(Object.class, rendererBook);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturn = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        lblMemberId = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        btnReturned = new javax.swing.JButton();
        btnShowAllBorrowed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        lblTopic.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTopic.setForeground(new java.awt.Color(255, 255, 255));
        lblTopic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTopic.setText("Return");

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblClose.setBackground(new java.awt.Color(204, 204, 255));
        lblClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setToolTipText("");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(541, 541, 541)
                .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 556, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));

        tblReturn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Member Id", "Member Name", "Book Id", "Book Name", "Borrow", "Return", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblReturn);

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 51));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/search icon 2.png"))); // NOI18N
        btnSearch.setText("Search ");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblMemberId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMemberId.setForeground(new java.awt.Color(255, 255, 255));
        lblMemberId.setText("SEARCH BY  MEMBER ID-");

        txtMemberId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMemberId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnReturned.setBackground(new java.awt.Color(255, 255, 255));
        btnReturned.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReturned.setForeground(new java.awt.Color(0, 0, 51));
        btnReturned.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/returned.png"))); // NOI18N
        btnReturned.setText("Returned");
        btnReturned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnedActionPerformed(evt);
            }
        });

        btnShowAllBorrowed.setBackground(new java.awt.Color(255, 255, 255));
        btnShowAllBorrowed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnShowAllBorrowed.setForeground(new java.awt.Color(0, 0, 51));
        btnShowAllBorrowed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/show all borrowed.png"))); // NOI18N
        btnShowAllBorrowed.setText("Show All Borrowed Books");
        btnShowAllBorrowed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllBorrowedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnSearch)
                .addContainerGap(808, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnShowAllBorrowed)
                .addGap(44, 44, 44)
                .addComponent(btnReturned, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 112, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReturned, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowAllBorrowed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1320, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
      this.dispose();

    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            int memberId = Integer.parseInt(txtMemberId.getText());
            DefaultTableModel model = ReturnController.getBorrowedBooksByMember(memberId);
            tblReturn.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data!");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReturnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnedActionPerformed
        try {
        int row = tblReturn.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to return!");
            return;
        }

        int borrowId = (int) tblReturn.getValueAt(row, 0); 
        boolean success = ReturnController.returnBook(borrowId);

        if (success) {
            JOptionPane.showMessageDialog(this, "Book returned successfully!");
            btnSearchActionPerformed(null); 
        } else {
            JOptionPane.showMessageDialog(this, "Failed to return book!");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnReturnedActionPerformed

    private void btnShowAllBorrowedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllBorrowedActionPerformed
       try {
        List<ReturnRecord> list = ReturnController.getAllBorrowedRecords();
        
        DefaultTableModel model = (DefaultTableModel) tblReturn.getModel();
        model.setRowCount(0); 

        for (ReturnRecord r : list) {
            model.addRow(new Object[]{
                r.getMemberId(),
                r.getMemberName(),
                r.getBookId(),
                r.getBookName(),
                r.getBorrowDate(),
                r.getReturnDate(),
                r.isReturned() ? "Returned" : "Not Returned"
            });
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading borrowed books.");
    
};
    }//GEN-LAST:event_btnShowAllBorrowedActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturned;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowAllBorrowed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMemberId;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JTable tblReturn;
    private javax.swing.JTextField txtMemberId;
    // End of variables declaration//GEN-END:variables
}
