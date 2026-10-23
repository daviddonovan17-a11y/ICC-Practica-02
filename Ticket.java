public class Ticket {
    // Atributos
    private Producto producto1;
    private Producto producto2;
    private double total;
    private double dinerorecibido;
    private double cambiorecibido; 
    
    //Método Tiket(Producto producto1, Producto producto2, double total, double dinerorecibido, double cambiorecibido)constructor
    public Ticket(Producto producto1, Producto producto2, double dinerorecibido) {
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.dinerorecibido = dinerorecibido;
        this.total = producto1.getPrecio() + producto2.getPrecio();
        this.cambiorecibido = dinerorecibido - total;

    }

    //Métodos de acceso
    public Producto getProducto1() {
        return producto1;
    }
    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
        actualizarTotales();
    }
    public Producto getProducto2() { 
        return producto2;
    }
    public void setProducto2(Producto producto2) {
    this.producto2 = producto2;
        actualizarTotales();
    }
    public double getDinerorecibido() {
        return dinerorecibido;
    }
    public void setDinerorecibido(double dinerorecibido) {
        this.dinerorecibido = dinerorecibido;
        this.cambiorecibido = dinerorecibido - total;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getCambiorecibido() {
        return cambiorecibido;
    }
    public void setCambiorecibido(double cambiorecibido) {
        this.cambiorecibido = cambiorecibido;
    }

    private void actualizarTotales() {
        this.total = producto1.getPrecio() + producto2.getPrecio();
        this.cambiorecibido = dinerorecibido - total;
    }

   @Override
   public String toString() {
        return String.format("Ticket:\nProducto 1: %s\nProducto 2: %s\nTotal: %.2f\nDinero recibido: %.2f\nCambio recibido: %.2f",
                producto1.getNombre(), producto2.getNombre(), total, dinerorecibido, cambiorecibido);
}
}
