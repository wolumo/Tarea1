/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.views.panels;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author MSI
 */
public class PnlTemperatura extends javax.swing.JPanel {

    /**
     * Creates new form PnlTemperatura
     */
    public PnlTemperatura() {
        initComponents();
    }

    public JButton getBtnCalc() {
        return BtnCalc;
    }

    public JButton getBtnNew() {
        return BtnNew;
    }

    public JTextField getTxtCelcius() {
        return TxtCelcius;
    }

    public JTextField getTxtFarenheit() {
        return TxtFarenheit;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        BtnCalc = new javax.swing.JButton();
        BtnNew = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtCelcius = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtFarenheit = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(205, 205, 205));
        jPanel1.setMinimumSize(new java.awt.Dimension(157, 42));
        jPanel1.setPreferredSize(new java.awt.Dimension(157, 42));

        BtnCalc.setText("Calcular");
        jPanel1.add(BtnCalc);

        BtnNew.setText("Nuevo");
        BtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNew);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(87, 90));
        jPanel2.setPreferredSize(new java.awt.Dimension(87, 90));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Celcius");
        jLabel1.setMaximumSize(new java.awt.Dimension(58, 16));
        jLabel1.setMinimumSize(new java.awt.Dimension(58, 16));
        jLabel1.setPreferredSize(new java.awt.Dimension(58, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        jPanel2.add(TxtCelcius, gridBagConstraints);

        jLabel3.setText("Farenheit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(jLabel3, gridBagConstraints);

        TxtFarenheit.setPreferredSize(new java.awt.Dimension(15, 24));
        TxtFarenheit.setSelectionEnd(0);
        TxtFarenheit.setSelectionStart(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(TxtFarenheit, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalc;
    private javax.swing.JButton BtnNew;
    private javax.swing.JTextField TxtCelcius;
    private javax.swing.JTextField TxtFarenheit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
