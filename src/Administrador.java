import java.util.Scanner;

public class Administrador {
    static Scanner s = new Scanner(System.in);

    public static void menuPrincipal() {
        // Cargar categorías y productos desde el archivo principal
        GestionarCategoria.cargarCategoriasYProductosDesdeJson();

        int opcion;

        do {
            System.out.println("\n1. manage products");
            System.out.println("2. manage categories");
            System.out.println("3. leave");
            System.out.print("select an option: ");
            opcion = s.nextInt();
            s.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    menuProductos();
                    break;
                case 2:
                    menuCategorias();
                    break;
                case 3:
                    System.out.println("Leaving the program...");
                    break;
                default:
                    System.out.println("Option not valid.");
            }
        } while (opcion != 3);

        // Guardar categorías y productos al finalizar
        GestionarCategoria.guardarCategoriasYProductosEnJson();
    }

    public static void menuCategorias() {
        int opcion;
        do {
            System.out.println("\n1. Add Category");
            System.out.println("2. show categories");
            System.out.println("3. Modify Categories");
            System.out.println("4. remove categories");
            System.out.println("5. leave");
            System.out.print("Please select an option: ");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    GestionarCategoria.agregarCategoria();
                    break;
                case 2:
                    GestionarCategoria.mostrarCategorias();
                    break;
                case 3:
                    GestionarCategoria.modificarCategoria();
                    break;
                case 4:
                    GestionarCategoria.eliminarCategoria();
                    break;
                case 5:
                    System.out.println("coming out");
                    break;
                default:
                    System.out.println("Option not valid.");
            }
        } while (opcion != 5);
    }

    public static void menuProductos() {
        int opcion;
        do {
            System.out.println("\n1.Add product");
            System.out.println("2. show products");
            System.out.println("3. Modify Product");
            System.out.println("4. Remove product");
            System.out.println("5. Leave");
            System.out.print("Please select an option: ");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    GestionarProductos.agregarProducto();
                    break;
                case 2:
                    GestionarProductos.mostrarProductos();
                    break;
                case 3:
                    // Lógica para modificar productos
                    GestionarProductos.modificarProducto();
                    break;
                case 4:
                    // Lógica para eliminar productos
                    GestionarProductos.eliminarProducto();
                    break;
                case 5:
                    System.out.println("coming out");
                    break;
                default:
                    System.out.println("Option not valid.");
            }
        } while (opcion != 5);
    }
}
