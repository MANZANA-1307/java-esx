package Areasjava;
   import java.util.Scanner;

 class AreaCuadrado {
   
   
   public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   
   sc.useLocale(Locale.US);
   

   System.out.println( "ingresa el valor del lado ");
   

   
   double lado = sc.nextDouble();
   
   double area =lado * lado;
   

   System.out.println("El area del cuadrado es:" + area);
   }
   }