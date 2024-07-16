/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.prime.form.attributeSneaker;

import com.prime.main_model.Model_addNameProduct;
import com.prime.responsitory.TeSPResponsitory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ProductDialog extends javax.swing.JFrame {

    private final TeSPResponsitory trs = new TeSPResponsitory();
    DefaultTableModel model = new DefaultTableModel();
    int index;
    public ProductDialog() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tblProduct.getModel();
        loadDataToTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btnAddProd = new javax.swing.JButton();
        btnEditProd = new javax.swing.JButton();
        btnClearProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tên giày");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sản phẩm giày");

        jLabel1.setText("Mã sản phẩm");

        txtProductId.setEditable(false);
        txtProductId.setEnabled(false);

        jLabel2.setText("Tên sản phẩm");

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        btnAddProd.setText("Thêm");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        btnEditProd.setText("Sửa");
        btnEditProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProdActionPerformed(evt);
            }
        });

        btnClearProd.setText("Làm mới");
        btnClearProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearProdActionPerformed(evt);
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
                        .addComponent(txtProductName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddProd)
                        .addGap(67, 67, 67)
                        .addComponent(btnEditProd)
                        .addGap(63, 63, 63)
                        .addComponent(btnClearProd))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddProd, btnClearProd, btnEditProd});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProd)
                    .addComponent(btnEditProd)
                    .addComponent(btnClearProd))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddProd, btnClearProd, btnEditProd});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
        if (txtProductName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên Sản phẩm");
            txtProductName.requestFocus();
            return;
        }
        ArrayList<Model_addNameProduct> lst = trs.getAll();
            for (Model_addNameProduct co : lst) {
                if (txtProductName.getText().equals(co.getProduct_name())) {
                    JOptionPane.showMessageDialog(this, "Thuộc tính này đã tồn tại");
                    return;
                }
            }
        if (trs.addTenSP(txtProductName.getText()) != null) {
            JOptionPane.showMessageDialog(this, "Thêm SP thành công");
            loadDataToTable();
            index = tblProduct.getRowCount() - 1;
            showDetail(index);
        } else {
            JOptionPane.showMessageDialog(this, "Thêm SP thất bại");
        }
    }//GEN-LAST:event_btnAddProdActionPerformed

    private void btnEditProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProdActionPerformed
        if (txtProductId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn SP cần sửa");
            txtProductId.requestFocus();
            return;
        }
        if (txtProductName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên Sản phẩm");
            txtProductName.requestFocus();
            return;
        }
        ArrayList<Model_addNameProduct> lst = trs.getAll();
            for (Model_addNameProduct co : lst) {
                if (txtProductName.getText().equals(co.getProduct_name())) {
                    JOptionPane.showMessageDialog(this, "Thuộc tính này đã tồn tại");
                    return;
                }
            }
        Model_addNameProduct sm = readForm();
        if (trs.updateTenSP(sm) != null) {
            JOptionPane.showMessageDialog(this, "Update SP thành công");
            loadDataToTable();
            
        } else {
            JOptionPane.showMessageDialog(this, "Updtae SP thất bại");
        }
    }//GEN-LAST:event_btnEditProdActionPerformed

    private void btnClearProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearProdActionPerformed
        txtProductId.setText("");
        txtProductName.setText("");
    }//GEN-LAST:event_btnClearProdActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        index =tblProduct.getSelectedRow();
        showDetail(index);
    }//GEN-LAST:event_tblProductMouseClicked

    
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
            java.util.logging.Logger.getLogger(ProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnClearProd;
    private javax.swing.JButton btnEditProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
    private void loadDataToTable() {
        ArrayList<Model_addNameProduct> lst = trs.getAll();
        model.setRowCount(0);
        for (Model_addNameProduct msneaker : lst) {
            model.addRow(new Object[]{
                msneaker.getProduct_id(),
                msneaker.getProduct_name()
            });
        }
    }

    private void showDetail(int index) {
        txtProductId.setText(tblProduct.getValueAt(index, 0).toString());
        txtProductName.setText(tblProduct.getValueAt(index, 1).toString());
    }

    private Model_addNameProduct readForm() {
        Model_addNameProduct ad = new Model_addNameProduct();
        ad.setProduct_id(Integer.parseInt(txtProductId.getText()));
        ad.setProduct_name(txtProductName.getText());
        return ad;
    }
}
