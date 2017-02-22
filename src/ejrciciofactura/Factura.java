/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrciciofactura;

import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Factura {
    private int numero ;
    private String cliente;
    private String fecha;
    private Venta venta;
    private Pago pago;

    public double calculartotal(){
    Venta v=this.venta;
    double subtotal=v.calcularsubtotal();
    return   subtotal;      
    }
    
    public Factura(int numero, String cliente, String fecha, Venta venta, Pago pago) {
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = fecha;
        this.venta = venta;
        this.pago = pago;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public Venta getVenta() {
        return venta;
    }

    public Pago getPago() {
        return pago;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    


}
