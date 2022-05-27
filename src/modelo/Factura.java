package modelo;

import java.util.List;

public class Factura {
    private int numFactura;
    private String fecha;
    private Cliente cliente; // muchos es a uno.
    private List<FacturaLinea> facturaLineaList;  // se llama una relacion "uno es a muchos".

    public Factura() {
    }

    public Factura(int numFactura, String fecha, Cliente cliente, List<FacturaLinea> facturaLineaList) {
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.facturaLineaList = facturaLineaList;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<FacturaLinea> getFacturaLineaList() {
        return facturaLineaList;
    }

    public void setFacturaLineaList(List<FacturaLinea> facturaLineaList) {
        this.facturaLineaList = facturaLineaList;
    }
}
