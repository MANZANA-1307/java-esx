package Areasjava;
import java.util.Scanner;

public class AreaHeagono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la longitud de un lado del hexágono: ");
        double lado = scanner.nextDouble();

        double perimetro = 6 * lado;

        double apotema = lado * (Math.sqrt(3) / 2);

        double area = (perimetro * apotema) / 2;

        System.out.printlnln("El área del hexágono es: " + area);
    }
}

