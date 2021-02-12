/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Edisson
 */
public class Auto {
    
    private int aut_id;
    private String aut_placa;
    private String aut_potencia;
    private char aut_estado;
    private char aut_nacional_extra;
    private int mod_id;
    private int tipo_aut_id;
    private double aut_precio;
    private int aut_sucu;
    

    public Auto() {
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
    }

    public String getAut_placa() {
        return aut_placa;
    }

    public void setAut_placa(String aut_placa) {
        this.aut_placa = aut_placa;
    }

    public String getAut_potencia() {
        return aut_potencia;
    }

    public void setAut_potencia(String aut_potencia) {
        this.aut_potencia = aut_potencia;
    }

    public char getAut_estado() {
        return aut_estado;
    }

    public void setAut_estado(char aut_estado) {
        this.aut_estado = aut_estado;
    }

    public char getAut_nacional_extra() {
        return aut_nacional_extra;
    }

    public void setAut_nacional_extra(char aut_nacional_extra) {
        this.aut_nacional_extra = aut_nacional_extra;
    }

    public int getMod_id() {
        return mod_id;
    }

    public void setMod_id(int mod_id) {
        this.mod_id = mod_id;
    }

    public int getTipo_aut_id() {
        return tipo_aut_id;
    }

    public void setTipo_aut_id(int tipo_aut_id) {
        this.tipo_aut_id = tipo_aut_id;
    }

    public double getAut_precio() {
        return aut_precio;
    }

    public void setAut_precio(double aut_precio) {
        this.aut_precio = aut_precio;
    }

    public int getAut_sucu() {
        return aut_sucu;
    }

    public void setAut_sucu(int aut_sucu) {
        this.aut_sucu = aut_sucu;
    }
    
    
    
    
}
