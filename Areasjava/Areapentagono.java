import java.util.Scanner;

public class AreaPentagono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la longitud de un lado del pentágono: ");
        double lado = scanner.nextDouble();
        
        System.out.print("Introduce la apotema del pentágono: ");
        double apotema = scanner.nextDouble();
        
        double area = (5 * lado * apotema) / 2;
        
        System.out.printf("El área del pentágono es: %.2f\n", area);
        
        scanner.close();
    }
}