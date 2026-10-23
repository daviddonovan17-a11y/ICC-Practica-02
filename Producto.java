public class Producto {
      private String nombre;
      private double precio;
      private String departamento;

        //Método constructor
    public Producto(String nombre, double precio, int departamento) {
        this.nombre = validarNombre(nombre);
        this.precio = validarPrecio(precio);
        this.departamento = determinarDepartamento(departamento);
    }
      
    //Método auxiliar para cambiar el nombre
    private String validarNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return "Producto desconocido";
        }
        return nombre;
    }
        // Método auxiliar para cambiar el precio
        private double validarPrecio(double precio) {
            if (precio <= 0) {
                return 100.0; 
            }
            return precio;
        }

        // Método auxiliar para determinar el departamento
        private String determinarDepartamento(int departamento) {
            switch (departamento) {
                case 1:
                    return "Ropa";
                case 2:
                    return "Electronica y tecnologia";
                case 3:
                    return "Higiene y cuidado personal";
                case 4:
                    return "Alimentos";
                case 5:
                    return "Departamento desconocido";
                 }
                return "Departamento desconocido";
            }

            public String getNombre() {
                return nombre;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public double getPrecio() {
                return precio;
            }
            public void setPrecio(double precio) {
                this.precio = precio;
            }
            public String getDepartamento() {
                return departamento;
            }
            public void setDepartamento(String departamento) {
                this.departamento = departamento;
            }
 
         // Método toString 
    @Override
    public String toString() {
        return String.format("Producto: %s, Precio: %.2f, Departamento: %s", nombre, precio, departamento);
    }
}