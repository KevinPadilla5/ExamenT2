/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asistencia.Pantallas;

/**
 *
 * @author KEVIN
 */
public class TodasClases extends javax.swing.JFrame {

    /**
     * Creates new form TodasClases
     */
    public TodasClases() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClaseMañana = new javax.swing.JButton();
        btnClaseTarde = new javax.swing.JButton();
        btnClaseNoche = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClaseMañana.setText("ClASE  MAÑANA");
        btnClaseMañana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaseMañanaActionPerformed(evt);
            }
        });

        btnClaseTarde.setText("ClASE  TARDE");
        btnClaseTarde.setActionCommand("ClASE  TARDE");
        btnClaseTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaseTardeActionPerformed(evt);
            }
        });

        btnClaseNoche.setText("ClASE  NOCHE");
        btnClaseNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaseNocheActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("AULAS - ASISTENCIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnClaseMañana, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClaseTarde, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClaseNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(btnClaseMañana, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClaseTarde, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClaseNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClaseMañanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaseMañanaActionPerformed
        ClaseManana clasmanana = new ClaseManana();
        clasmanana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClaseMañanaActionPerformed

    private void btnClaseTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaseTardeActionPerformed
        ClaseTarde clastarde = new ClaseTarde();
        clastarde.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClaseTardeActionPerformed

    private void btnClaseNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaseNocheActionPerformed
        ClaseNoche clasnoche = new ClaseNoche();
        clasnoche.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClaseNocheActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClaseMañana;
    private javax.swing.JButton btnClaseNoche;
    private javax.swing.JButton btnClaseTarde;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
