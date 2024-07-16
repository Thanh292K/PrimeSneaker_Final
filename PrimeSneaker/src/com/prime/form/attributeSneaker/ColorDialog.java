
package com.prime.form.attributeSneaker;

import com.prime.main_model.Model_Color;
import com.prime.responsitory.ColorResponsitory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ColorDialog extends javax.swing.JFrame {

    private final ColorResponsitory colorRS = new ColorResponsitory();
    int index;
    DefaultTableModel model = new DefaultTableModel();
    public ColorDialog() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tblColor.getModel();
        loadColorToTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtColorId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtColorName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColor = new javax.swing.JTable();
        btnAddColor = new javax.swing.JButton();
        btnEditColor = new javax.swing.JButton();
        btnClearColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Màu sắc giày");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Màu sắc giày");

        jLabel1.setText("Mã màu sắc");

        txtColorId.setEditable(false);
        txtColorId.setEnabled(false);

        jLabel2.setText("Tên màu sắc");

        tblColor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thuộc tính", "Tên thuộc tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblColor);

        btnAddColor.setText("Thêm");
        btnAddColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddColorActionPerformed(evt);
            }
        });

        btnEditColor.setText("Sửa");
        btnEditColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditColorActionPerformed(evt);
            }
        });

        btnClearColor.setText("Làm mới");
        btnClearColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtColorName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColorId, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddColor)
                        .addGap(67, 67, 67)
                        .addComponent(btnEditColor)
                        .addGap(63, 63, 63)
                        .addComponent(btnClearColor))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddColor, btnClearColor, btnEditColor});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddColor)
                    .addComponent(btnEditColor)
                    .addComponent(btnClearColor))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddColor, btnClearColor, btnEditColor});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddColorActionPerformed
        if (txtColorName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập màu sắc");
            txtColorName.requestFocus();
            return;
        }
        if (txtColorName.getText().trim().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Màu sắc không được nhập số");
            txtColorName.requestFocus();
            return;
        }
        ArrayList<Model_Color> lst = colorRS.getALl();
            for (Model_Color co : lst) {
                if (txtColorName.getText().equals(co.getColor_name())) {
                    JOptionPane.showMessageDialog(this, "Thuộc tính này đã tồn tại");
                    return;
                }
            }
        Model_Color col = readForm();
        if (colorRS.addColor(col) != null) {
            JOptionPane.showMessageDialog(this, "Thêm màu sắc thành công");
            loadColorToTable();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm màu sắc thất bại");
        }
    }//GEN-LAST:event_btnAddColorActionPerformed

    private void btnEditColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditColorActionPerformed
       if (txtColorId.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng Chọn màu sắc cần sửa");            
            return;
        }
        if (txtColorName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập màu sắc");
            txtColorName.requestFocus();
            return;
        }
        if (txtColorName.getText().trim().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Màu sắc không được nhập số");
            txtColorName.requestFocus();
            return;
        }
        ArrayList<Model_Color> lst = colorRS.getALl();
            for (Model_Color co : lst) {
                if (txtColorName.getText().equals(co.getColor_name())) {
                    JOptionPane.showMessageDialog(this, "Thuộc tính này đã tồn tại");
                    return;
                }
            }
        Model_Color col = readForm1();
        if (colorRS.upDateColor(col) != null) {
            JOptionPane.showMessageDialog(this, "Cập nhật màu sắc thành công");
            loadColorToTable();
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật màu sắc thất bại");
        }
    }//GEN-LAST:event_btnEditColorActionPerformed

    private void btnClearColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearColorActionPerformed
        txtColorId.setText("");
        txtColorName.setText("");

    }//GEN-LAST:event_btnClearColorActionPerformed

    private void tblColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColorMouseClicked
        index = tblColor.getSelectedRow();
        showDetail(index);
    }//GEN-LAST:event_tblColorMouseClicked

    
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
            java.util.logging.Logger.getLogger(ColorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ColorDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddColor;
    private javax.swing.JButton btnClearColor;
    private javax.swing.JButton btnEditColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblColor;
    private javax.swing.JTextField txtColorId;
    private javax.swing.JTextField txtColorName;
    // End of variables declaration//GEN-END:variables
    private void loadColorToTable() {
        model.setRowCount(0);
        ArrayList<Model_Color> lst = colorRS.getALl();
        for (Model_Color col : lst) {
            model.addRow(new Object[]{
                col.getColor_id(),
                col.getColor_name()
            });
        }
    }
    
    private Model_Color readForm() {
        Model_Color col = new Model_Color();
        col.setColor_name(txtColorName.getText());
        return col;
    }
    
    private Model_Color readForm1() {
        Model_Color col = new Model_Color();
        col.setColor_name(txtColorName.getText());
        col.setColor_id(Integer.parseInt(txtColorId.getText()));
        return col;
    }
    
    private void showDetail(int index) {
        txtColorId.setText(tblColor.getValueAt(index, 0).toString());
        txtColorName.setText(tblColor.getValueAt(index, 1).toString());
        tblColor.setRowSelectionInterval(index, index);
    }
}
