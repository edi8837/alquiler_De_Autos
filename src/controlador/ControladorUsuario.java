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
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

/**
 *
 * @author GerardoG
 */
public class ControladorUsuario {
    
     public boolean llenarComboBoxNombre(JComboBox combo){
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM alq_sucursales";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("suc_nombre"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
     
    public int buscarSucursalNumero(String nomSuc){
        int numSuc=0;
        
        Connection con = null;
        String sql = " SELECT suc_id"
                    + " FROM alq_sucursales"
                    + " WHERE suc_nombre='"+nomSuc+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                numSuc = rs.getInt("suc_id");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return numSuc;
    }
    
    public boolean anadirUsuario(Usuario usu){
        boolean r = false;
        Connection con = null;
       
        String sql = "Insert Into alq_usuarios Values('"+usu.getUsu_cedula()
                                                    +"','"+usu.getUsu_nombre()
                                                    +"','"+usu.getUsu_apellido()
                                                    +"','"+usu.getUsu_telf()
                                                    +"','"+usu.getUsu_telf_con()
                                                    +"','"+usu.getUsu_email()
                                                    +"','"+usu.getUsu_direccion()
                                                    +"','"+usu.getUsu_username()
                                                    +"','"+usu.getUsu_password()+"')";
        
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            r=true;
            anadirTipoUsuario(usu);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        return r;
    }
    
    private void anadirTipoUsuario(Usuario usu){
        Connection con = null;
        String sql = "Insert Into alq_tipos_usuarios Values("+usu.getTip_usuario()
                                                    +","+usu.getSuc_id()
                                                    +",'"+usu.getUsu_cedula()
                                                    +"')";
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

    }
    
    public Usuario buscarUsuario(String cedula){
        Usuario usu= new Usuario();
        
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_usuarios u, alq_tipos_usuarios tp"
                    + " WHERE u.usu_cedula = tp.alq_usuarios_usu_cedula "
                    + " AND u.usu_cedula='"+cedula+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                usu.setUsu_cedula(rs.getString("usu_cedula"));
                usu.setUsu_nombre(rs.getString("usu_nombre"));
                usu.setUsu_apellido(rs.getString("usu_apellido"));
                usu.setUsu_telf_con(rs.getString("usu_telf_con"));
                usu.setUsu_telf(rs.getString("usu_telf"));
                usu.setUsu_email(rs.getString("usu_email"));
                usu.setUsu_direccion(rs.getString("usu_direccion"));
                usu.setUsu_username(rs.getString("usu_username"));
                usu.setUsu_password(rs.getString("usu_password"));
                usu.setTip_usuario(rs.getInt("alq_sucursales_suc_id"));
                usu.setSuc_id(rs.getInt("tip_usuario"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return usu;
    }
    
    public boolean actualizarUsuario(Usuario usu){
        boolean r = false;
        Connection con = null;
       
        String sql = "UPDATE alq_usuarios SET usu_nombre= '"+usu.getUsu_nombre()
                +"', usu_apellido='"+usu.getUsu_apellido()
                +"', usu_telf='"+usu.getUsu_telf()
                +"', usu_telf_con='"+usu.getUsu_telf_con()
                +"', usu_email='"+usu.getUsu_email()
                +"', usu_direccion='"+usu.getUsu_direccion()
                +"', usu_username='"+usu.getUsu_username()
                +"', usu_password='"+usu.getUsu_password()
                +"' WHERE usu_cedula = '"+usu.getUsu_cedula()+"'";
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            r=true;
            actualizarTipo_Usuario(usu);
	    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        return r;
    }
    
    private void actualizarTipo_Usuario(Usuario usu){
        Connection con = null;
       
        String sql = "UPDATE alq_tipos_usuarios SET tip_usuario= "+usu.getTip_usuario()
                +", alq_sucursales_suc_id="+usu.getSuc_id()
                +" WHERE alq_usuarios_usu_cedula = '"+usu.getUsu_cedula()+"'";
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

    }
    
    public boolean eliminarTipoUsuario(String cedula){
        boolean r = false;
        Connection con = null;
       
        String sql = "DELETE FROM  alq_tipos_usuarios WHERE alq_usuarios_usu_cedula = '"+cedula +"'";
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            r=true;
	    eliminarUsuario(cedula);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return r;
    }
    
    
    private void eliminarUsuario(String cedula){
        Connection con = null;
       
        String sql = "DELETE FROM  alq_usuarios WHERE usu_cedula = '"+cedula +"'";
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        
    }
    
    
    public void llenarTabla(int tipo,DefaultTableModel dtm,Object [] o){
        Connection con = null;

        String sql = " SELECT *"
                    + " FROM alq_usuarios,alq_tipos_usuarios"
                    + " WHERE usu_cedula= alq_usuarios_usu_cedula"
                    + " AND tip_usuario="+tipo;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                //String ObjetoS[]=new String [8];
                o[0] = rs.getString("usu_cedula");
                o[1] = rs.getString("usu_nombre");
                o[2]=rs.getString("usu_apellido");
                o[3]=rs.getString("usu_telf_con");
                o[4]=rs.getString("usu_telf");
                o[5]=rs.getString("usu_email");
                o[6]=rs.getString("usu_direccion");
                o[7]=rs.getString("usu_username");
                o[8]=rs.getString("usu_password");
                dtm.addRow(o);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }
    
   
    
    
}
