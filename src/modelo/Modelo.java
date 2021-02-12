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
public class Modelo {
   
    private int id;
    private String nombre;
    private int mar_id;
    private String nombreMarca;



    public Modelo() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
    
    public int getMar_id() {
        return mar_id;
    }

    public void setMar_id(int mar_id) {
        this.mar_id = mar_id;
    }
    
    
}
