/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlCompras;

import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LUIS
 */
public class ControlUsuario {
    public String Autenticacion (Usuario usu) {

		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="";
		String rpta;
		
		try{
			cn = Conexion.getConexion();
			sql = "select e.nomEmp,u.email,u.pasword from usuarios u\n" +
                                "join empleado e  on u.cod_empleado=e.cod_empleado where email =  '" + usu.getXemail()+ "'";
			ps = cn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()){
				if (usu.getXemail().equals(rs.getString(2)) && usu.getXpassword().equals(rs.getString(3)) ) {
					rpta= rs.getString(1);
				}
				else {
					rpta = "No registrado";
				}
			}
			else {
				rpta = "Sin resultados";
			}
		}
		catch(Exception e){
			e.printStackTrace();
			rpta = "No conectado";
		}
		finally{
			try{
				if (rs!=null) rs.close();
				if (ps!=null) ps.close();
				if (cn!=null) cn.close();
			}
			catch(Exception e2){
				e2.printStackTrace();
				rpta = "No";
			}
		}
		
		return rpta;
	}
}
