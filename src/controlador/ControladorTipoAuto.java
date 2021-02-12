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
public class ControladorTipoAuto {
    
    
    public boolean llenarComboBoxNumero(JComboBox combo){
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM alq_tip_autos";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("tipo_aut_id"));
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
                       + "FROM alq_tip_autos";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("tipo_aut_nombre"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public Marca_TipoAuto buscarTipo(int codigo){
        Marca_TipoAuto mar=new Marca_TipoAuto();
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_tip_autos "
                    + " WHERE tipo_aut_id="+codigo;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                mar.setId(rs.getInt("tipo_aut_id"));
                mar.setNombre(rs.getString("tipo_aut_nombre"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return mar;
    }
    
    public Marca_TipoAuto buscarTipoNombre(String nombre){
        Marca_TipoAuto mar=new Marca_TipoAuto();
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_tip_autos "
                    + " WHERE tipo_aut_nombre='"+nombre+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                mar.setId(rs.getInt("tipo_aut_id"));
                mar.setNombre(rs.getString("tipo_aut_nombre"));
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
                       + "FROM alq_tip_autos";
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
    
    public boolean anadirTipoAutos(Marca_TipoAuto mar){
        boolean r = false;
        Connection con = null;
       
        String sql = "Insert Into alq_tip_autos Values("+mar.getId()+",'"+mar.getNombre()+"')";
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
    
    public boolean eliminarTipoAutos(int codigo){
        boolean r = false;
        Connection con = null;
       
        String sql = "DELETE FROM  alq_tip_autos WHERE tipo_aut_id = "+codigo;
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
    
    public boolean actualizarTipoAutos(Marca_TipoAuto mar){
        boolean r = false;
        Connection con = null;
       
        String sql = "UPDATE alq_tip_autos SET tipo_aut_nombre= '"+mar.getNombre() + "' WHERE tipo_aut_id = "+mar.getId();
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
