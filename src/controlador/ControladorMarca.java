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
import modelo.Marca_TipoAuto;



/**
 *
 * @author GerardoG
 */
public class ControladorMarca {
    
    public boolean llenarComboBoxNombre(JComboBox combo){
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM alq_marcas";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("mar_nombre"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public boolean llenarComboBoxNumero(JComboBox combo){
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM alq_marcas";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("mar_id"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public Marca_TipoAuto buscarMarca(int codigo){
        Marca_TipoAuto mar=new Marca_TipoAuto();
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_marcas "
                    + " WHERE mar_id="+codigo;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                mar.setId(rs.getInt("mar_id"));
                mar.setNombre(rs.getString("mar_nombre"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return mar;
    }
    
    
    //Buscar por Nombre
    public Marca_TipoAuto buscarMarcaNombre(String nombre){
        Marca_TipoAuto mar=new Marca_TipoAuto();
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_marcas "
                    + " WHERE mar_nombre='"+nombre+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                mar.setId(rs.getInt("mar_id"));
                mar.setNombre(rs.getString("mar_nombre"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return mar;
    }
    
    
    //llenar id
    public int llenarId(){
        int llena=0;
        boolean ban=false;
        Connection con = null;
            String sql = "SELECT count(*) "
                       + "FROM alq_marcas";
         try {

            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                llena = rs.getInt(1)+2;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return llena;
    }
    
    public boolean anadirMarca(Marca_TipoAuto mar){
        boolean r = false;
        Connection con = null;
       
        String sql = "Insert Into alq_marcas Values("+mar.getId()+",'"+mar.getNombre()+"')";
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
    
    public boolean eliminarMarca(int codigo){
        boolean r = false;
        Connection con = null;
       
        String sql = "DELETE FROM  alq_marcas WHERE mar_id = "+codigo;
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
    
    public boolean actualizarMarca(Marca_TipoAuto mar){
        boolean r = false;
        Connection con = null;
       
        String sql = "UPDATE alq_marcas SET mar_nombre= '"+mar.getNombre() + "' WHERE mar_id = "+mar.getId();
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
