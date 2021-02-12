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
import modelo.Auto;
import modelo.Login;
import modelo.Marca_TipoAuto;
import modelo.Modelo;

/**
 *
 * @author GerardoG
 */
public class ControladorAuto {
    
    ControladorModelo controladorModelo = new ControladorModelo();
    ControladorTipoAuto controladorTipoAuto= new ControladorTipoAuto();
    ControladorAdministrador controladorAdministrador= new ControladorAdministrador();
    
    
    public boolean llenarComboBoxNumero(JComboBox combo){
        Login log=new Login();
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM alq_autos";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getInt("aut_id"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public Auto buscarAuto(int codigo){
        Auto aut=new Auto();
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_autos"
                    + " WHERE aut_id="+codigo;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                aut.setAut_id(rs.getInt("aut_id"));
                aut.setAut_placa(rs.getString("aut_placa"));
                aut.setAut_potencia(rs.getString("aut_potencia"));
                
                String estado= rs.getString("aut_estado");
                char estadoC=estado.charAt(0);
                aut.setAut_estado(estadoC);
                
                String nac_ext= rs.getString("aut_nacional_extranjero");
                char nac_extC=nac_ext.charAt(0);
                aut.setAut_nacional_extra(nac_extC);
                aut.setMod_id(rs.getInt("alq_modelos_mod_id"));
                aut.setTipo_aut_id(rs.getInt("alq_tip_autos_tipo_aut_id"));
                aut.setAut_precio(rs.getDouble("aut_precio"));

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return aut;
    }
    
    //llenar id
    public int llenarId(){
        int llena=0;
        boolean ban=false;
        Connection con = null;
            String sql = "SELECT count(*) "
                       + "FROM alq_autos";
         try {

            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                llena = rs.getInt(1)+5;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return llena;
    }
    
    public boolean anadirAuto(Auto auto,int numSuc){
        boolean r = false;
        Connection con = null;
       
        String sql = "Insert Into alq_autos Values("+auto.getAut_id()
                                                    +",'"+auto.getAut_placa()
                                                    +"','"+auto.getAut_potencia()
                                                    +"','"+auto.getAut_estado()
                                                    +"',"+auto.getMod_id()
                                                    +","+auto.getTipo_aut_id()
                                                    +",'"+auto.getAut_nacional_extra()
                                                    +"',"+auto.getAut_precio()+")";
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
    
    public boolean eliminarAuto(int codigo){
        boolean r = false;
        Connection con = null;
       
        String sql = "DELETE FROM  alq_autos WHERE aut_id = "+codigo;
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
    
    public boolean actualizarAuto(Auto auto){
        boolean r = false;
        Connection con = null;
       
        String sql = "UPDATE alq_autos SET aut_placa= '"+auto.getAut_placa() + "'"
                                        +", aut_potencia='"+auto.getAut_potencia()+"'"
                                        +", aut_estado='"+auto.getAut_estado()+"'"
                                        +", alq_modelos_mod_id="+ auto.getMod_id()
                                        +", alq_tip_autos_tipo_aut_id="+auto.getTipo_aut_id()
                                        +", aut_nacional_extranjero ='"+auto.getAut_nacional_extra()+"'"
                                        +",aut_precio="+auto.getAut_precio()
                                        + "WHERE aut_id = "+auto.getAut_id();
        
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
    
    
    public boolean llenarComboBoxDisponible(JComboBox combo){
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * FROM alq_autos WHERE aut_estado = 'A'";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("aut_placa"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public boolean llenarComboBoxNODisponible(JComboBox combo){
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * FROM alq_autos WHERE aut_estado = 'I'";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("aut_placa"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    
    public String buscarAutoPlaca(int codigo){
        String placa="";
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_autos"
                    + " WHERE aut_id="+codigo;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                placa=rs.getString("aut_placa");

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return placa;
    }
    
    
    public void llenarTabla(String estado,DefaultTableModel dtm,Object [] o){
        Connection con = null;
        Modelo mod=new Modelo();
        Marca_TipoAuto mar=new Marca_TipoAuto();
        String sql = " SELECT *"
                    + " FROM alq_autos"
                    + " WHERE aut_estado='"+estado+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
               
                o[0] = rs.getString("aut_id");
                mar=controladorTipoAuto.buscarTipo(rs.getInt("alq_tip_autos_tipo_aut_id"));
                
                o[1] = mar.getNombre();
                mod=controladorModelo.buscarModelo(rs.getInt("alq_modelos_mod_id"));
                o[2]=mod.getNombreMarca();
                o[3]=mod.getNombre();
                o[4]=rs.getString("aut_placa");
                o[5]=rs.getString("aut_potencia");
                
                if(rs.getString("aut_nacional_extranjero").equals("N")){
                    o[6]="Nacional";
                }else if(rs.getString("aut_nacional_extranjero").equals("E")){
                    o[6]="Extranjero";
                }
                o[7]=rs.getString("aut_precio");
                dtm.addRow(o);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }
    
    public int buscarAutoCodigo(String placa){
        int id=0;
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_autos"
                    + " WHERE aut_placa='"+placa+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                id=rs.getInt("aut_id");

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return id;
    }
    
}
