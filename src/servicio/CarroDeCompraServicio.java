package servicio;


import modelo.CarroDeCompra;

// tiene una dependencia de la clase CarroDeCompra.
public class CarroDeCompraServicio {

    public int total(CarroDeCompra cs,CarroDeCompra cs2) {
        int resultado=0;
        resultado=cs.getCantidad()*cs.getProducto().getPrecioUnitario() +
                cs2.getCantidad()*cs2.getProducto().getPrecioUnitario();
        return resultado;
    }
}
