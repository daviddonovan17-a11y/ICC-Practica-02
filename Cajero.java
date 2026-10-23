/**
 * Cajero
 */
public class Cajero {
     public static void main(String[] args) {

        // 1.1.1 Crear un producto
    Producto productoNormal = new Producto("Television", 10000.0, 2);
    Producto productoVacio = new Producto("",10000.0, 2);

    System.out.println(productoNormal.getNombre());
    System.out.println(productoVacio.getNombre());

       // 1.1.2 Crear otro producto 
       Producto precioValido = new Producto("Sabritas", 20.00, 4);
       Producto precioInvalido = new Producto("Sabritas",0.00, 4);

       System.out.println(precioValido.getPrecio());
       System.out.println(precioInvalido.getPrecio());

       // 1.1.3 Prueba de 5 casos 
       Producto caso1 = new Producto ("Playera de las chivas", 2000.0, 1);
       Producto caso2 = new Producto ("Audifonos", 2600.00, 2);
       Producto caso3 = new Producto ("Jabon", 60.0, 3);
       Producto caso4 = new Producto ("Bran Frut", 15.00, 4);
       Producto caso5 = new Producto ("Comic", 50.0, 5);

      System.out.println(caso1.toString());
      System.out.println(caso2.toString());
      System.out.println(caso3.toString());
      System.out.println(caso4.toString());
      System.out.println(caso5.toString());



     }

} 
