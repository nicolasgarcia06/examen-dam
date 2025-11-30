
import java.util.Scanner;

public class CentroControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println(" === CENTRO DE CONTROL ===");
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Calcular descuento");
            System.out.println("3. Evaluar temperatura");
            System.out.println("0. Salir");
            System.out.println("Elige una opción (0-3):");

            try {
                n = Integer.parseInt(sc.nextLine());
                switch (n) {
                    case 1 -> System.out.println("Hola a todos");
                    case 2 -> CalcularMetodo(sc);
                    case 3 -> TemperaturaGrados(sc);
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida");
                }
            } catch (Exception e) {
                System.out.println("Error, introduce un número válido");
            }
        } while (n != 0);

        sc.close();
    }

    public static void CalcularMetodo(Scanner sc) {
        System.out.println("Introduce el precio en euros:");
        double precio = sc.nextDouble();
        sc.nextLine(); // limpiar buffer
        double descuento = precio * 0.10;
        double precioFinal = precio - descuento;
        System.out.printf("El precio final es %.2f €\n", precioFinal);
    }

    public static void TemperaturaGrados(Scanner sc) {
        System.out.println("Introduce temperatura:");
        int temperatura = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        if (temperatura <= 15) {
            System.out.println("Hace frío");
        } else if (temperatura <= 25) {
            System.out.println("Templado");
        } else {
            System.out.println("Hace calor");
        }
    }
}
