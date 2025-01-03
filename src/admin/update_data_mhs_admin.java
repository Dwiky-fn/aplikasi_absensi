package admin;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utama.konstanta;

public class update_data_mhs_admin extends javax.swing.JFrame {
    private Connection conn;
    private Statement state;
    
    private String nim = konstanta.NIM;
    
    public update_data_mhs_admin() {
        initComponents();
        connectDatabase();
        
        System.out.println(konstanta.NIM);
        System.out.println(konstanta.isEdit);
    }
    private void connectDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/absensii", "root", "");
            state = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
    private boolean isNimExists(String nim) {
        try {
            String checkNim = "SELECT COUNT(*) FROM data_mahasiswa WHERE nim = ?";
            try (PreparedStatement pst = conn.prepareStatement(checkNim)) {
                pst.setString(1, nim);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    return rs.getInt(1) > 0; // Return true if NIM exists
                }
            }
        } catch (SQLException e) {
            System.out.println("Query Error: " + e.getMessage());
        }
        return false;
    }
    
    private int generateUid() {
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE); // Unique UID
    }

    private void insert() {
        if (konstanta.isEdit == true){
            update();
        } else if (konstanta.isEdit == false){
            try {
                String insert_data = "INSERT INTO data_mahasiswa (uid, nim, nama, prodi, no_telp, email, status, kelas) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pst = conn.prepareStatement(insert_data)) {
                    pst.setString(1, uid_tf.getText());
                    pst.setString(2, nim_tf.getText());
                    pst.setString(3, nama_tf.getText());
                    pst.setString(4, (String) prodi_cb.getSelectedItem());
                    pst.setString(5, no_tlp_TF.getText());
                    pst.setString(6, email_tf.getText());
                    pst.setString(7, (String) status_cb.getSelectedItem());
                    pst.setString(8, kelas_tf.getText());  // Kelas
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                }
            } catch (SQLException e) {
                System.out.println("Query Error: " + e.getMessage());
            }
        }
    }

    private void update() {
        try {
            String update_data = "UPDATE data_mahasiswa SET nama = ?, prodi = ?, no_telp = ?, email = ?, status = ?, kelas = ? WHERE nim = ?";
            try (PreparedStatement pst = conn.prepareStatement(update_data)) {
                pst.setString(1, nama_tf.getText());
                pst.setString(2, (String) prodi_cb.getSelectedItem());
                pst.setString(3, no_tlp_TF.getText());
                pst.setString(4, email_tf.getText());
                pst.setString(5, (String) status_cb.getSelectedItem());
                pst.setString(6, kelas_tf.getText());
                pst.setString(7, nim_tf.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate");
                new admin.mnjemn_mhs_admin().setVisible(true);
                this.dispose();
            }
        } catch (SQLException e) {
            System.out.println("Query Error: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kelas_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        simpan_btn = new javax.swing.JButton();
        batal_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nama_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nim_tf = new javax.swing.JTextField();
        prodi_cb = new javax.swing.JComboBox<>();
        no_tlp_TF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        uid_tf = new javax.swing.JTextField();
        status_cb = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tambah Data Mahasiswa Admin");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Data Mahasiswa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo Jurusanl.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 605, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Kelas");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 62, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Masukkan Data Mahasiswa");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 30));

        kelas_tf.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.add(kelas_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 170, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Status");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 62, -1));

        simpan_btn.setBackground(new java.awt.Color(255, 255, 204));
        simpan_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simpan_btn.setText("Simpan");
        simpan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_btnActionPerformed(evt);
            }
        });
        jPanel2.add(simpan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        batal_btn.setBackground(new java.awt.Color(255, 255, 204));
        batal_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        batal_btn.setText("Batal");
        batal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal_btnActionPerformed(evt);
            }
        });
        jPanel2.add(batal_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nama");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 62, -1));

        nama_tf.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.add(nama_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("NIM");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 62, -1));

        nim_tf.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.add(nim_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, -1));

        prodi_cb.setBackground(new java.awt.Color(255, 255, 204));
        prodi_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIF", "TL", "TRSE" }));
        jPanel2.add(prodi_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, -1));

        no_tlp_TF.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.add(no_tlp_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 170, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("No. Telp");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 62, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("E-Mail");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 62, -1));

        email_tf.setBackground(new java.awt.Color(255, 255, 204));
        email_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_tfActionPerformed(evt);
            }
        });
        jPanel2.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 170, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Prodi");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 62, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("UID");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 62, -1));

        uid_tf.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.add(uid_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, -1));

        status_cb.setBackground(new java.awt.Color(255, 255, 204));
        status_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Tidak Aktif" }));
        jPanel2.add(status_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 170, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 580, 200));

        jLabel10.setText(".");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 246, 20, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void batal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal_btnActionPerformed
        new admin.mnjemn_mhs_admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_batal_btnActionPerformed

    private void simpan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_btnActionPerformed
        if (nama_tf.getText().isEmpty() || nim_tf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama dan NIM wajib diisi!");
            return;
        }

        String nim = nim_tf.getText();
        if (isNimExists(nim)) {
            update();
            new admin.mnjemn_mhs_admin().setVisible(true);
            this.dispose();
        } else {
            insert();
            new admin.mnjemn_mhs_admin().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_simpan_btnActionPerformed

    private void email_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_tfActionPerformed
    }//GEN-LAST:event_email_tfActionPerformed

    private enum Prodi{
        TI,
        TL,
        TRSE
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(konstanta.isEdit == false){
            int uid = generateUid();
            uid_tf.setText(String.valueOf(uid));
        }
        
        int index = 0;
        String status = null;
        try {
            String tampil = "SELECT uid, nama, nim, prodi, kelas, no_telp, email FROM data_mahasiswa WHERE nim = ?";
            try (PreparedStatement pst = conn.prepareStatement(tampil)){
                pst.setString(1, nim);
                ResultSet rs = pst.executeQuery();
                if(rs.next()) {
                    uid_tf.setText(rs.getString("uid"));
                    nama_tf.setText(rs.getString("nama"));
                    nim_tf.setText(rs.getString("nim"));
                    kelas_tf.setText(rs.getString("kelas"));
                    no_tlp_TF.setText(rs.getString("no_telp"));
                    email_tf.setText(rs.getString("email"));
                    // Set nilai prodi berdasarkan database
                    String prodiValue = rs.getString("prodi");
                    for (Prodi prodiEnum : Prodi.values()) {
                        prodi_cb.addItem(prodiEnum.name()); // Tambahkan semua enum ke ComboBox
                    }
                    prodi_cb.setSelectedItem(prodiValue); // Pilih prodi yang sesuai
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } 
        } catch (Exception e){
        }
    }//GEN-LAST:event_formWindowOpened
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
            java.util.logging.Logger.getLogger(update_data_mhs_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_data_mhs_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_data_mhs_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_data_mhs_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_data_mhs_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal_btn;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kelas_tf;
    private javax.swing.JTextField nama_tf;
    private javax.swing.JTextField nim_tf;
    private javax.swing.JTextField no_tlp_TF;
    private javax.swing.JComboBox<String> prodi_cb;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JComboBox<String> status_cb;
    private javax.swing.JTextField uid_tf;
    // End of variables declaration//GEN-END:variables
}
