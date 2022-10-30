/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlCompras;


import Clases.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class ControlProductos {
    
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql="";
        int rpta=0;
    
    public void MantProd (Productos producto) {
        
        String area=castearArea(producto);
        String proveedor=castearProveedor(producto);
        int opcion=producto.getOpcion();
        if (opcion==1){
            try{
                cn = Conexion.getConexion();
                sql= "Insert into producto(codProducto,descripcion,precioUnitario,\n"
                    + "stockMin,cod_Area_Producto,cod_proveedor)values(?,?,?,?,?,?)";
                ps = cn.prepareStatement(sql);
                ps.setString(1,producto.getCodigo());  
                ps.setString(2,producto.getDescripcion());
                ps.setDouble(3,producto.getPrecioUnitario());
                ps.setInt(4,producto.getStockMinimo());
                ps.setString(5,area);
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
                sql= "Update producto set descripcion=?,precioUnitario=?,\n"
                    + "stockMin=?,cod_Area_Producto=?,cod_proveedor=? where codProducto =?";
                ps = cn.prepareStatement(sql);
                //ps.setString(1,prov.getPcodigo());  
                ps.setString(1,producto.getDescripcion());
                ps.setDouble(2,producto.getPrecioUnitario());
                ps.setInt(3,producto.getStockMinimo());
                ps.setString(4,area);
                ps.setString(5,proveedor);
                ps.setString(6,producto.getCodigo());
               
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
                sql="Delete from producto where codProducto =?";
                ps = cn.prepareStatement(sql);     
                ps.setString(1,producto.getCodigo());               
                ps.executeUpdate();        
                JOptionPane.showMessageDialog(null,"Registro eliminado");            
                //rs = ps.executeQuery();   
            }catch(Exception e){
                e.printStackTrace();
            }   
        }
    }
   
    private String castearArea(Productos producto){
        
        String rpta="";
         try{
            cn = Conexion.getConexion();
            sql= "Select cod_Area_Producto from area_producto where nombreAreaProducto=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1,producto.getArea()); 
            rs=ps.executeQuery();
            
            while (rs.next()){
   
                rpta=rs.getString("cod_Area_Producto");               
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
    
    private String castearProveedor(Productos producto){
        
        String rpta="";
         try{
            cn = Conexion.getConexion();
            sql= "Select cod_proveedor from proveedor where razonSocial=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1,producto.getProveedor()); 
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
