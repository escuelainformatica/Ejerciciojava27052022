package servicio;

import modelo.Factura;
import modelo.FacturaLinea;

public class FacturaServicio {

    public void mostrar(Factura factura) {
        System.out.println("factura:-----------------");
        System.out.println("Num: "+ factura.getNumFactura());
        System.out.println("Fecha: "+factura.getFecha());
        System.out.println("Cliente: "+factura.getCliente().getNombre());
        System.out.println("-------------------------");
        // for
        // while
        // for each
        int cantidad=factura.getFacturaLineaList().size();
        for(int i=0;i<cantidad;i=i+1) {
            System.out.println(factura.getFacturaLineaList().get(i).getDescripcion() + "\t|"
                    + factura.getFacturaLineaList().get(i).getCantidad() + "\t|" +
                    +factura.getFacturaLineaList().get(i).getPrecioUnitario());
        }
        // for each
        for (FacturaLinea linea : factura.getFacturaLineaList() ) {
            System.out.println(linea.getDescripcion()+"\t|"+
                    linea.getCantidad()+"\t|"+
                    linea.getPrecioUnitario());
        }


    }
}
