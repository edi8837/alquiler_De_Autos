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
public class Usuario {
    
    private String usu_cedula;
    private String usu_nombre;
    private String usu_apellido;
    private String usu_telf;
    private String usu_telf_con;
    private String usu_email;
    private String usu_direccion;
    private String usu_username;
    private String usu_password;
    private int tip_usuario;
    private int suc_id;

    public Usuario() {
    }

    public String getUsu_cedula() {
        return usu_cedula;
    }

    public void setUsu_cedula(String usu_cedula) {
        this.usu_cedula = usu_cedula;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_apellido() {
        return usu_apellido;
    }

    public void setUsu_apellido(String usu_apellido) {
        this.usu_apellido = usu_apellido;
    }

    public String getUsu_telf() {
        return usu_telf;
    }

    public void setUsu_telf(String usu_telf) {
        this.usu_telf = usu_telf;
    }

    public String getUsu_telf_con() {
        return usu_telf_con;
    }

    public void setUsu_telf_con(String usu_telf_con) {
        this.usu_telf_con = usu_telf_con;
    }

    public String getUsu_email() {
        return usu_email;
    }

    public void setUsu_email(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getUsu_direccion() {
        return usu_direccion;
    }

    public void setUsu_direccion(String usu_direccion) {
        this.usu_direccion = usu_direccion;
    }

    public String getUsu_username() {
        return usu_username;
    }

    public void setUsu_username(String usu_username) {
        this.usu_username = usu_username;
    }

    public String getUsu_password() {
        return usu_password;
    }

    public void setUsu_password(String usu_password) {
        this.usu_password = usu_password;
    }

    public int getTip_usuario() {
        return tip_usuario;
    }

    public void setTip_usuario(int tip_usuario) {
        this.tip_usuario = tip_usuario;
    }

    public int getSuc_id() {
        return suc_id;
    }

    public void setSuc_id(int suc_id) {
        this.suc_id = suc_id;
    }

    
}
