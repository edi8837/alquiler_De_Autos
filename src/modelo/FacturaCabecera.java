/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Edisson
 */
public class FacturaCabecera {
    
    private int fac_id;
    private Date fac_fecha;
    private double fac_subTotal;
    private double fac_iva;
    private double fac_Total;
    private char fac_estado;
    private int suc_id;
    private String cli_id;

    public FacturaCabecera() {
    }

    public int getFac_id() {
        return fac_id;
    }

    public void setFac_id(int fac_id) {
        this.fac_id = fac_id;
    }

    public Date getFac_fecha() {
        return fac_fecha;
    }

    public void setFac_fecha(Date fac_fecha) {
        this.fac_fecha = fac_fecha;
    }

    public double getFac_subTotal() {
        return fac_subTotal;
    }

    public void setFac_subTotal(double fac_subTotal) {
        this.fac_subTotal = fac_subTotal;
    }

    public double getFac_iva() {
        return fac_iva;
    }

    public void setFac_iva(double fac_iva) {
        this.fac_iva = fac_iva;
    }

    public double getFac_Total() {
        return fac_Total;
    }

    public void setFac_Total(double fac_Total) {
        this.fac_Total = fac_Total;
    }

    public char getFac_estado() {
        return fac_estado;
    }

    public void setFac_estado(char fac_estado) {
        this.fac_estado = fac_estado;
    }

    public int getSuc_id() {
        return suc_id;
    }

    public void setSuc_id(int suc_id) {
        this.suc_id = suc_id;
    }

    public String getCli_id() {
        return cli_id;
    }

    public void setCli_id(String cli_id) {
        this.cli_id = cli_id;
    }
    
    
    
    
    
}
