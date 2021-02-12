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
public class Formulario {

    private int form_id;
    private Date incio_fecha;
    private String descripcion;
    private int aut_id;
    private Date fecha_fin;
public Formulario(){
    
}
    public int getForm_id() {
        return form_id;
    }

    public void setForm_id(int form_id) {
        this.form_id = form_id;
    }

    public Date getIncio_fecha() {
        return incio_fecha;
    }

    public void setIncio_fecha(Date incio_fecha) {
        this.incio_fecha = incio_fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Formulario(int form_id, Date incio_fecha, String descripcion, int aut_id, Date fecha_fin) {
        this.form_id = form_id;
        this.incio_fecha = incio_fecha;
        this.descripcion = descripcion;
        this.aut_id = aut_id;
        this.fecha_fin = fecha_fin;
    }

}