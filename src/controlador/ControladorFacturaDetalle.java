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
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JComboBox;
import modelo.Auto;
import modelo.FacturaDetalle;

/**
 *
 * @author GerardoG
 */
public class ControladorFacturaDetalle {
    
    ControladorAuto controladorAuto = new ControladorAuto();
    
    public Auto listar(ArrayList listaAutos,String placa,int cantidad) {
        Auto auto=new Auto();
        Connection con = null;
        
            String sql = "SELECT * FROM alq_autos WHERE aut_placa='"+placa+"'";
            //System.out.println(sql);

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {
                Auto aut = new Auto();
                aut.setAut_id(rs.getInt("aut_id"));
                System.out.println("dasd+ " + aut.getAut_id());
                aut.setAut_placa(rs.getString("aut_placa"));
                System.out.println("dasd+ " + aut.getAut_placa());
                
                String estado= rs.getString("aut_estado");
                char estadoC=estado.charAt(0);
                aut.setAut_estado(estadoC);

                aut.setAut_precio(rs.getDouble("aut_precio"));
                aut.setMod_id(cantidad);
                auto=aut;
                listaAutos.add(aut);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return auto;
    }
    
    
    public void actualizarAuto(String placa,String estado){
        Connection con = null;
       
        String sql = "UPDATE alq_autos SET aut_estado= '"+ estado+ "'"
                                        + "WHERE aut_placa = '"+placa+"'";
        
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
    
    public void vaciarComboBox(JComboBox combo){
        //combo.setSelectedIndex(0);        
        combo.removeAllItems();
        //controladorAuto.llenarComboBoxDisponible(combo);
    }
    
    public int llenarIdDetalle(){
        int llena=0;
        Connection con = null;
        
            String sql = "SELECT count(*) "
                       + "FROM alq_fac_detalles";
        
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
    
    
    public void actualizarAutoCancelar(ArrayList listaAutos){

        Connection con = null;
       
        for(int i=0; i<listaAutos.size();i++){
            Auto aut =  (Auto) listaAutos.get(i);
        
        String sql = "UPDATE alq_autos SET aut_estado= 'A'"
                                        + "WHERE aut_placa = '"+aut.getAut_placa()+"'";
        
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
    }
    
    public FacturaDetalle listarDetallesUnoporUno(Auto aut,ArrayList listaDetalles,int cont) {
        FacturaDetalle fac_Det = new FacturaDetalle();
            
            fac_Det.setFac_det_id(llenarIdDetalle()+cont);
            
            System.out.println("s"+fac_Det.getFac_det_id());
            
            fac_Det.setFac_det_cantidad(aut.getMod_id());
            fac_Det.setFac_det_precio(aut.getAut_precio());
            
            double subTotal=aut.getMod_id()*aut.getAut_precio();
            subTotal = Math.round(subTotal * 100) / 100d;
            fac_Det.setFac_det_sutTotal(subTotal);
            
            double iva=subTotal*0.12;
            iva = Math.round(iva * 100) / 100d;;
            fac_Det.setFac_det_iva(iva);
            
            double total=subTotal+iva;
            total = Math.round(total * 100) / 100d;     
            fac_Det.setFac_det_total(total);
            
            fac_Det.setAut_id(aut.getAut_id());
            listaDetalles.add(fac_Det);

            System.out.println("sd s"+fac_Det.getAut_id());
            return fac_Det;
            
    }
    
    public void anadirFacturaDetalle(ArrayList listaDetalle,int id){
        boolean r = false;
        Connection con = null;
        for(int i=0; i<listaDetalle.size();i++){
            FacturaDetalle fac_Det=   (FacturaDetalle) listaDetalle.get(i);
            
        String sql = "Insert Into alq_fac_detalles Values("+fac_Det.getFac_det_id()
                                                    +","+fac_Det.getFac_det_cantidad()
                                                    +","+fac_Det.getFac_det_precio()
                                                    +","+fac_Det.getFac_det_sutTotal()
                                                    +","+fac_Det.getFac_det_iva()
                                                    +","+fac_Det.getFac_det_total()
                                                    +","+id
                                                    +",'"+fac_Det.getAut_id()
                                                    +"')";
        
        
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
        }

    }
     
}
