package Areasjava;
   import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir la base
        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();

        // 2. Pedir la altura
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // 3. Calcular el área
        // Usamos double para permitir decimales
        double area = (base * altura) / 2;

        // 4. Mostrar el resultado
        System.out.println("------------------------------");
        System.out.println("El área del triángulo es: " + area);

        // Cerrar el scanner (buena práctica)
        scanner.close();
    }
}