
package admin;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import utama.koneksi_to_db;
import utama.konstanta;

public class mnjemn_mhs_admin extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection koneksi;
    Statement perintah;

    public mnjemn_mhs_admin() {
        initComponents();
        model = (DefaultTableModel)data_tabel.getModel();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Registrasi Berhasil");
            //step2.koneksi
            String url = "jdbc:mysql://localhost/absensii";
            String user = "root";
            String pass = "";
            
            koneksi=DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi ke database berhasil");
            //step3. Create statement
            
            perintah = koneksi.createStatement();
            
            //step 4 : eksekusi query
            
            
        }catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan");
        }catch (SQLException e) {
            System.out.println("Database tidak ditemukan atau query error");
        }
        TampilData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tutup_btn = new javax.swing.JButton();
        UpdateData_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_tabel = new javax.swing.JTable();
        hapus_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manajemen Mahasiswa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo Jurusanl.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 80));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tutup_btn.setBackground(new java.awt.Color(255, 255, 204));
        tutup_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tutup_btn.setText("Tutup");
        tutup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutup_btnActionPerformed(evt);
            }
        });
        jPanel5.add(tutup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 70, -1));

        UpdateData_btn.setBackground(new java.awt.Color(255, 255, 204));
        UpdateData_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateData_btn.setText("Update Data");
        UpdateData_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateData_btnActionPerformed(evt);
            }
        });
        jPanel5.add(UpdateData_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 100, -1));

        data_tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "NIM", "Nama", "Kelas", "Program Studi", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data_tabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        data_tabel.setFocusCycleRoot(true);
        data_tabel.setGridColor(new java.awt.Color(0, 0, 0));
        data_tabel.setSelectionBackground(new java.awt.Color(204, 204, 204));
        data_tabel.setShowGrid(true);
        data_tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_tabelMouseClicked(evt);
            }
        });
        data_tabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                data_tabelKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(data_tabel);
        if (data_tabel.getColumnModel().getColumnCount() > 0) {
            data_tabel.getColumnModel().getColumn(0).setResizable(false);
            data_tabel.getColumnModel().getColumn(0).setPreferredWidth(5);
            data_tabel.getColumnModel().getColumn(1).setResizable(false);
            data_tabel.getColumnModel().getColumn(1).setPreferredWidth(50);
            data_tabel.getColumnModel().getColumn(2).setResizable(false);
            data_tabel.getColumnModel().getColumn(2).setPreferredWidth(80);
            data_tabel.getColumnModel().getColumn(3).setResizable(false);
            data_tabel.getColumnModel().getColumn(4).setResizable(false);
            data_tabel.getColumnModel().getColumn(5).setResizable(false);
        }

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 560, 130));

        hapus_btn.setBackground(new java.awt.Color(255, 255, 204));
        hapus_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hapus_btn.setText("Hapus");
        hapus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_btnActionPerformed(evt);
            }
        });
        jPanel5.add(hapus_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tutup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutup_btnActionPerformed
        new admin.MenuUtamaAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tutup_btnActionPerformed

    private void UpdateData_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateData_btnActionPerformed
        new admin.update_data_mhs_admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateData_btnActionPerformed

    private void data_tabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_data_tabelKeyPressed
        
    }//GEN-LAST:event_data_tabelKeyPressed

    private void data_tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_tabelMouseClicked
        int rowSelected = data_tabel.getSelectedRow();
        int rowCount = data_tabel.getRowCount();
        Object nim = null;
        for (int i = 0; i < rowCount; i++) {
            nim = model.getValueAt(rowSelected, 1);
        }
        konstanta.NIM = (String) nim;
        konstanta.isEdit = true;
        hapus_btn.setVisible(true);
        System.out.println(konstanta.NIM);
        System.out.println(konstanta.isEdit);
        
        if (evt.getClickCount() == 2){
            data_tabel.clearSelection();
            konstanta.NIM = null;
            konstanta.isEdit = false;
            System.out.println(konstanta.NIM);
            System.out.println(konstanta.isEdit);
        }
    }//GEN-LAST:event_data_tabelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hapus_btn.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void hapus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_btnActionPerformed
        if (konstanta.NIM != null) {
            String query_del = "DELETE FROM data_mahasiswa WHERE nim = ?";
            try (PreparedStatement pst = koneksi.prepareStatement(query_del)) {
                pst.setString(1, konstanta.NIM);
                pst.executeUpdate();
                System.out.println("Data berhasil dihapus: NIM " + konstanta.NIM);
            } catch (SQLException e) {
                System.err.println("Kesalahan saat menghapus data: " + e.getMessage());
            }
        } else {
            System.out.println("NIM tidak valid untuk penghapusan");
        }
        TampilData();
    }//GEN-LAST:event_hapus_btnActionPerformed

    private void TampilData() {
        try {
            ResultSet rs = perintah.executeQuery("SELECT * FROM data_mahasiswa");
            model.setRowCount(0); // Hapus data sebelumnya di tabel
            int no = 1; // Inisialisasi nomor
            while (rs.next()) {
                model.addRow(new Object[]{
                    no++, // Kolom No
                    rs.getString("nim"), // Kolom NIM
                    rs.getString("nama"), // Kolom Nama
                    rs.getString("kelas"), // Kolom Kelas
                    rs.getString("prodi"), // Kolom Program Studi
                    rs.getString("status") // Kolom Status
                });
            }
            model.fireTableDataChanged(); // Notifikasi perubahan data ke tabel
        } catch (SQLException e) {
            e.printStackTrace(); // Tampilkan error ke konsol untuk debugging
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mnjemn_mhs_admin().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateData_btn;
    private javax.swing.JTable data_tabel;
    private javax.swing.JButton hapus_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton tutup_btn;
    // End of variables declaration//GEN-END:variables
}
