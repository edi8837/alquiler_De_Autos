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
public class Cliente {
    
    private String cli_cedula;
    private String cli_nombre;
    private String cli_apellido;
    private String cli_direccion;
    private String cli_telf;
    private char cli_estado;
    private String cli_email;

    public Cliente() {
    }

    public String getCli_cedula() {
        return cli_cedula;
    }

    public void setCli_cedula(String cli_cedula) {
        this.cli_cedula = cli_cedula;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_apellido() {
        return cli_apellido;
    }

    public void setCli_apellido(String cli_apellido) {
        this.cli_apellido = cli_apellido;
    }

    public String getCli_direccion() {
        return cli_direccion;
    }

    public void setCli_direccion(String cli_direccion) {
        this.cli_direccion = cli_direccion;
    }

    public String getCli_telf() {
        return cli_telf;
    }

    public void setCli_telf(String cli_telf) {
        this.cli_telf = cli_telf;
    }

    public char getCli_estado() {
        return cli_estado;
    }

    public void setCli_estado(char cli_estado) {
        this.cli_estado = cli_estado;
    }

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }
            
    
}
