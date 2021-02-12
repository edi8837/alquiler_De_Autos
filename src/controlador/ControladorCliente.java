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
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

/**
 *
 * @author GerardoG
 */
public class ControladorCliente {
    
    public Cliente buscarClienteObjeto(String cedula){
        Cliente cli=new Cliente();
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_clientes "
                    + " WHERE cli_id='"+cedula+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                cli.setCli_cedula(rs.getString("cli_id"));
                cli.setCli_nombre(rs.getString("cli_nombre"));
                cli.setCli_apellido(rs.getString("cli_apellido"));
                cli.setCli_direccion(rs.getString("cli_direccion"));
                cli.setCli_telf(rs.getString("cli_telf"));
                
                String estS=rs.getString("cli_estado");
                char estC=estS.charAt(0);
                cli.setCli_estado(estC);
                
                cli.setCli_email(rs.getString("cli_email"));

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return cli;
    }
    
    public boolean buscarCliente(String cedula){
        boolean ban=false;
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM alq_clientes "
                    + " WHERE cli_id='"+cedula+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){ 
                ban=true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public boolean anadirCliente(Cliente cli){
        boolean r = false;
        Connection con = null;
       
        String sql = "Insert Into alq_clientes Values('"+cli.getCli_cedula()
                +"','"+cli.getCli_nombre()
                +"','"+cli.getCli_apellido()
                +"','"+cli.getCli_direccion()
                +"','"+cli.getCli_telf()
                +"','"+cli.getCli_estado()
                +"','"+cli.getCli_email()
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

        return r;
    }
    
    public boolean eliminarCliente(String cedula){
        boolean r = false;
        Connection con = null;
       
        String sql = "DELETE FROM  alq_clientes WHERE cli_id = "+cedula;
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
    
    public boolean actualizarCliente(Cliente cli){
        boolean r = false;
        Connection con = null;
       
        String sql = "UPDATE alq_clientes SET cli_nombre= '"+ cli.getCli_nombre()
                +"', cli_apellido='"+cli.getCli_apellido()
                +"', cli_direccion='"+cli.getCli_direccion()
                +"', cli_telf='"+cli.getCli_telf()
                +"', cli_email='"+cli.getCli_email()
                + "' WHERE cli_id = '"+cli.getCli_cedula()+"'";
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
    
    
    public void llenarTabla(DefaultTableModel dtm,Object [] o){
        Connection con = null;

        String sql = " SELECT *"
                    + " FROM alq_clientes";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                //String ObjetoS[]=new String [8];
                o[0] = rs.getString("cli_id");
                o[1] = rs.getString("cli_nombre");
                o[2]=rs.getString("cli_apellido");
                o[3]=rs.getString("cli_telf");
                o[4]=rs.getString("cli_direccion");
                o[5]=rs.getString("cli_email");

                dtm.addRow(o);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }
}
