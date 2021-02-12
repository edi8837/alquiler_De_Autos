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
public class FacturaDetalle {
    
    private int fac_det_id;
    private int fac_det_cantidad;
    private double fac_det_precio;
    private double fac_det_sutTotal;
    private double fac_det_iva;
    private double fac_det_total;
    private int fac_id;
    private int aut_id;

    public FacturaDetalle() {
    }

    public int getFac_det_id() {
        return fac_det_id;
    }

    public void setFac_det_id(int fac_det_id) {
        this.fac_det_id = fac_det_id;
    }

    public int getFac_det_cantidad() {
        return fac_det_cantidad;
    }

    public void setFac_det_cantidad(int fac_det_cantidad) {
        this.fac_det_cantidad = fac_det_cantidad;
    }

    public double getFac_det_precio() {
        return fac_det_precio;
    }

    public void setFac_det_precio(double fac_det_precio) {
        this.fac_det_precio = fac_det_precio;
    }

    public double getFac_det_sutTotal() {
        return fac_det_sutTotal;
    }

    public void setFac_det_sutTotal(double fac_det_sutTotal) {
        this.fac_det_sutTotal = fac_det_sutTotal;
    }

    public double getFac_det_iva() {
        return fac_det_iva;
    }

    public void setFac_det_iva(double fac_det_iva) {
        this.fac_det_iva = fac_det_iva;
    }

    public double getFac_det_total() {
        return fac_det_total;
    }

    public void setFac_det_total(double fac_det_total) {
        this.fac_det_total = fac_det_total;
    }

    public int getFac_id() {
        return fac_id;
    }

    public void setFac_id(int fac_id) {
        this.fac_id = fac_id;
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
    }
    
    
    
}
