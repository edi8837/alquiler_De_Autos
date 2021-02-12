/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Login;

/**
 *
 * @author GerardoG
 */
public class ControladorLogin {
    
    public boolean buscar(String username, String password){
        Login log=new Login();
        boolean ban=false;
        Connection con = null;
        String sql = " SELECT u.usu_username, u.usu_password, ut.tip_usuario "
                    + " FROM alq_usuarios u, alq_tipos_usuarios ut "
                    + " WHERE ut.alq_usuarios_usu_cedula = u.usu_cedula "
                    + " AND u.usu_username= '"+username+"' AND u.usu_password='"+password+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                buscarLogin(username,password);
                ban=true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public Login buscarLogin(String username, String password){
        Login log=new Login();
        boolean ban=false;
        Connection con = null;
        String sql = " SELECT u.usu_username, u.usu_password, ut.tip_usuario "
                    + " FROM alq_usuarios u, alq_tipos_usuarios ut "
                    + " WHERE ut.alq_usuarios_usu_cedula = u.usu_cedula "
                    + " AND u.usu_username= '"+username+"' AND u.usu_password='"+password+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                log.setUsername(rs.getString("usu_username"));
                log.setPassword(rs.getString("usu_password"));
                log.setTip_usuario(rs.getInt("tip_usuario"));
                ban=true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return log;
    }
}
