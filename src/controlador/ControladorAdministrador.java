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
import modelo.Tipo_Usuarios;

/**
 *
 * @author GerardoG
 */
public class ControladorAdministrador {
    
    public Tipo_Usuarios buscar(String username){
        Tipo_Usuarios tip_usu =new Tipo_Usuarios();
        Connection con = null;
        String sql = " SELECT ut.tip_usuario, ut.alq_sucursales_suc_id, ut.alq_usuarios_usu_cedula "
                    + " FROM alq_tipos_usuarios ut, alq_usuarios u"
                    + " WHERE ut.alq_usuarios_usu_cedula = u.usu_cedula "
                    + " AND  u.usu_username='"+username+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                tip_usu.setTip_usuario(rs.getInt("tip_usuario"));
                tip_usu.setSuc_id(rs.getInt("alq_sucursales_suc_id"));
                tip_usu.setUsu_cedula(rs.getString("alq_usuarios_usu_cedula"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return tip_usu;
    }
    
    public String buscarSucursal(int id){
        String nombre="";
        Connection con = null;
        String sql = " SELECT suc_nombre"
                    + " FROM alq_sucursales"
                    + " WHERE suc_id ="+id;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
              nombre= rs.getString("suc_nombre");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return nombre;
    }
    
}
