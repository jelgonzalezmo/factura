/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrciciofactura;

/**
 *
 * @author Estudiante
 */
public class Venta {
    private int  cantidad;
    private Producto producto;

    public double calcularsubtotal(){
    
        Producto p =this.producto;
        double precio= p.getPrecio();
        return this.cantidad*precio;}
    
    public Venta(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
