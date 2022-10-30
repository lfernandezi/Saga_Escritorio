/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlCompras;


import Clases.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class ControlProveedor {
        
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql="";
        int rpta=0;
    
    public void mantProv (Proveedor prov) {
        
        int opcion=prov.getOpcion();
        if (opcion==1){
            try{
                cn = Conexion.getConexion();
                sql= "Insert into proveedor(cod_proveedor,razonSocial,dir_Proveedor,\n"
                    + "telProveedor,emailProveedor,ruc,estadoProv)values(?,?,?,?,?,?,?)";
                ps = cn.prepareStatement(sql);
                ps.setString(1,prov.getPcodigo());  
                ps.setString(2,prov.getPnombre());
                ps.setString(3,prov.getPdireccion());
                ps.setString(4,prov.getPtelefono());
                ps.setString(5,prov.getPemail());
                ps.setString(6,prov.getPruc());
                ps.setString(7,prov.getPestado());
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
                sql= "Update proveedor set razonSocial=?,dir_Proveedor=?,\n"
                    + "telProveedor=?,emailProveedor=?,ruc=?,estadoProv=? where cod_proveedor =?";
                ps = cn.prepareStatement(sql);
                //ps.setString(1,prov.getPcodigo());  
                ps.setString(1,prov.getPnombre());
                ps.setString(2,prov.getPdireccion());
                ps.setString(3,prov.getPtelefono());
                ps.setString(4,prov.getPemail());
                ps.setString(5,prov.getPruc());
                ps.setString(6,prov.getPestado());
                ps.setString(7,prov.getPcodigo());
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
                sql="Delete from proveedor where cod_proveedor =?";
                ps = cn.prepareStatement(sql);     
                ps.setString(1,prov.getPcodigo());               
                ps.executeUpdate();        
                JOptionPane.showMessageDialog(null,"Registro eliminado");            
                //rs = ps.executeQuery();   
            }catch(Exception e){
                e.printStackTrace();
            }   
        }
    }
}
    
  