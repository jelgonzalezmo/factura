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
public class EjrcicioFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pago pago=new Pago("e","efectivo ");
    Producto producto =new Producto("agua",123,1236);
    Venta venta=new Venta(1,producto);
    Factura factura=new Factura(3,"jenny","02/03/2017",venta,pago);
    System.out.println("pago total= " + factura.calculartotal());
    
    
    }
    
}
