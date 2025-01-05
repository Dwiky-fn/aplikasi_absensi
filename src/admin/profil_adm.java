package admin;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import utama.koneksi_to_db;
import utama.konstanta;

public class profil_adm extends javax.swing.JFrame {
    private String id = konstanta.ID;
    
    private boolean isEditing = false;
    private String path_foto = null;
    
    public profil_adm() {
        initComponents();
        
        koneksi_to_db.setupDatabaseConnection();
        getDataAdm();
        
        String id = konstanta.ID;
        System.out.println(id);
        
        boolean is = konstanta.isEdit;
        System.out.println(is);
    }

    @SuppressWarnings("unchecked")                                                                                                                
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilih_file_FC = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        foto_lbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nidn_tf = new javax.swing.JTextField();
        nama_tf = new javax.swing.JTextField();
        notlp_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        cancel_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        ubahPass_btn = new javax.swing.JButton();
        pilih_foto_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        simpan_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo Jurusanl.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 67, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Profil Admin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Foto"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foto_lbl.setText(".");
        jPanel2.add(foto_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 18, 110, 160));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Profil"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("NIDN");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, -1));

        jLabel7.setText("No Telepon");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel8.setText("Nama");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jLabel9.setText("E-Mail");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 190, -1));

        nidn_tf.setEditable(false);
        nidn_tf.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.add(nidn_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        nama_tf.setEditable(false);
        nama_tf.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.add(nama_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, -1));

        notlp_tf.setEditable(false);
        notlp_tf.setBackground(new java.awt.Color(255, 255, 204));
        notlp_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notlp_tfActionPerformed(evt);
            }
        });
        jPanel3.add(notlp_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 190, -1));

        email_tf.setEditable(false);
        email_tf.setBackground(new java.awt.Color(255, 255, 204));
        email_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_tfActionPerformed(evt);
            }
        });
        jPanel3.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 190, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 450, 180));

        cancel_btn.setBackground(new java.awt.Color(255, 255, 204));
        cancel_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancel_btn.setText("Tutup");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        getContentPane().add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, 22));

        edit_btn.setBackground(new java.awt.Color(255, 255, 204));
        edit_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        edit_btn.setText("Ubah");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, 22));

        ubahPass_btn.setBackground(new java.awt.Color(255, 255, 204));
        ubahPass_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ubahPass_btn.setText("Ubah Password");
        ubahPass_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahPass_btnActionPerformed(evt);
            }
        });
        getContentPane().add(ubahPass_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, 22));

        pilih_foto_btn.setBackground(new java.awt.Color(255, 255, 204));
        pilih_foto_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pilih_foto_btn.setText("Pilih Foto");
        pilih_foto_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilih_foto_btnActionPerformed(evt);
            }
        });
        getContentPane().add(pilih_foto_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 22));

        jLabel4.setText(".");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 20, 60));

        jLabel2.setText(".");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 10, 30));

        simpan_btn.setBackground(new java.awt.Color(255, 255, 204));
        simpan_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simpan_btn.setText("Simpan");
        simpan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_btnActionPerformed(evt);
            }
        });
        getContentPane().add(simpan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, 22));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Mengambil data mhs
    private void getDataAdm() {
        Connection connection = koneksi_to_db.getConnection();
        if (connection != null) {
            String query = "SELECT id, nama, email, no_telp, foto FROM data_admin WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, id);
                ResultSet rs = statement.executeQuery();
                if (rs.next()) {    
                    // Mengambil data teks
                    nama_tf.setText(rs.getString("nama"));
                    email_tf.setText(rs.getString("email"));
                    notlp_tf.setText(rs.getString("no_telp"));
                    
                    // Mengambil gambar
                    byte[] foto_profil = rs.getBytes("foto");
                    if (foto_profil != null) {
                        ImageIcon imageIcon = new ImageIcon(foto_profil);
                        
                        int width = foto_lbl.getWidth() > 0 ? foto_lbl.getWidth() : 110;
                        int height = foto_lbl.getHeight() > 0 ? foto_lbl.getHeight(): 127;
                        Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                        foto_lbl.setIcon(new ImageIcon(image));
                    }
                } else {
                    System.out.println("Tidak ada data admin ditemukan!");
                }
            } catch (SQLException e) {
                System.out.println("Gagal mengambil data admin!");
                e.printStackTrace();
            }
        } else {
            System.out.println("Koneksi belum diinisialisasi");
        }
    }
    
    private void email_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_tfActionPerformed
    private void notlp_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notlp_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notlp_tfActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        isEditing = true;
        nidn_tf.setEditable(true);
        nama_tf.setEditable(true);
        notlp_tf.setEditable(true);
        email_tf.setEditable(true);
        ubahPass_btn.setVisible(true);
        ubahPass_btn.setVisible(true);
        pilih_foto_btn.setVisible(true);
        simpan_btn.setVisible(true);
        edit_btn.setEnabled(false);
        cancel_btn.setText("Batal");
    }//GEN-LAST:event_edit_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ubahPass_btn.setVisible(false);
        pilih_foto_btn.setVisible(false);
        simpan_btn.setVisible(false);
        edit_btn.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void pilih_foto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilih_foto_btnActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(fc);
        
        File imgfile = fc.getSelectedFile();
        String foto = imgfile.getAbsolutePath();
        this.path_foto = foto;
    }//GEN-LAST:event_pilih_foto_btnActionPerformed

    private void ubahPass_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahPass_btnActionPerformed
