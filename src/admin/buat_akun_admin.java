/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import utama.koneksi_to_db;

/**
 *
 * @author User
 */
public class buat_akun_admin extends javax.swing.JFrame {
    
    private String nidn;
    /**
     * Creates new form buat_akun_admin
     */
    public buat_akun_admin() {
        initComponents();
        
        koneksi_to_db.setupDatabaseConnection();
        
        Random random = new Random();
        long randomNIDN = 1000000000L + (long) (random.nextDouble() * 9000000000L);
        nidn = String.valueOf(randomNIDN);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        id_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nama_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        noTlp_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        username_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pass_tf = new javax.swing.JTextField();
        regis_tf = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_tf.setBackground(new java.awt.Color(255, 255, 204));
        id_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tfActionPerformed(evt);
            }
        });
        jPanel1.add(id_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        nama_tf.setBackground(new java.awt.Color(255, 255, 204));
        nama_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(nama_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        noTlp_tf.setBackground(new java.awt.Color(255, 255, 204));
        noTlp_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noTlp_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTlp_tfActionPerformed(evt);
            }
        });
        jPanel1.add(noTlp_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("No Telepon");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sudah Punya Akun?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 120, -1));

        login_btn.setBackground(new java.awt.Color(255, 255, 204));
        login_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        email_tf.setBackground(new java.awt.Color(255, 255, 204));
        email_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 180, -1));

        username_tf.setBackground(new java.awt.Color(255, 255, 204));
        username_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_tfActionPerformed(evt);
            }
        });
        jPanel1.add(username_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Username");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        pass_tf.setBackground(new java.awt.Color(255, 255, 204));
        pass_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_tfActionPerformed(evt);
            }
        });
        jPanel1.add(pass_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 180, -1));

        regis_tf.setBackground(new java.awt.Color(255, 255, 204));
        regis_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regis_tf.setText("Register");
        regis_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regis_tfActionPerformed(evt);
            }
        });
        jPanel1.add(regis_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 280));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrasi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        new admin.FormLoginAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_login_btnActionPerformed

    private void id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tfActionPerformed

    private void noTlp_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTlp_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTlp_tfActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Random random = new Random();
        int randomId = 100 + random.nextInt(900);
        id_tf.setText(String.valueOf(randomId));
    }//GEN-LAST:event_formWindowOpened

    private void pass_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_tfActionPerformed

    private void regis_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regis_tfActionPerformed
        insert_info_login();
        insert_data_dosen();
        insert_data_admin();
        JOptionPane.showMessageDialog(this, "Akun berhasil dibuat");
        new admin.FormLoginAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regis_tfActionPerformed

    private void username_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_tfActionPerformed
    }//GEN-LAST:event_username_tfActionPerformed
    
    private void insert_info_login() {
        String id = id_tf.getText();
        String username = username_tf.getText();
        String password = pass_tf.getText();
        
        Connection conn = koneksi_to_db.getConnection();
        if(conn != null) {
            String insert_akun = "INSERT INTO info_login_admin (id, username, password) VALUES (?, ?, ?)";
            try (PreparedStatement pst = conn.prepareStatement(insert_akun)){
                pst.setString(1, id);
                pst.setString(2, username);
                pst.setString(3, password);
                pst.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void insert_data_admin() {
        String id = id_tf.getText();
        String nama = nama_tf.getText();
        String no_telp = noTlp_tf.getText();
        String email = email_tf.getText();
        
        Connection conn = koneksi_to_db.getConnection();
        if(conn != null) {
            String insert_akun = "INSERT INTO data_admin (id, nama, no_telp, email, nidn) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = conn.prepareStatement(insert_akun)){
                pst.setString(1, id);
                pst.setString(2, nama);
                pst.setString(3, no_telp);
                pst.setString(4, email);
                pst.setString(5, nidn);
                pst.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void insert_data_dosen() {
        String nama = nama_tf.getText();
        
        Connection conn = koneksi_to_db.getConnection();
        if(conn != null) {
            String insert_akun = "INSERT INTO dosen (nama, nidn) VALUES (?, ?)";
            try (PreparedStatement pst = conn.prepareStatement(insert_akun)){
                pst.setString(1, nama);
                pst.setString(2, nidn);
                pst.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

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
            java.util.logging.Logger.getLogger(buat_akun_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buat_akun_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buat_akun_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buat_akun_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buat_akun_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_tf;
    private javax.swing.JTextField id_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton login_btn;
    private javax.swing.JTextField nama_tf;
    private javax.swing.JTextField noTlp_tf;
    private javax.swing.JTextField pass_tf;
    private javax.swing.JButton regis_tf;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
