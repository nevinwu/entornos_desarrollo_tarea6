package tarea.seis;

/**
 * @author Francisco Martinez Pico - 15445035Y
 */
public class Tarea6EDClase {
    
    public void aplicarDescuento(double precioProducto, int numProductos){ 
        
        double total;
        
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_TRES_PRODUCTOS;
        }
        
        if (numProductos != 0){
            total = precioProducto * TASA_UNO;
            screenTotal(total);
                    
        } else {
            total = precioProducto * TASA_DOS;
            screenTotal(total);
        }   
    } 

    public void screenTotal(double total) {
        String mensaje = "El total a pagar es: " + total;
        
        System.out.println(mensaje);
        System.out.println("Enviado");
    }

    private static final double TASA_DOS = 0.95;
    private static final double TASA_UNO = 0.8;
    private static final int DESCUENTO_TRES_PRODUCTOS = 5;
}
