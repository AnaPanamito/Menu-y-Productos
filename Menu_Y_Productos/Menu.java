// Clase Menu que implementa la interfaz IMenu
import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {
    private boolean activo;
    private String nombre;
    private List<Categoria> categorias;

    public Menu(String nombre) {
        this.nombre = nombre;
        this.activo = false;
        this.categorias = new ArrayList<>();
    }

    public void activarMenu(boolean activo) {
        this.activo = true;
        System.out.println("El menú ha sido " + (activo ? "activado" : "desactivado"));
    }

    public void desactivarMenu(boolean activo) {
        this.activo = false;
        System.out.println("El menú ha sido " + (activo ? "desactivado" : "activado"));
    }

    @Override
    public void agregarProducto(Producto producto) {
        if (!categorias.isEmpty()) {
            categorias.get(0).agregarProducto(producto);
        }
    }

    @Override
    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }
    

    @Override
    public void eliminarCategoria(Categoria categoria) {
    }

    @Override
    public void eliminarProducto(Producto producto) {
    }

    @Override
    public void modificarCategoria(Categoria categoria) {
    }

    @Override
    public void modificarProducto(Producto producto) {
    }

    @Override
    public Categoria buscarCategoria(String nombreCategoria) {
        return null;
    }

    @Override
    public Producto buscarProducto(String nombreProducto) {
        return null;
    }

    @Override
    public void mostrarMenu() {
        System.out.println("Menú " + nombre);
        for (Categoria categoria : categorias) {
            System.out.println("------ " + categoria.getNombre() + " --------");
            for (Producto producto : categoria.getProductos()) {
                System.out.println("> " + producto.getNombre() + ": " + producto.getPrecio());
                System.out.println("Descripción: " + producto.getDescripcion());
            }
        }
    }
}
