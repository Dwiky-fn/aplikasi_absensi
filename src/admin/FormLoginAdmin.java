/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import utama.koneksi_to_db;
import utama.konstanta;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class FormLoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FormLoginAdmin
     */
    public FormLoginAdmin() {
        initComponents();
        
        koneksi_to_db.setupDatabaseConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        logojurusan_lbl = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        batal_btn = new javax.swing.JButton();
        password_pf = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        buat_akun_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(730, 253));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selamat Datang");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aplikasi Absensi Jurusan Teknik Elektro");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 40, 730, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 90));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 80, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 80, 25));

        username_tf.setBackground(new java.awt.Color(255, 255, 204));
        username_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_tfFocusLost(evt);
            }
        });
        username_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_tfActionPerformed(evt);
            }
        });
        getContentPane().add(username_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 150, -1));

        logojurusan_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logojurusan_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo Jurusannnn.png"))); // NOI18N
        getContentPane().add(logojurusan_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 440, 140));

        login_btn.setBackground(new java.awt.Color(255, 255, 204));
        login_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        getContentPane().add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        batal_btn.setBackground(new java.awt.Color(255, 255, 204));
        batal_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        batal_btn.setText("Batal");
        batal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal_btnActionPerformed(evt);
            }
        });
        getContentPane().add(batal_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        password_pf.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(password_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 150, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText(".");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 40, 70));

        buat_akun_btn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        buat_akun_btn.setText("Buat akun?");
        buat_akun_btn.setContentAreaFilled(false);
        buat_akun_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buat_akun_btnActionPerformed(evt);
            }
        });
        getContentPane().add(buat_akun_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 80, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void username_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_tfActionPerformed
    }//GEN-LAST:event_username_tfActionPerformed

    private void username_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_tfFocusGained
        if (username_tf.getText().equals("Username")) {
            username_tf.setText("");
        }
    }//GEN-LAST:event_username_tfFocusGained

    private void username_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_tfFocusLost
        if (username_tf.getText().isEmpty()) {
            username_tf.setText("Username");
        }
    }//GEN-LAST:event_username_tfFocusLost

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        Connection connection = koneksi_to_db.getConnection();
        
        String username = username_tf.getText();
        String password = new String(password_pf.getPassword());
        
        if (connection != null){
            String get_infoLog = "SELECT id, password FROM info_login_admin WHERE username = ?";
            try (PreparedStatement state = connection.prepareStatement(get_infoLog)){
                state.setString(1, username);
                ResultSet rs = state.executeQuery();
                
                if(rs.next()) {
                    String pass = rs.getString("password");
                    String id = rs.getString("id");
                    
                    if(password.equals(pass)) {
                        JOptionPane.showMessageDialog(this, "Login berhasil!");
                        konstanta.ID = id;
                        new admin.MenuUtamaAdmin().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Passowrd salah!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Username tidak ditemukan");
                }
            } catch (SQLException e) {
                System.out.println("Query Error" + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void batal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal_btnActionPerformed
        new utama.form_absensi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_batal_btnActionPerformed

    private void buat_akun_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buat_akun_btnActionPerformed
        new admin.buat_akun_admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buat_akun_btnActionPerformed

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
            java.util.logging.Logger.getLogger(FormLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal_btn;
    private javax.swing.JButton buat_akun_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel logojurusan_lbl;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
