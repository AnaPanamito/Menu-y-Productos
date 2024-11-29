// Interfaz IMenu
public interface IMenu {
    void agregarProducto(Producto producto);
    void agregarCategoria(Categoria categoria);
    void eliminarCategoria(Categoria categoria);
    void eliminarProducto(Producto producto);
    void modificarCategoria(Categoria categoria);
    void modificarProducto(Producto producto);
    Categoria buscarCategoria(String nombreCategoria);
    Producto buscarProducto(String nombreProducto);
    void mostrarMenu();
}
