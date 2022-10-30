/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author LUIS
 */
public class Proveedor {
    private String pcodigo;
    private String pnombre;
    private String pruc;
    private String pdireccion;
    private String ptelefono;
    private String pemail;
    private String pestado;
    private int opcion;

    public Proveedor(String pcodigo, String pnombre, String pruc, 
            String pdireccion, String ptelefono, String pemail, String pestado, int opciones) {
        this.pcodigo = pcodigo;
        this.pnombre = pnombre;
        this.pruc = pruc;
        this.pdireccion = pdireccion;
        this.ptelefono = ptelefono;
        this.pemail = pemail;
        this.pestado = pestado;
        this.opcion=opciones;
    }

    public Proveedor() {
    }

    public String getPcodigo() {
        return pcodigo;
    }

    public void setPcodigo(String pcodigo) {
        this.pcodigo = pcodigo;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getPruc() {
        return pruc;
    }

    public void setPruc(String pruc) {
        this.pruc = pruc;
    }

    public String getPdireccion() {
        return pdireccion;
    }

    public void setPdireccion(String pdireccion) {
        this.pdireccion = pdireccion;
    }

    public String getPtelefono() {
        return ptelefono;
    }

    public void setPtelefono(String ptelefono) {
        this.ptelefono = ptelefono;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public String getPestado() {
        return pestado;
    }

    public void setPestado(String pestado) {
        this.pestado = pestado;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    
    
    
    
    
}
