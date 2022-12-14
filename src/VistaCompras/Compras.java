/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaCompras;

import java.awt.BorderLayout;

/**
 *
 * @author Luis
 */
public class Compras extends javax.swing.JFrame {

    /**
     * Creates new form Stock
     * 
     */
    
      
    public Compras() {
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

        pnlPrincipalCompras = new javax.swing.JPanel();
        txtfondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbarProveedor = new javax.swing.JMenu();
        mitemProveedor = new javax.swing.JMenuItem();
        mitemProducto = new javax.swing.JMenuItem();
        mbarDocumentos = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        itemNvoPedido = new javax.swing.JMenuItem();
        itemConsultarPedido = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemRegistrarCotizaciĆ³n = new javax.swing.JMenuItem();
        itemConsultarCotizacion = new javax.swing.JMenuItem();
        mbarOrdenCompra = new javax.swing.JMenu();
        itemCrearOC = new javax.swing.JMenuItem();
        itemConsultarOc = new javax.swing.JMenuItem();
        mbarFacturaCompra = new javax.swing.JMenu();
        itemRegistrarFactura = new javax.swing.JMenuItem();
        itemConsultarFactura = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        txtfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/open.jpg"))); // NOI18N
        txtfondo.setMaximumSize(new java.awt.Dimension(600, 500));
        txtfondo.setMinimumSize(new java.awt.Dimension(600, 500));
        txtfondo.setPreferredSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout pnlPrincipalComprasLayout = new javax.swing.GroupLayout(pnlPrincipalCompras);
        pnlPrincipalCompras.setLayout(pnlPrincipalComprasLayout);
        pnlPrincipalComprasLayout.setHorizontalGroup(
            pnlPrincipalComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlPrincipalComprasLayout.setVerticalGroup(
            pnlPrincipalComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setText("MODULO DE COMPRAS");

        mbarProveedor.setText("Mantenimientos");
        mbarProveedor.setPreferredSize(new java.awt.Dimension(100, 25));
        mbarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbarProveedorActionPerformed(evt);
            }
        });

