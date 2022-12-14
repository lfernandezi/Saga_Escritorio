/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaCompras;


 
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnRecursos = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Ventas.png"))); // NOI18N
        btnVentas.setContentAreaFilled(false);
        btnVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Ventas1.png"))); // NOI18N
        jPanel1.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Almacen.png"))); // NOI18N
        btnAlmacen.setContentAreaFilled(false);
        btnAlmacen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Almacen1.png"))); // NOI18N
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Compras.png"))); // NOI18N
        btnCompras.setContentAreaFilled(false);
        btnCompras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Compras1.png"))); // NOI18N
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        btnRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/RecursosH.png"))); // NOI18N
        btnRecursos.setContentAreaFilled(false);
        btnRecursos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/RecursosH1.png"))); // NOI18N
        jPanel1.add(btnRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 105, 230, 170));

        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Mantenimiento.png"))); // NOI18N
        btnMantenimiento.setContentAreaFilled(false);
        btnMantenimiento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Mantenimiento1.png"))); // NOI18N
        jPanel1.add(btnMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Ayuda.png"))); // NOI18N
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Ayuda1.png"))); // NOI18N
        jPanel1.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Salir.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Salir1.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 220, 170));

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 170, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        // TODO add your handling code here:
        Compras c=new Compras();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnComprasActionPerformed

    /**
     * @param args the command line arguments
     */
    public  void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                String resultado1=""; 
                Login log=new Login();
                 resultado1=log.muestraNombre();
                 lblUsuario.setText(resultado1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnRecursos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
