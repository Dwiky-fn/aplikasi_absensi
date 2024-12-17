/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mahasiswa;

import java.text.SimpleDateFormat;
import java.util.Date;
import utama.koneksi_to_db;
import java.sql.*;
import utama.konstanta;

/**
 *
 * @author USER
 */
public class DashboardMhs extends javax.swing.JFrame {
    ResultSet rs;
    Statement perintah;
    Connection koneksi;
    private String uid = konstanta.UID;
    
    /**
     * Creates new form DashboardAdmin
     */
    public DashboardMhs() {
        initComponents();
        koneksi_to_db.setupDatabaseConnection();
        try {
            perintah = koneksi_to_db.getConnection().createStatement();
        } catch (Exception e) {
            System.out.println("gagal membuat statement" + e.getMessage());
        }
        updateHadir();
        
//            rs = perintah.executeQuery("SELECT * FROM rekap WHERE uid = '0004040619'");
//            ps = perintah.executeQuery("SELECT nama, nim FROM data_mahasiswa WHERE uid = '0004040619'");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nim_lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama_lbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pilihan_filter_cb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        hadir_lbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        izin_lbl = new javax.swing.JLabel();
        sakit_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        alpa_lbl = new javax.swing.JLabel();
        close_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dashboard Mahasiswa");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo Jurusanl.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 0, 68, 80);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 605, 80));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nim_lbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nim_lbl.setForeground(new java.awt.Color(255, 255, 255));
        nim_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nim_lbl.setText("3203216001");
        jPanel2.add(nim_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/jam.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        nama_lbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nama_lbl.setForeground(new java.awt.Color(255, 255, 255));
        nama_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nama_lbl.setText("Dwiky Juniardi");
        jPanel2.add(nama_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 510, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 0, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(450, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, -1, -1));

        pilihan_filter_cb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pilihan_filter_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Harian", "Mingguan", "Bulanan" }));
        jPanel3.add(pilihan_filter_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 4, 99, -1));

        jLabel4.setText("Hadir");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 37, -1));

        hadir_lbl.setText("0 Hari");
        jPanel3.add(hadir_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 50, 20));

        jLabel8.setText("Sakit");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 29, -1));

        jLabel9.setText("Izin");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        izin_lbl.setText("0 Hari");
        jPanel3.add(izin_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 50, 20));

        sakit_lbl.setText("0 Hari");
        jPanel3.add(sakit_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 50, 20));

        jLabel3.setText("Hari, Tanggal");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel10.setText("Alpa");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 29, -1));

        alpa_lbl.setText("0 Hari");
        jPanel3.add(alpa_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 100));

        close_btn.setBackground(new java.awt.Color(255, 255, 204));
        close_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        close_btn.setText("Tutup");
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        getContentPane().add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 262, 70, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
private void updateHadir() {
    Connection connection = koneksi_to_db.getConnection();
    if (connection == null) {
        System.out.println("Koneksi ke database gagal.");
        return;
    }
    
    String query = "SELECT data_mahasiswa.nama, data_mahasiswa.nim, rekap.jmlh_hadir, rekap.jmlh_izin, rekap.jmlh_sakit, rekap.jmlh_alpa " +
                   "FROM data_mahasiswa JOIN rekap ON data_mahasiswa.uid = rekap.uid WHERE rekap.uid = ?";
    try (PreparedStatement state = connection.prepareStatement(query)) {
        state.setString(1, uid);
        System.out.println("Query SQL: " + query + " dengan UID: " + uid);
        
        rs = state.executeQuery();

        if (rs.next()) {
            nama_lbl.setText(rs.getString("nama"));
            nim_lbl.setText(rs.getString("nim"));
            hadir_lbl.setText(rs.getString("jmlh_hadir") + " Hari");
            izin_lbl.setText(rs.getString("jmlh_izin") + " Hari");
            sakit_lbl.setText(rs.getString("jmlh_sakit") + " Hari");
            alpa_lbl.setText(rs.getString("jmlh_alpa") + " Hari");
            System.out.println("Data berhasil diperbarui.");
        } else {
            System.out.println("Data tidak ditemukan untuk UID: " + uid);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Kesalahan SQL: " + e.getMessage());
        hadir_lbl.setText("Error");
    }
}

    
    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        new mahasiswa.menu_utama_mhs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_close_btnActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardMhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alpa_lbl;
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel hadir_lbl;
    private javax.swing.JLabel izin_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nama_lbl;
    private javax.swing.JLabel nim_lbl;
    private javax.swing.JComboBox<String> pilihan_filter_cb;
    private javax.swing.JLabel sakit_lbl;
    // End of variables declaration//GEN-END:variables
}
