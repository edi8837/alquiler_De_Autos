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
import java.sql.Statement;
import javax.swing.JComboBox;
import modelo.Login;
import modelo.Marca_TipoAuto;
import modelo.Modelo;

/**
 *
 * @author GerardoG
 */
public class ControladorModelo {
    
    ControladorMarca controladorMarca = new ControladorMarca();
    
    public boolean llenarComboBoxNumero(JComboBox combo){
        Login log=new Login();
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM alq_modelos";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getInt("mod_id"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public boolean llenarComboBoxNombre(JComboBox combo){
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM alq_modelos";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("mod_nombre"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public Modelo buscarModelo(int codigo){
        Modelo mod=new Modelo();
        Marca_TipoAuto mar=new Marca_TipoAuto();
        Connection con = null;
        String sql = " SELECT mod_id, mod_nombre, alq_marcas_mar_id"
                    + " FROM alq_modelos mo"
                    + " WHERE mo.mod_id="+codigo;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                mod.setId(rs.getInt("mod_id"));
                mod.setNombre(rs.getString("mod_nombre"));
                mod.setMar_id(rs.getInt("alq_marcas_mar_id"));
                mar=controladorMarca.buscarMarca(mod.getMar_id());
                mod.setNombreMarca(mar.getNombre());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return mod;
    }
    
    public Modelo buscarModeloNombre(String nombre){
        Modelo mod=new Modelo();
        Marca_TipoAuto mar=new Marca_TipoAuto();
        Connection con = null;
        String sql = " SELECT mod_id, mod_nombre, alq_marcas_mar_id"
                    + " FROM alq_modelos mo"
                    + " WHERE mo.mod_nombre='"+nombre+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                mod.setId(rs.getInt("mod_id"));
                mod.setNombre(rs.getString("mod_nombre"));
                mod.setMar_id(rs.getInt("alq_marcas_mar_id"));
                mar=controladorMarca.buscarMarca(mod.getMar_id());
                mod.setNombreMarca(mar.getNombre());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return mod;
    }
    
    
    //llenar id
    public int llenarId(){
        int llena=0;
        boolean ban=false;
        Connection con = null;
            String sql = "SELECT count(*) "
                       + "FROM alq_modelos ";
         try {

            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                llena = rs.getInt(1)+1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return llena;
    }
    
    public boolean anadirModelo(Modelo mod){
        boolean r = false;
        Connection con = null;
       
        String sql = "Insert Into alq_modelos Values("+mod.getId()+",'"+mod.getNombre()+"',"+mod.getMar_id()+")";
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            r=true;
	    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        return r;
    }
    
    public boolean eliminarModelo(int codigo){
        boolean r = false;
        Connection con = null;
       
        String sql = "DELETE FROM  alq_modelos WHERE mod_id = "+codigo;
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            r=true;
	    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        return r;
    }
    
    public boolean actualizarModelo(Modelo mod){
        boolean r = false;
        Connection con = null;
       
        String sql = "UPDATE alq_modelos SET mod_nombre= '"+mod.getNombre()+"', alq_marcas_mar_id="+mod.getMar_id()+" WHERE mod_id = "+mod.getId();
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            r=true;
	    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        return r;
    }
    
    
}
