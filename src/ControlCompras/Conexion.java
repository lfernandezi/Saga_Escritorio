/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlCompras;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author LUIS
 */
public class Conexion {
    
    /*private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user ="root";
    private static final String pass ="Massiel0507";
    private static final String url ="jdbc:mysql://localhost:3306/bd_saga";*/
	
    public static Connection getConexion(){
	Connection con = null;
		
	try{
            Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_saga","root","Massiel0507");
		}
	catch(Exception e){
            e.printStackTrace();
		}
		return con;
	}

    /*
    public void conector(){
        con=null;
       
        try {
            Class.forName (driver);
            
            con= (Connection)DriverManager.getConnection(url,user,pass);
    
            if (con !=null){
                JOptionPane.showMessageDialog(null, "Bienvenido");
            }
        }
        catch (ClassNotFoundException|SQLException e){
            JOptionPane.showInputDialog("Error de conección");
        }
    }  */
	
}
