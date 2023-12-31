/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tranvanhung_dh51703516;

import com.mycompany.tranvanhung_dh51703516.dao.HaiSanDAO;
import com.mycompany.tranvanhung_dh51703516.dao.LoaiHaiSanDAO;
import com.mycompany.tranvanhung_dh51703516.dto.HaiSan;
import com.mycompany.tranvanhung_dh51703516.custom.CustomRenderer;
import com.mycompany.tranvanhung_dh51703516.dto.LoaiHaiSan;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class QuanLyHaiSanMainFrame extends javax.swing.JFrame {

    protected ArrayList dslhs = new ArrayList();

    /**
     * Creates new form QuanLyHaiSanMainFrame
     */
    public QuanLyHaiSanMainFrame() {
        initComponents();

        // Combobox
        LoaiHaiSanDAO lspDAO = new LoaiHaiSanDAO();
        this.dslhs = lspDAO.getListLoaiHaiSan();
        for (int i = 0; i < dslhs.size(); i++) {
            cboxLoai.addItem(dslhs.get(i).toString());
        }

        DrawTable();
    }

    private void DrawTable() {
        // Table
        String[] columnNames = {"MÃ", "TÊN", "XUẤT XỨ", "ĐVT", "TƯƠI SỐNG", "LOẠI"};
        HaiSanDAO hsDAO = new HaiSanDAO();
        ArrayList<HaiSan> dshs = hsDAO.getListHaiSan();
        DefaultTableModel dtm = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return switch (columnIndex) {
                    case 0 ->
                        Integer.class;
                    case 1 ->
                        String.class;
                    case 2 ->
                        String.class;
                    case 3 ->
                        String.class;
                    case 4 ->
                        Boolean.class;
                    case 5 ->
                        String.class;
                    default ->
                        String.class;
                };
            }
        };
        for (HaiSan hs : dshs) {
            Object[] row = {
                hs.getMa(),
                hs.getTen(),
                hs.getDonvitinh(),
                hs.getXuatxu(),
                hs.getTuoisong() > 0,
                hs.getMaloai()
            };
            dtm.addRow(row);
        }

        tblHaiSan.setModel(dtm);
        tblHaiSan.getColumnModel().getColumn(5).setCellRenderer(new CustomRenderer());
    }

    private void ResetInputs() {
        txtMa.setText("");
        txtTen.setText("");
        txtXuatXu.setText("");
        txtDvt.setText("");
        chkTuoiSong.setSelected(false);
        cboxLoai.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHaiSan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboxLoai = new javax.swing.JComboBox<>();
        chkTuoiSong = new javax.swing.JCheckBox();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtXuatXu = new javax.swing.JTextField();
        txtDvt = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ HẢI SẢN");
        jLabel1.setToolTipText("");

        tblHaiSan.getTableHeader().setReorderingAllowed(false);
        tblHaiSan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblHaiSanMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblHaiSan);
        if (tblHaiSan.getColumnModel().getColumnCount() > 0) {
            tblHaiSan.getColumnModel().getColumn(0).setResizable(false);
            tblHaiSan.getColumnModel().getColumn(1).setResizable(false);
            tblHaiSan.getColumnModel().getColumn(2).setResizable(false);
            tblHaiSan.getColumnModel().getColumn(3).setResizable(false);
            tblHaiSan.getColumnModel().getColumn(4).setResizable(false);
            tblHaiSan.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setText("Mã:");

        jLabel4.setText("Xuất xứ:");

        jLabel6.setText("Loại hải sản:");

        jLabel3.setText("Tên:");

        jLabel5.setText("Đơn vị tính:");

        chkTuoiSong.setText("Tươi sống");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        txtMa.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDvt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkTuoiSong)
                        .addGap(0, 265, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTen)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboxLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkTuoiSong))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        String ten = txtTen.getText();
        String xuatXu = txtXuatXu.getText();
        String dvt = txtDvt.getText();
        int tuoiSong = chkTuoiSong.isSelected() ? 1 : 0;

        if (dvt.isEmpty() || xuatXu.isEmpty() || ten.isEmpty()) {
            return;
        }

        int loaiIndex = (int) cboxLoai.getSelectedIndex();
        LoaiHaiSan selectedLoai = (LoaiHaiSan) this.dslhs.get(loaiIndex);
        int maLoai = selectedLoai.getMa();

        HaiSan hs = new HaiSan(0, ten, xuatXu, dvt, tuoiSong, maLoai);

        HaiSanDAO hsDAO = new HaiSanDAO();
        hsDAO.themHaiSan(hs);

        DrawTable();
        ResetInputs();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblHaiSanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHaiSanMousePressed
        // TODO add your handling code here:
        int row = tblHaiSan.getSelectedRow();
        String ma = tblHaiSan.getModel().getValueAt(row, 0) + "";
        String ten = tblHaiSan.getModel().getValueAt(row, 1) + "";
        String xuatXu = tblHaiSan.getModel().getValueAt(row, 2) + "";
        String dvt = tblHaiSan.getModel().getValueAt(row, 3) + "";
        Boolean tuoiSong = (Boolean) tblHaiSan.getModel().getValueAt(row, 4);
        int loaiId = (int) tblHaiSan.getModel().getValueAt(row, 5);

        int loaiIndex = 0;
        for (int i = 0; i < this.dslhs.size(); i++) {
            LoaiHaiSan currentLoai = (LoaiHaiSan) this.dslhs.get(i);
            if (currentLoai.getMa() == loaiId) {
                loaiIndex = i;
                break;
            }
        }

        txtMa.setText(ma);
        txtTen.setText(ten);
        txtXuatXu.setText(xuatXu);
        txtDvt.setText(dvt);
        chkTuoiSong.setSelected(tuoiSong);
        cboxLoai.setSelectedIndex(loaiIndex);
    }//GEN-LAST:event_tblHaiSanMousePressed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int ma = Integer.parseInt(txtMa.getText());
        String ten = txtTen.getText();
        String xuatXu = txtXuatXu.getText();
        String dvt = txtDvt.getText();
        int tuoiSong = chkTuoiSong.isSelected() ? 1 : 0;

        if (ma <= 0 || dvt.isEmpty() || xuatXu.isEmpty() || ten.isEmpty()) {
            return;
        }

        int loaiIndex = (int) cboxLoai.getSelectedIndex();
        LoaiHaiSan selectedLoai = (LoaiHaiSan) this.dslhs.get(loaiIndex);
        int maLoai = selectedLoai.getMa();

        HaiSan hs = new HaiSan(ma, ten, xuatXu, dvt, tuoiSong, maLoai);

        HaiSanDAO hsDAO = new HaiSanDAO();
        hsDAO.suaHaiSan(hs);

        DrawTable();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int ma = Integer.parseInt(txtMa.getText());
        HaiSanDAO hsDAO = new HaiSanDAO();
        hsDAO.xoaHaiSan(ma);

        DrawTable();
        ResetInputs();
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyHaiSanMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHaiSanMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHaiSanMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHaiSanMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHaiSanMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboxLoai;
    private javax.swing.JCheckBox chkTuoiSong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblHaiSan;
    private javax.swing.JTextField txtDvt;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtXuatXu;
    // End of variables declaration//GEN-END:variables
}
