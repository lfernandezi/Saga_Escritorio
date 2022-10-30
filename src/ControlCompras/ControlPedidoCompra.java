/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlCompras;

import Clases.PedidoCompra;
import Clases.Productos;
import VistaCompras.FrmDetallePedCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class ControlPedidoCompra {
      Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql="";
        int rpta=0;
    
    public void MantPedComp(PedidoCompra pedido) {
        
        String empleado=castearEmpleado(pedido);
        String proveedor=castearProveedor(pedido);
        int opcion=pedido.getOpcion();
        if (opcion==1){
            try{
                cn = Conexion.getConexion();
                sql= "Insert into pedido_compra(codPedido_Compra,cod_empleado,forma_pago,\n"
                    + "estado,fecha,cod_proveedor)values(?,?,?,?,?,?)";
                ps = cn.prepareStatement(sql);
                ps.setInt(1,pedido.getCodigo());  
                ps.setString(2,empleado);
                ps.setString(3,pedido.getFormaPago());
                ps.setString(4,pedido.getEstado());
                ps.setString(5,pedido.getFecha());
                ps.setString(6,proveedor);
               
                int n=ps.executeUpdate();
                if (n>0){
                    JOptionPane.showMessageDialog(null,"Registro ingresado");
                }
                //rs = ps.executeQuery();
            
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
        if(opcion==2){
            try{
                cn = Conexion.getConexion();
                sql= "Update pedido_compra set cod_empleado=?,forma_pago=?,\n"
                    + "estado=?,fecha=?,cod_proveedor=? where codPedido_Compra =?";
                ps = cn.prepareStatement(sql);
                //ps.setString(1,prov.getPcodigo());  
                ps.setString(1,empleado);
                ps.setString(2,pedido.getFormaPago());
                ps.setString(3,pedido.getEstado());
                ps.setString(4,pedido.getFecha());
                ps.setString(5,proveedor);
                ps.setInt(6,pedido.getCodigo());
               
                ps.executeUpdate();        
                    JOptionPane.showMessageDialog(null,"Registro actualizado");            
                //rs = ps.executeQuery();   
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
        if (opcion==3){
            try{
                cn = Conexion.getConexion();               
                sql="Delete from pedido_compra where codPedido_Compra =?";
                ps = cn.prepareStatement(sql);     
                ps.setInt(1,pedido.getCodigo());               
                ps.executeUpdate();        
                JOptionPane.showMessageDialog(null,"Registro eliminado");            
                //rs = ps.executeQuery();   
            }catch(Exception e){
                e.printStackTrace();
            }       
           /* try{
                cn = Conexion.getConexion();               
                sql="Delete from pedido_compra where codPedido_Compra =?";
                ps = cn.prepareStatement(sql);     
                ps.setInt(1,pedido.getCodigo());               
                ps.executeUpdate();        
                JOptionPane.showMessageDialog(null,"Registro eliminado");            
                //rs = ps.executeQuery();   
            }catch(Exception e){
                e.printStackTrace();
            }   */
        }
    }
   
    private String castearEmpleado(PedidoCompra pedido){
        
        String rpta="";
         try{
            cn = Conexion.getConexion();
            sql= "Select cod_empleado from empleado where nomEmp=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1,pedido.getCodEmpleado()); 
            rs=ps.executeQuery();
            
            while (rs.next()){
   
                rpta=rs.getString("cod_empleado");               
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
    return rpta;    
    }
    
    private String castearProveedor(PedidoCompra pedido){
        
        String rpta="";
         try{
            cn = Conexion.getConexion();
            sql= "Select cod_proveedor from proveedor where razonSocial=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1,pedido.getCodProveedor()); 
            rs=ps.executeQuery();
            
            while (rs.next()){
   
                rpta=rs.getString("cod_proveedor");               
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
    return rpta;    
    }
}
