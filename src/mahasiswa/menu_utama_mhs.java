package mahasiswa;

import javax.swing.JOptionPane;
import utama.konstanta;


public class menu_utama_mhs extends javax.swing.JFrame {
    public menu_utama_mhs() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dashboard_btn = new javax.swing.JButton();
        rekapabsen_btn = new javax.swing.JButton();
        profil_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        logout_btn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama Admin");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        setSize(new java.awt.Dimension(605, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo Jurusanl.png"))); // NOI18N
        jLabel2.setText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Absensi Mahasiswa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 600, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MENU");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 110, -1));

        dashboard_btn.setBackground(new java.awt.Color(255, 255, 204));
        dashboard_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dashboard_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dashboard.png"))); // NOI18N
        dashboard_btn.setText("Dashboard");
        dashboard_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_btnActionPerformed(evt);
            }
        });
        jPanel2.add(dashboard_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 35));

        rekapabsen_btn.setBackground(new java.awt.Color(255, 255, 204));
        rekapabsen_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rekapabsen_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/absensi.png"))); // NOI18N
        rekapabsen_btn.setText("Absensi");
        rekapabsen_btn.setToolTipText("");
        rekapabsen_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekapabsen_btnActionPerformed(evt);
            }
        });
        jPanel2.add(rekapabsen_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 140, 35));

        profil_btn.setBackground(new java.awt.Color(255, 255, 204));
        profil_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profil_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profil.png"))); // NOI18N
        profil_btn.setText("Profil");
        profil_btn.setToolTipText("");
        profil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profil_btnActionPerformed(evt);
            }
        });
        jPanel2.add(profil_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 140, 35));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText(".");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 10, 80));

        logout_btn1.setBackground(new java.awt.Color(255, 255, 204));
        logout_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        logout_btn1.setText("Logout");
        logout_btn1.setToolTipText("");
        logout_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(logout_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 140, 35));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 600, 200));

        jLabel5.setText(".");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 256, -1, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profil_btnActionPerformed
        new mahasiswa.profil_mhs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profil_btnActionPerformed

    private void dashboard_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_btnActionPerformed
        new mahasiswa.DashboardMhs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboard_btnActionPerformed

    private void rekapabsen_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekapabsen_btnActionPerformed
        new mahasiswa.riwayat_absensi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rekapabsen_btnActionPerformed

    private void logout_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn1ActionPerformed
        konstanta.UID = null;
        JOptionPane.showMessageDialog(this, "Berhasil Logout!");
        new utama.form_absensi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu_utama_mhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama_mhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama_mhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama_mhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_utama_mhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout_btn1;
    private javax.swing.JButton profil_btn;
    private javax.swing.JButton rekapabsen_btn;
    // End of variables declaration//GEN-END:variables
}