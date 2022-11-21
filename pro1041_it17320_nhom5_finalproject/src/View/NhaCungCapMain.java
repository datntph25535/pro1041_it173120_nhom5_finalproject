/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.NhaCungCap;
import Service.Interface.NhaCungCapInterface;
import Service.NhaCungCapService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class NhaCungCapMain extends javax.swing.JFrame {

    private NhaCungCapInterface nhaCungCapI;
    private static final String P_EMAIL = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";

    /**
     * Creates new form NhaCungCapMain
     */
    public NhaCungCapMain() {
        initComponents();
        this.nhaCungCapI = new NhaCungCapService();
        this.loadTable();
    }

    private void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblNcc.getModel();

        dtm.setRowCount(0);

        for (NhaCungCap ncc : this.nhaCungCapI.getListNcc()) {
            Object[] rowData = {
                ncc.getId(),
                ncc.getMaNcc(),
                ncc.getTen(),
                ncc.getSdt(),
                ncc.getEmail(),
                ncc.getDiaChi(),
                ncc.getThanhPho(),
                ncc.getQuocGia()};

            dtm.addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtThanhPho = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtQuocgia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNcc = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Mã");

        jLabel3.setText("Email");

        jLabel4.setText("Quốc gia");

        jLabel5.setText("Tên");

        jLabel7.setText("Số điện thoại");

        jLabel8.setText("Thành phố");

        jLabel9.setText("Địa chỉ");

        lblID.setText("_");

        tblNcc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MÃ", "TÊN", "SDT", "EMAIL", "ĐỊA CHỈ", "THÀNH PHỐ", "QUỐC GIA"
            }
        ));
        tblNcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNccMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNcc);

        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblID)
                            .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtTen)
                            .addComponent(txtSdt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(46, 46, 46)
                                .addComponent(txtQuocgia, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txtThanhPho)
                                    .addComponent(txtDiachi)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(btnSua)
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnXoa)
                                .addGap(232, 232, 232))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addGap(60, 60, 60)))))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(lblID)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(txtThanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(txtQuocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnClear)
                    .addComponent(btnXoa)
                    .addComponent(btnThem))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = this.tblNcc.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng cần xóa");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Xác nhận xóa?");
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String idStr = this.tblNcc.getValueAt(row, 0).toString();
        int id = Integer.parseInt(idStr);
        this.nhaCungCapI.delete(idStr);
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = this.tblNcc.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng cần sửa");
            return ;
        }

        NhaCungCap ncc = this.getFormData();
        if (ncc == null) {
            return ;
        }

        this.nhaCungCapI.update(ncc.getId(), ncc);
        this.loadTable();
        this.clearForm();
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        NhaCungCap ncc = this.getFormData();
        if (ncc == null) {
            return ;
        }

        this.nhaCungCapI.insert(ncc);
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblNccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNccMouseClicked
        // TODO add your handling code here:
         int row = this.tblNcc.getSelectedRow();
        
        if (row == -1) {
            return ;
        }
        
        String idStr = this.tblNcc.getValueAt(row, 0).toString();
        String Ma = this.tblNcc.getValueAt(row, 1).toString();
        String ten = this.tblNcc.getValueAt(row, 2).toString();
        String Sdt = this.tblNcc.getValueAt(row, 3).toString();
        String email = this.tblNcc.getValueAt(row, 4).toString();
        String diaChi = this.tblNcc.getValueAt(row, 5).toString();
        String thanhPho = this.tblNcc.getValueAt(row, 6).toString();
        String quocGia = this.tblNcc.getValueAt(row, 7).toString();
        
        this.lblID.setText(idStr);
        this.txtMa.setText(Ma);
        this.txtTen.setText(ten);
        this.txtSdt.setText(Sdt);
        this.txtEmail.setText(email);
        this.txtDiachi.setText(diaChi);
        this.txtThanhPho.setText(thanhPho);
        this.txtQuocgia.setText(quocGia);
    }//GEN-LAST:event_tblNccMouseClicked

    private void clearForm() {
        this.txtMa.setText("");
        this.txtTen.setText("");
        this.txtSdt.setText("");
        this.txtEmail.setText("");
        this.txtDiachi.setText("");
        this.txtThanhPho.setText("");
        this.txtQuocgia.setText("");
        this.lblID.setText("_");
    }

    private NhaCungCap getFormData() {
        String id = lblID.getText().trim();
        String ma = txtMa.getText().trim();
        String ten = txtTen.getText().trim();
        String sdt = txtSdt.getText().trim();
        String email = txtEmail.getText().trim();
        String diaChi = txtDiachi.getText().trim();
        String thanhPho = txtThanhPho.getText().trim();
        String quocGia = txtQuocgia.getText().trim();
        if (ma.length() == 0
                || ten.length() == 0
                || sdt.length() == 0
                || email.length() == 0
                || diaChi.length() == 0
                || thanhPho.length() == 0
                || quocGia.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống");
            return null;
        }
        String REG = "^0[0-9]{9}";
        if (!sdt.matches(REG)) {
            JOptionPane.showMessageDialog(this, "Sai dinh dang Sdt. Nhap lai Sdt !");
            return null;
        }
        Matcher matcher = Pattern.compile(P_EMAIL).matcher(txtEmail.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "email sai định dạng");
            return null;
        }
        NhaCungCap ncc = new NhaCungCap(id,ma,ten,sdt,email,diaChi,thanhPho,quocGia);
        return ncc;
    }

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
            java.util.logging.Logger.getLogger(NhaCungCapMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhaCungCapMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhaCungCapMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhaCungCapMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhaCungCapMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tblNcc;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtQuocgia;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtThanhPho;
    // End of variables declaration//GEN-END:variables
}
