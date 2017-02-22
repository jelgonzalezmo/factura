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
public class Producto {
    private String nombre;
    private int referencia;
    private double precio;

    public Producto(String nombre, int referencia, double precio) {
        this.nombre = nombre;
        this.referencia = referencia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getReferencia() {
        return referencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
