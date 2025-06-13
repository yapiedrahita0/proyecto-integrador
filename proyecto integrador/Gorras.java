// hacer ejercicio de logica en javat de venta de productos de gorras, clasicas, planas y top utilizando con ciclo mientras, para y while

package gorras;

// Libreria 

import java.util.Scanner;


public class Gorras {

    //
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Precios de las gorras
        int precioClasica = 55;
        int precioTop = 65;
        int precioPlana = 50;
        
        int total = 0;
        String tipoGorra;
        int cantidad;
        
        // Bucle 'while' para repetir la compra hasta que el usuario ingrese "salir"
        while (true) {
            System.out.println("Ingrese el tipo de gorra (clasica, top, plana) o 'salir' para terminar:");
            tipoGorra = scanner.nextLine().toLowerCase();

            if (tipoGorra.equals("salir")) {
                break;
            }

            System.out.println("Ingrese la cantidad:");
            cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Determinar el precio y sumar al total
            switch (tipoGorra) {
                case "clasica":
                    total += cantidad * precioClasica;
                    break;
                case "top":
                    total += cantidad * precioTop;
                    break;
                case "plana":
                    total += cantidad * precioPlana;
                    break;
                default:
                    System.out.println("Tipo de gorra no válido.");
            }
        }
        System.out.println("El total a pagar es: $" + total);
        scanner.close();      
                
    }
    
}
