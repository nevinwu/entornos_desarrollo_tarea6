package tarea.seis;

// Esta es la rama de prueba que subiremos a Github
/**
 * Esta clase representa un programa para calcular el descuento aplicado a un producto.
 * Permite calcular el total a pagar en función del precio y la cantidad de productos.
 * 
 * @author Francisco Martinez Pico - 15445035Y
 */
public class Tarea6EDClase {
    
    /**
     * Aplica un descuento al precio de un producto y muestra el total a pagar.
     * Si el número de productos es mayor que 3, se aplica un descuento adicional.
     * El total a pagar se calcula multiplicando el precio por una tasa de descuento,
     * que depende de la cantidad de productos.
     * 
     * @param precioProducto el precio del producto
     * @param numProductos la cantidad de productos
     */
    
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

    
    /**
     * Muestra en pantalla el total a pagar.
     * 
     * @param total el total a pagar
     */
    public void screenTotal(double total) {
        String mensaje = "El total a pagar es: " + total;
        System.out.println(mensaje);
    }

    private static final double TASA_DOS = 0.95;
    private static final double TASA_UNO = 0.8;
    private static final int DESCUENTO_TRES_PRODUCTOS = 5;
}
