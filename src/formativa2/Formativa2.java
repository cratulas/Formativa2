package formativa2;

import java.util.Scanner;


public class Formativa2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresando datos del producto:");
        System.out.println("Ingrese el código:");
        int codigo = capturarEntero(scanner);

        System.out.println("Ingrese descripcion:");
        String descripcion = capturarTexto(scanner);

        System.out.println("Ingrese el precio:");
        double precio = capturarDouble(scanner);

        System.out.println("Ingrese cantidad:");
        int cantidad = capturarEntero(scanner);

        Producto producto = new Producto(codigo, descripcion, precio, cantidad);

        System.out.println("\nInformación del producto:");
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("Total a pagar: " + producto.calcularTotal());

        scanner.close();
    }
    
    
       private static int capturarEntero(Scanner scanner) {
        int valor = 0;
        int intentos = 0;

        while (intentos < 3) {
            try {
                valor = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("El valor ingresado no es válido. Intente nuevamente.");
                intentos++;
                scanner.nextLine();
            }
        }

        if (intentos == 3) {
            System.out.println("Ha superado el número máximo de intentos. Adios!.");
            System.exit(0);
        }

        return valor;
    }

    private static String capturarTexto(Scanner scanner) {
        String texto = "";
        int intentos = 0;

        while (intentos < 3) {
            try {
                texto = scanner.next();
                break;
            } catch (Exception e) {
                System.out.println("El valor ingresado no es válido. Intente nuevamente.");
                intentos++;
                scanner.nextLine();
            }
        }

        if (intentos == 3) {
            System.out.println("Ha superado el número máximo de intentos. Adios!.");
            System.exit(0);
        }

        return texto;
    }

    private static double capturarDouble(Scanner scanner) {
        double valor = 0;
        int intentos = 0;

        while (intentos < 3) {
            try {
                valor = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("El valor ingresado no es válido. Intente nuevamente.");
                intentos++;
                scanner.nextLine();
            }
        }

        if (intentos == 3) {
            System.out.println("Ha superado el número máximo de intentos. Adios!.");
            System.exit(0);
        }

        return valor;
    }
}