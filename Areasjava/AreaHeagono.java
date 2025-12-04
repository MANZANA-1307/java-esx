package Areasjava;
import java.util.Scanner;

public class AreaHeagono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir la longitud del lado al usuario
        System.out.print("Introduce la longitud de un lado del hexágono: ");
        double lado = scanner.nextDouble();

        // 2. Calcular el perímetro
        double perimetro = 6 * lado;

        // 3. Calcular la apotema (para un hexágono regular, apotema = lado * (sqrt(3) / 2))
        double apotema = lado * (Math.sqrt(3) / 2);

        // 4. Calcular el área usando la fórmula del polígono regular
        double area = (perimetro * apotema) / 2;

        // 5. Mostrar el resultado
        System.out.println("El área del hexágono es: " + area);

        scanner.close();
    }
}

