/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientews;

/**
 *
 * @author JuanJo
 */
public class JFrame_Principal extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Principal
     */
    public JFrame_Principal() {
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

        jPanel2 = new javax.swing.JPanel();
        jButton_abrirFormulario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton_enviarExcelWS = new javax.swing.JButton();
        jButton_cargarExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte manual"));
        jPanel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jPanel2.setName(""); // NOI18N

        jButton_abrirFormulario.setBackground(new java.awt.Color(255, 204, 102));
        jButton_abrirFormulario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton_abrirFormulario.setText("Abrir formulario");
        jButton_abrirFormulario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_abrirFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_abrirFormularioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_abrirFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jButton_abrirFormulario)
                .addGap(32, 32, 32))
        );

        jButton_abrirFormulario.getAccessibleContext().setAccessibleParent(jPanel3);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte automático"));
        jPanel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jPanel3.setName(""); // NOI18N

        jButton_enviarExcelWS.setBackground(new java.awt.Color(255, 204, 102));
        jButton_enviarExcelWS.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton_enviarExcelWS.setText("Enviar");
        jButton_enviarExcelWS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_enviarExcelWS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enviarExcelWSActionPerformed(evt);
            }
        });

        jButton_cargarExcel.setBackground(new java.awt.Color(255, 204, 102));
        jButton_cargarExcel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton_cargarExcel.setText("Cargar archivo Excel");
        jButton_cargarExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_cargarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cargarExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_enviarExcelWS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_cargarExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jButton_cargarExcel)
                .addGap(18, 18, 18)
                .addComponent(jButton_enviarExcelWS)
                .addGap(7, 7, 7))
        );

        jButton_enviarExcelWS.getAccessibleContext().setAccessibleName("Enviar");
        jButton_cargarExcel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Reporte manual de cursos");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_abrirFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_abrirFormularioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dialog_formularioCursoCIA user = new Dialog_formularioCursoCIA(this,true);
        user.setVisible(true);
        user.pack();
    }//GEN-LAST:event_jButton_abrirFormularioActionPerformed

    private void jButton_enviarExcelWSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enviarExcelWSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_enviarExcelWSActionPerformed

    private void jButton_cargarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cargarExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cargarExcelActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_abrirFormulario;
    private javax.swing.JButton jButton_cargarExcel;
    private javax.swing.JButton jButton_enviarExcelWS;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}