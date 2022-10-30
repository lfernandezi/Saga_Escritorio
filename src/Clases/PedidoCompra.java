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
public class PedidoCompra {
    
    private int codigo;
    private String codEmpleado;
    private String formaPago;
    private String estado;
    private String fecha;
    private String codProveedor;
    private int opcion;

    public PedidoCompra() {
    }

    public PedidoCompra(int codigo, String codEmpleado, String formaPago, String estado, String fecha, String codProveedor, int opcion) {
        this.codigo = codigo;
        this.codEmpleado = codEmpleado;
        this.formaPago = formaPago;
        this.estado = estado;
        this.fecha = fecha;
        this.codProveedor = codProveedor;
        this.opcion = opcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(String codProveedor) {
        this.codProveedor = codProveedor;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
            
}