//        new mahasiswa.ubah_password().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_ubahPass_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        String getText_btn = cancel_btn.getText();
        if (getText_btn.equals("Tutup")) {
            new admin.MenuUtamaAdmin().setVisible(true);
            this.dispose();
        } else if (getText_btn.equals("Batal")){
            nidn_tf.setEditable(false);
            nama_tf.setEditable(false);
            notlp_tf.setEditable(false);
            email_tf.setEditable(false);
            ubahPass_btn.setVisible(false);
            pilih_foto_btn.setVisible(false);
            edit_btn.setEnabled(true);
            cancel_btn.requestFocus();
            cancel_btn.setText("Tutup");
        }
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void simpan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_btnActionPerformed
        if (isEditing == true){
            String nama = nama_tf.getText();
            String email = email_tf.getText();
            String no_tlp = notlp_tf.getText();
            String path = this.path_foto;
            
            Connection connection = koneksi_to_db.getConnection();
            if(connection != null){
                String update_data = "UPDATE data_admin SET nama = ?, email = ?, no_telp = ?, foto = ? WHERE id = ?";
                try (PreparedStatement state = connection.prepareStatement(update_data)){
                    state.setString(1, nama);
                    state.setString(2, email);
                    state.setString(3, no_tlp);
                    
                    if(path != null && !path.isEmpty()){
                        File file = new File(path);
                        if (!file.exists() || !file.isFile()) {
                            throw new FileNotFoundException("File tidak ditemukan: " + path);
                        }
                        try(FileInputStream fis = new FileInputStream(file)){
                            state.setBinaryStream(4, fis, (int) file.length());
                            state.setString(5, id);
                            state.executeUpdate();
                        } catch (FileNotFoundException e){
                            System.out.println("File tidak ditemukan");
                        } catch (IOException ex) {
                            System.out.println("IO Exceptin");
                        }
                    } else {
                        state.setNull(4, Types.BLOB);
                        state.setString(5, id);
                        state.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(this, "Berhasil Update Data!");
                    nidn_tf.setEditable(false);
                    nama_tf.setEditable(false);
                    notlp_tf.setEditable(false);
                    email_tf.setEditable(false);
                    ubahPass_btn.setVisible(false);
                    pilih_foto_btn.setVisible(false);
                    simpan_btn.setVisible(false);
                    edit_btn.setEnabled(true);
                    cancel_btn.setText("Tutup");
                } catch (SQLException e) {
                    System.out.println("Query error");
                    e.printStackTrace();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(profil_adm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_simpan_btnActionPerformed

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
            java.util.logging.Logger.getLogger(profil_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profil_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profil_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profil_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profil_adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel foto_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nama_tf;
    private javax.swing.JTextField nidn_tf;
    private javax.swing.JTextField notlp_tf;
    private javax.swing.JFileChooser pilih_file_FC;
    private javax.swing.JButton pilih_foto_btn;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JButton ubahPass_btn;
    // End of variables declaration//GEN-END:variables
}
