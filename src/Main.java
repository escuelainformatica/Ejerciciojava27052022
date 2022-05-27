import modelo.*;
import servicio.CarroDeCompraServicio;
import servicio.FacturaServicio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private int campo;

    public static void main(String[] args) {

        Producto prod=new Producto();
        Producto prod2=new Producto();
        prod.setNombre("cocacola");
        prod.setPrecioUnitario(200);
        prod2.setNombre("fanta");
        prod2.setPrecioUnitario(500);

        CarroDeCompra carroDeCompra=new CarroDeCompra();
        carroDeCompra.setCantidad(10);
        carroDeCompra.setProducto(prod);

        CarroDeCompra carroDeCompra2=new CarroDeCompra();
        carroDeCompra2.setCantidad(20);
        carroDeCompra2.setProducto(prod2);
        // control+espacio
        CarroDeCompraServicio carroDeCompraServicio=new CarroDeCompraServicio();

        int total=carroDeCompraServicio.total(carroDeCompra,carroDeCompra2);
        System.out.println("el total es "+total);

        // crear una factura
        Cliente cli=new Cliente("1111-1","John Doe","Sunset blv");
        FacturaLinea linea1=new FacturaLinea("cocacola",500,20);
        FacturaLinea linea2=new FacturaLinea("fanta",300,20);
        FacturaLinea linea3=new FacturaLinea("sprite",500,20);

        List<FacturaLinea> lineas=new ArrayList<>();
        lineas.add(linea1);
        lineas.add(linea2);
        lineas.add(linea3);



        Factura fac1=new Factura();
        fac1.setCliente(cli);
        fac1.setFecha("01-01-2022");
        fac1.setNumFactura(200);
        fac1.setFacturaLineaList(lineas);

        FacturaServicio facturaServicio=new FacturaServicio();

        facturaServicio.mostrar(fac1);


    }
}