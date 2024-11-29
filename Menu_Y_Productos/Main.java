public class Main {
    public static void main(String[] args) {
        // Crear un menú
        Menu menu = new Menu("Principal");
        menu.activarMenu(true);

        // Crear categorías
        Categoria bebidas = new Categoria("Bebidas");
        Categoria platosPrincipales = new Categoria("Platos Principales");

        // Agregar categorías al menú
        menu.agregarCategoria(bebidas);
        menu.agregarCategoria(platosPrincipales);

        // Crear productos
        Producto cafe = new Producto("Café", 1.50f, "Café orgánico y caliente", "Bebidas", true);
        Producto tamal = new Producto("Tamal", 1.00f, "Tamal de pollo", "Platos Principales", true);

        // Agregar productos a las categorías
        bebidas.agregarProducto(cafe);
        platosPrincipales.agregarProducto(tamal);

        // Mostrar el menú
        menu.mostrarMenu();
    }
}
