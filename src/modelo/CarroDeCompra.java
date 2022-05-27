package modelo;

// tiene una dependencia de la clase Producto.

public class CarroDeCompra {

    private int cantidad;
    private Producto producto; // muchos es a uno (o varios es a uno).

    // muchos es a uno.   <-- base de datos.
    // llave foranea <--- base de datos
    // lista desplegable <-- visual
    // un campo definido por una clase <-- java
    // muchos carro de compra pueden usar un producto.


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
