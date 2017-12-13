/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeproducts;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class StoreProductsGUI extends javax.swing.JFrame {

    /**
     * Creates new form StoreProductsGUI
     */
    private ArrayList<Product> products;
    private Product product;
    public StoreProductsGUI() {
        initComponents();
        showBtn.setVisible(false);
        addBtn.setVisible(false);
        batteryTF.setVisible(false);
        batteryLbl.setVisible(false);
        expLbl.setVisible(false);
        expTF.setVisible(false);
        products= new ArrayList<>();
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
        nameTF = new javax.swing.JTextField();
        priceTF = new javax.swing.JTextField();
        descTF = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        expLbl = new javax.swing.JLabel();
        expTF = new javax.swing.JTextField();
        batteryLbl = new javax.swing.JLabel();
        batteryTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        foodCB = new javax.swing.JRadioButton();
        electronicCB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Price:");

        jLabel3.setText("Description:");

        jLabel4.setText("Store Products");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        showBtn.setText("Show Most Recent");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        expLbl.setText("Expiration Date:");

        batteryLbl.setText("Battery Type:");

        batteryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batteryTFActionPerformed(evt);
            }
        });

        jLabel7.setText("Product Type:");

        foodCB.setText("Food");
        foodCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodCBActionPerformed(evt);
            }
        });

        electronicCB.setText("Electronic");
        electronicCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electronicCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(expLbl)
                                    .addComponent(batteryLbl))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(descTF, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addComponent(priceTF)
                                        .addComponent(nameTF))
                                    .addComponent(batteryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel4)
                                        .addGap(51, 51, 51))
                                    .addComponent(showBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(foodCB)
                        .addGap(18, 18, 18)
                        .addComponent(electronicCB)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(foodCB)
                    .addComponent(electronicCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(descTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expLbl)
                    .addComponent(expTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batteryLbl)
                    .addComponent(batteryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showBtn)
                    .addComponent(addBtn))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batteryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batteryTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batteryTFActionPerformed

    private void electronicCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electronicCBActionPerformed
        // TODO add your handling code here:
        showBtn.setVisible(true);
        addBtn.setVisible(true);
        batteryTF.setVisible(true);
        batteryLbl.setVisible(true);
        expLbl.setVisible(false);
        expTF.setVisible(false);
        foodCB.setSelected(false);
    }//GEN-LAST:event_electronicCBActionPerformed

    private void foodCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodCBActionPerformed
        // TODO add your handling code here:
        showBtn.setVisible(true);
        addBtn.setVisible(true);
        batteryTF.setVisible(false);
        batteryLbl.setVisible(false);
        expLbl.setVisible(true);
        expTF.setVisible(true);
        electronicCB.setSelected(false);
    }//GEN-LAST:event_foodCBActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(!foodCB.isSelected() && !electronicCB.isSelected()) {
            JOptionPane.showMessageDialog(null,"Select a product Type");
        } else {
            if (foodCB.isSelected()) {
                product = new FoodProduct(nameTF.getText(), descTF.getText(), Double.parseDouble(priceTF.getText()), expTF.getText());
            } else {
                product = new ElectronicProduct(nameTF.getText(), descTF.getText(), Double.parseDouble(priceTF.getText()), batteryTF.getText());
            }
            products.add(product);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        if (products.size() > 0) {
        Product product = products.get(products.size()-1);
        if (product instanceof FoodProduct) {
           JOptionPane.showMessageDialog(null, "Name: " + product.getName() + "\nprice: " + product.getName() + "\nDesc: " + product.getName() + "\nExp Date: " + ((FoodProduct)product).getExpirationDate()); 
        } else {
            JOptionPane.showMessageDialog(null, "Name: " + product.getName() + "\nprice: " + product.getName() + "\nDesc: " + product.getName() + "\nBattery Type: " + ((ElectronicProduct)product).getBatteryType()); 
        }
        } else {
            JOptionPane.showMessageDialog(null, "No products in stock");
        }
    }//GEN-LAST:event_showBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StoreProductsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreProductsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreProductsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreProductsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreProductsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel batteryLbl;
    private javax.swing.JTextField batteryTF;
    private javax.swing.JTextField descTF;
    private javax.swing.JRadioButton electronicCB;
    private javax.swing.JLabel expLbl;
    private javax.swing.JTextField expTF;
    private javax.swing.JRadioButton foodCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField priceTF;
    private javax.swing.JButton showBtn;
    // End of variables declaration//GEN-END:variables
}