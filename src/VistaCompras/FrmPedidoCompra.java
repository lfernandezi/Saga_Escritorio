/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaCompras;

import Clases.PedidoCompra;
import ControlCompras.Conexion;
import ControlCompras.ControlPedidoCompra;
import java.awt.BorderLayout;
import static VistaCompras.Compras.pnlPrincipalCompras;
//import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
//import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
//import com.sun.tools.sjavac.server.SysInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import sun.util.calendar.LocalGregorianCalendar;

/**
 *
 * @author LUIS
 */
public class FrmPedidoCompra extends javax.swing.JPanel {

    /**
     * Creates new form NuevoPedido
     */
    DefaultTableModel tablaPedido;
    
    public FrmPedidoCompra() {
        initComponents();
        
        //txtFecha.setText(ExsltDatetime.dateTime().substring(0,10));
       txtFecha.setText(TOOL_TIP_TEXT_KEY);
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
       
        String sql="";
        
        try{
            cn = Conexion.getConexion();
            sql= "Select concat(nomEmp,' ',apeEmpl) empleado from empleado";
            ps = cn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            cboEmpleado.addItem("Seleccione área: ");

            while (rs.next()){
               
                cboEmpleado.addItem(rs.getString("empleado"));               
            }            
            rs.close();
        }catch(Exception e){
            e.printStackTrace();              
        }finally{
            try{
                if (rs!=null) rs.close();
                if (ps!=null) ps.close();
                if (cn!=null) cn.close();
            }catch(Exception e2){
                    e2.printStackTrace();                  
            }
        }  
        try{
            cn = Conexion.getConexion();
            sql= "Select * from proveedor";
           
            ps = cn.prepareStatement(sql);
            rs=ps.executeQuery();
            cboProveedor.addItem("Seleccione proveedor: ");
            while (rs.next()){
                cboProveedor.addItem(rs.getString("razonSocial"));
                }
                rs.close();

        }catch(Exception e){
            e.printStackTrace();              
        }finally{
                try{
                    if (rs!=null) rs.close();
                    if (ps!=null) ps.close();
                    if (cn!=null) cn.close();
                }catch(Exception e2){
                    e2.printStackTrace();                  
                }
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
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboFormaPago = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboEmpleado = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVerTabla = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtOpcion = new javax.swing.JLabel();
        btnDetalle = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Pedidos de Compra");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Empresa:");

        cboProveedor.setToolTipText("");

        jLabel4.setText("Forma de Pago:");

        cboFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Forma de Pago:", "Contado", "Crédito" }));

        jLabel5.setText("Num. Pedido:");

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado:");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Estado:", "Creado", "En Curso", "Vencido", "Anulado" }));

        jLabel7.setText("Solicita:");

        jLabel3.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboEstado, 0, 155, Short.MAX_VALUE)
                            .addComponent(cboEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVer)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPedido);

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVerTabla.setText("Ver Todo");
        btnVerTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnVerTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerTabla)
                .addGap(6, 6, 6))
        );

        btnDetalle.setText("Detalle");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDetalle)
                                .addGap(47, 47, 47)
                                .addComponent(btnGuardar)
                                .addGap(46, 46, 46)
                                .addComponent(btnCancelar)
                                .addGap(82, 82, 82)
                                .addComponent(btnSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtOpcion)
                                .addGap(187, 187, 187)
                                .addComponent(jLabel1)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtOpcion))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnDetalle)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
       //bloquearCasillas();
       limpiar();    
        
       btnBuscar.setEnabled(true);
       btnCrear.setEnabled(true);
       btnVerTabla.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaActionPerformed
        // TODO add your handling code here:
        mostrarTabla();
    }//GEN-LAST:event_btnVerTablaActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
       bloquearCasillas();
       activarCasillas();   
       limpiar();       
       btnCancelar.setEnabled(true);
       btnGuardar.setEnabled(true);
       txtOpcion.setText("1"); 
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        Fondo f=new Fondo();
        f.setSize(580,390);
        f.setLocation(5,5);

        pnlPrincipalCompras.removeAll();
        pnlPrincipalCompras.add(f, BorderLayout.CENTER);
        pnlPrincipalCompras.revalidate();
        pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        limpiar();
        bloquearCasillas();
        btnVer.setEnabled(true);
        txtCodigo.setEnabled(true);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        bloquearCasillas();
        activarCasillas();
        btnCancelar.setEnabled(true);
        
       
        String [] cabecera={"Pedido","Empleado", "Razón Social","Forma de Pago","Fecha","Estado"};
        String [] cuerpo = new String[6];
           
        tablaPedido=new DefaultTableModel(null,cabecera); 
                
        Connection cn=null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select pc.codPedido_Compra, concat(e.nomEmp,' ',e.apeEmpl) empleado, "
                    + "p.razonSocial, pc.forma_pago, pc.fecha,pc.estado from pedido_compra pc inner join empleado e on pc.cod_empleado=e.cod_empleado "
                    + "inner join proveedor p on pc.cod_proveedor=p.cod_proveedor where codPedido_Compra =?";                        
            try{   
                cn=Conexion.getConexion();
                ps=cn.prepareStatement(sql);
                ps.setString(1,txtCodigo.getText());
                rs=ps.executeQuery();
                if (rs.next()){
                    JOptionPane.showMessageDialog(null,"Registro encontrado");
                    cuerpo[0]=rs.getString("codPedido_Compra");
                    cuerpo[1]=rs.getString("empleado");   
                    cuerpo[2]=rs.getString("razonSocial");
                    cuerpo[3]=rs.getString("forma_pago"); 
                    cuerpo[4]=rs.getString("fecha");  
                    cuerpo[5]=rs.getString("estado");
                    //cuerpo[6]=rs.getString("estadoProv"); 
                    tablaPedido.addRow(cuerpo);
                                 
                    tblPedido.setModel(tablaPedido);
                    txtCodigo.setText("");;
                    
                }else {
                    JOptionPane.showMessageDialog(null,"Registro no encontrado");
                    txtCodigo.setText("");
                    btnVer.setEnabled(true);
                }          
            } catch (SQLException ex) {
                 Logger.getLogger(FrmProveedor.class.getName()).log(Level.SEVERE, null, ex);
            
            try{                
                if (rs!=null)  rs.close();
                if (ps!=null) ps.close();
                if (cn!=null) cn.close();
            }catch(Exception e2){
                e2.printStackTrace();         
            }
        }
        
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        PedidoCompra ped=new PedidoCompra();
        ped.setCodigo(Integer.parseInt(txtCodigo.getText()));
        ped.setCodEmpleado((String) cboEmpleado.getSelectedItem());
        ped.setFormaPago((String) cboFormaPago.getSelectedItem());
        ped.setEstado((String) cboEstado.getSelectedItem());
        ped.setFecha(txtFecha.getText());
        ped.setCodProveedor((String) cboProveedor.getSelectedItem());
        //prod.setPestado("ACTIVO");
        ped.setOpcion(Integer.parseInt(txtOpcion.getText()));
       
        //JOptionPane.showMessageDialog(null,);
       ControlPedidoCompra pc=new ControlPedidoCompra();
       pc.MantPedComp(ped);
      
       limpiar();
       mostrarTabla();
       bloquearCasillas();
       btnVerTabla.setEnabled(true);
       btnCrear.setEnabled(true);
       btnBuscar.setEnabled(true);
       txtOpcion.setText("0");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPedidoMouseClicked
        // TODO add your handling code here:
         try{
            int fila=tblPedido.getSelectedRow();
            String codigo =tblPedido.getValueAt(fila, 0).toString();
            Connection cn=null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            cn=Conexion.getConexion();
            String sql =  "select pc.codPedido_Compra, concat(e.nomEmp,' ',e.apeEmpl) empleado, "
                    + "p.razonSocial, pc.forma_pago, pc.fecha,pc.estado from pedido_compra pc inner join empleado e on pc.cod_empleado=e.cod_empleado "
                    + "inner join proveedor p on pc.cod_proveedor=p.cod_proveedor where codPedido_Compra =?";                         
            ps=cn.prepareStatement(sql);
            ps.setString(1,codigo);
            rs=ps.executeQuery();
            
            while(rs.next()){
                txtCodigo.setText(String.valueOf(codigo));
                cboEmpleado.setSelectedItem("empleado");
                cboProveedor.setSelectedItem(rs.getString("razonSocial"));
                cboFormaPago.setSelectedItem(rs.getString("forma_pago"));
                txtFecha.setText(rs.getString("fecha"));
                cboEstado.setSelectedItem(rs.getString("estado"));
            }
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        bloquearCasillas();       
        txtCodigo.setEnabled(false);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_tblPedidoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int rspta=-1;
        bloquearCasillas();
        rspta=JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro?");
        if(rspta==0){
            txtOpcion.setText("3");
            PedidoCompra pedido=new PedidoCompra();
            pedido.setCodigo(Integer.parseInt(txtCodigo.getText()));
            pedido.setOpcion(Integer.parseInt(txtOpcion.getText()));
            ControlPedidoCompra mxp=new ControlPedidoCompra();
            mxp.MantPedComp(pedido);
        }else{
            JOptionPane.showMessageDialog(null,"Registro no fue eliminado");
        }
        
        mostrarTabla();
        btnCrear.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnVerTabla.setEnabled(true);
        txtOpcion.setText("0");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        // TODO add your handling code here:
        txtOpcion.setText("4");
        FrmDetallePedCompra n = new FrmDetallePedCompra();
        n.setSize(600,500);
        n.setLocation(5,5);
        
       pnlPrincipalCompras.removeAll();
       pnlPrincipalCompras.add(n, BorderLayout.CENTER);
       pnlPrincipalCompras.revalidate();
       pnlPrincipalCompras.repaint();
    }//GEN-LAST:event_btnDetalleActionPerformed
     void mostrarTabla(){
        
        String [] cabecera={"Pedido","Empleado", "Razón Social","Forma de Pago","Fecha","Estado"};
        String [] cuerpo = new String[6];
           
        tablaPedido=new DefaultTableModel(null,cabecera);    
        
        try {
            Connection cn=null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "select pc.codPedido_Compra, concat(e.nomEmp,' ',e.apeEmpl) empleado, "
                    + "p.razonSocial, pc.forma_pago, pc.fecha,pc.estado from pedido_compra pc inner join empleado e on pc.cod_empleado=e.cod_empleado inner join proveedor p on pc.cod_proveedor=p.cod_proveedor";  
            
            cn=Conexion.getConexion();
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
                
            while(rs.next()){
                cuerpo[0]=rs.getString("codPedido_Compra");
                cuerpo[1]=rs.getString("empleado");   
                cuerpo[2]=rs.getString("razonSocial");
                cuerpo[3]=rs.getString("forma_pago"); 
                cuerpo[4]=rs.getString("fecha");  
                cuerpo[5]=rs.getString("estado");
                //cuerpo[6]=rs.getString("estadoProv"); 
                tablaPedido.addRow(cuerpo);
             }
            tblPedido.setModel(tablaPedido);
        } catch (SQLException ex) {
            Logger.getLogger(FrmProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    void bloquearCasillas(){
        txtCodigo.setEnabled(false);
        txtFecha.setEnabled (false);
        cboEmpleado.setEnabled(false);
        cboEstado.setEnabled(false);
        cboProveedor.setEnabled(false);
        cboFormaPago.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnVer.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnVerTabla.setEnabled(false);
        btnCrear.setEnabled(false);  
    }
    
     void activarCasillas(){
        txtCodigo.setEnabled(true);
        txtFecha.setEnabled(true);
        cboFormaPago.setEnabled(true);
        cboEstado.setEnabled(true);
        cboProveedor.setEnabled(true);
    }
     
    void limpiar(){
        txtCodigo.setText("");
        cboEmpleado.setSelectedIndex(0);
        cboFormaPago.setSelectedIndex(0);
        cboEstado.setSelectedIndex(0);
        cboProveedor.setSelectedIndex(0);
        //String [] cuerpo = new String[7];     
        //tablaProveedor.addRow(cuerpo);              
        tblPedido.setModel(tablaPedido);
    }
    public String enviarCodigo(){
         String cod=txtCodigo.getText();
         return cod;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVerTabla;
    private javax.swing.JComboBox<String> cboEmpleado;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboFormaPago;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPedido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtOpcion;
    // End of variables declaration//GEN-END:variables
}