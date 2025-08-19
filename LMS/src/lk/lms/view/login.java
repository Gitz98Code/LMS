
package lk.lms.view;

import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLoginBackground = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        lbldesc = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblIcon2 = new javax.swing.JLabel();
        lblIcon1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblHello = new javax.swing.JLabel();
        chkShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/login.png"))); // NOI18N
        jPanel2.add(lblLoginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 570, 630));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 770));

        lblClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClose.setForeground(new java.awt.Color(102, 102, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setPreferredSize(new java.awt.Dimension(54, 30));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1324, 0, 40, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 30));

        lblTopic.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTopic.setForeground(new java.awt.Color(255, 255, 255));
        lblTopic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTopic.setText("LOGIN");
        jPanel1.add(lblTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 160, 50));

        lbldesc.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbldesc.setForeground(new java.awt.Color(255, 255, 255));
        lbldesc.setText("Hello!  Welcome Back.");
        jPanel1.add(lbldesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 170, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 270, -1));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 270, -1));

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 380, 30));

        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/lock (1).png"))); // NOI18N
        jPanel1.add(lblIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 410, 40, 30));

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/user (1).png"))); // NOI18N
        jPanel1.add(lblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 310, 30, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 380, 30));

        btnLogin.setBackground(new java.awt.Color(51, 0, 153));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 140, 40));

        lblHello.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lms/view/pic/hello.png"))); // NOI18N
        jPanel1.add(lblHello, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 140, 30, 20));

        chkShowPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        chkShowPassword.setForeground(new java.awt.Color(0, 51, 102));
        chkShowPassword.setText("Show Password");
        chkShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(chkShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
     this.dispose();

    }//GEN-LAST:event_lblCloseMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         if(txtUsername.getText().equals("admin")&& txtPassword.getText().equals("admin@123")){
             setVisible(false);
             new home().setVisible(true);
         }else{
         JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
         }
                                         

    }//GEN-LAST:event_btnLoginActionPerformed

    private void chkShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPasswordActionPerformed
        if(chkShowPassword.isSelected()){
         txtPassword.setEchoChar((char)0);
        }else{
        txtPassword.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_chkShowPasswordActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblLoginBackground;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
