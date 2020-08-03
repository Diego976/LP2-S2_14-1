/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author w10
 */
public class Sugerencia {
     private int idsugerencia;
    private int area;
    private String personal;
    private int hora;
    private String fecha;

    public Sugerencia() {
    }

    public Sugerencia(int idsugerencia, int area, String personal, int hora, String fecha) {
        this.idsugerencia = idsugerencia;
        this.area = area;
        this.personal = personal;
        this.hora = hora;
        this.fecha = fecha;
    }

    public int getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(int idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
}