        mitemProveedor.setText("Proveedor");
        mitemProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemProveedorActionPerformed(evt);
            }
        });
        mbarProveedor.add(mitemProveedor);

        mitemProducto.setText("Producto");
        mitemProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemProductoActionPerformed(evt);
            }
        });
        mbarProveedor.add(mitemProducto);

        jMenuBar1.add(mbarProveedor);

        mbarDocumentos.setText("Documentos");
        mbarDocumentos.setPreferredSize(new java.awt.Dimension(81, 25));

        jMenu1.setText("Pedidos de Compras");

        itemNvoPedido.setText("Cabecera");
        itemNvoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNvoPedidoActionPerformed(evt);
            }
        });
        jMenu1.add(itemNvoPedido);

        itemConsultarPedido.setText("Detalle");
        itemConsultarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarPedidoActionPerformed(evt);
            }
        });
        jMenu1.add(itemConsultarPedido);

        mbarDocumentos.add(jMenu1);

        jMenu4.setText("Cotizaciones");

        itemRegistrarCotizaciĆ³n.setText("Registrar CotizaciĆ³n");
        itemRegistrarCotizaciĆ³n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarCotizaciĆ³nActionPerformed(evt);
            }
        });
        jMenu4.add(itemRegistrarCotizaciĆ³n);

        itemConsultarCotizacion.setText("Consultar CotizaciĆ³n");
        itemConsultarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarCotizacionActionPerformed(evt);
            }
        });
        jMenu4.add(itemConsultarCotizacion);

        mbarDocumentos.add(jMenu4);

        mbarOrdenCompra.setText("Ćrdenes de Compra");

        itemCrearOC.setText("Crear OC");
        itemCrearOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearOCActionPerformed(evt);
            }
        });
        mbarOrdenCompra.add(itemCrearOC);

        itemConsultarOc.setText("Consultar OC");
        itemConsultarOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarOcActionPerformed(evt);
            }
        });
        mbarOrdenCompra.add(itemConsultarOc);

        mbarDocumentos.add(mbarOrdenCompra);

        mbarFacturaCompra.setText("Facturas de Compra");

        itemRegistrarFactura.setText("Registrar Factura");
        itemRegistrarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarFacturaActionPerformed(evt);
            }
        });
        mbarFacturaCompra.add(itemRegistrarFactura);

        itemConsultarFactura.setText("Consultar Factura");
        itemConsultarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarFacturaActionPerformed(evt);
            }
        });
        mbarFacturaCompra.add(itemConsultarFactura);

        mbarDocumentos.add(mbarFacturaCompra);

        jMenuBar1.add(mbarDocumentos);

        jMenu2.setText("Ayuda");
        jMenu2.setPreferredSize(new java.awt.Dimension(47, 25));
        jMenuBar1.add(jMenu2);

        menuVolver.setText("Volver a MenĆŗ");
        menuVolver.setPreferredSize(new java.awt.Dimension(89, 25));
        menuVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVolverMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVolver);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPrincipalCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
                
                
    }//GEN-LAST:event_formMousePressed

    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        // TODO add your handling code here:
        Menu prin = new Menu();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuVolverMouseClicked

    private void mbarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbarProveedorActionPerformed

    private void mitemProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemProveedorActionPerformed
        // TODO add your handling code here:
        FrmProveedor cp=new FrmProveedor();
        cp.setSize(600,500);
        cp.setLocation(5,5);
        
       pnlPrincipalCompras.removeAll();
       pnlPrincipalCompras.add(cp, BorderLayout.CENTER);
       pnlPrincipalCompras.revalidate();
       pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_mitemProveedorActionPerformed

    private void itemCrearOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearOCActionPerformed
        // TODO add your handling code here:
        CrearOrden crea=new CrearOrden();
        crea.setSize(580,390);
        crea.setLocation(30,10);

        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(crea, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_itemCrearOCActionPerformed

    private void itemConsultarOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarOcActionPerformed
        // TODO add your handling code here:
        ConsultarOrden conor= new ConsultarOrden ();
        conor.setSize(580,390);
        conor.setLocation(30,10);

        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(conor, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_itemConsultarOcActionPerformed

    private void itemRegistrarCotizaciĆ³nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarCotizaciĆ³nActionPerformed
        // TODO add your handling code here:
        RegistrarCotizacion rc=new RegistrarCotizacion();
        rc.setSize(580,390);
        rc.setLocation(30,10);

        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(rc, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_itemRegistrarCotizaciĆ³nActionPerformed

    private void itemConsultarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarCotizacionActionPerformed
        // TODO add your handling code here:
        ConsultarCotizacion ct=new ConsultarCotizacion();
        ct.setSize(580,390);
        ct.setLocation(30,10);

        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(ct, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_itemConsultarCotizacionActionPerformed

    private void itemRegistrarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarFacturaActionPerformed
        // TODO add your handling code here:
        RegistrarFactura rfactura= new RegistrarFactura();
        rfactura.setSize(580,390);
        rfactura.setLocation(30,10);

        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(rfactura, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_itemRegistrarFacturaActionPerformed

    private void itemConsultarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarFacturaActionPerformed
        // TODO add your handling code here:
        ConsultarFactura cfactura= new ConsultarFactura();
        cfactura.setSize(580,390);
        cfactura.setLocation(30,10);

        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(cfactura, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_itemConsultarFacturaActionPerformed

    private void mitemProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemProductoActionPerformed
        // TODO add your handling code here:
        FrmProducto cx= new FrmProducto();
        cx.setSize(580,390);
        cx.setLocation(5,5);
        
        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(cx, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_mitemProductoActionPerformed

    private void itemConsultarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarPedidoActionPerformed
        // TODO add your handling code here:
        FrmDetallePedCompra consped=new FrmDetallePedCompra();
        consped.setSize(580,390);
        consped.setLocation(30,10);

        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(consped, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_itemConsultarPedidoActionPerformed

    private void itemNvoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNvoPedidoActionPerformed
        // TODO add your handling code here:
        FrmPedidoCompra n = new FrmPedidoCompra();
        n.setSize(580,390);
        n.setLocation(5,5);

        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(n, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_itemNvoPedidoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemConsultarCotizacion;
    private javax.swing.JMenuItem itemConsultarFactura;
    private javax.swing.JMenuItem itemConsultarOc;
    private javax.swing.JMenuItem itemConsultarPedido;
    private javax.swing.JMenuItem itemCrearOC;
    private javax.swing.JMenuItem itemNvoPedido;
    private javax.swing.JMenuItem itemRegistrarCotizaciĆ³n;
    private javax.swing.JMenuItem itemRegistrarFactura;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mbarDocumentos;
    private javax.swing.JMenu mbarFacturaCompra;
    private javax.swing.JMenu mbarOrdenCompra;
    private javax.swing.JMenu mbarProveedor;
    private javax.swing.JMenu menuVolver;
    private javax.swing.JMenuItem mitemProducto;
    private javax.swing.JMenuItem mitemProveedor;
    public static javax.swing.JPanel pnlPrincipalCompras;
    private javax.swing.JLabel txtfondo;
    // End of variables declaration//GEN-END:variables
}
