package Areasjava;

public class OpercacionesArea {
 public static double MultiplicaionCuadrado(double lado ){
    return lado * lado;
 }    
 public static double MultiplicacionCirculo(double radio){
    return Math.PI * Math.pow(radio,2);
 }
    public static double OpercionTrinagulo(double base, double altura){
    return base * altura / 2 ;
 }
     public static  double OprecionesHexagono(double perimetro, double l , double apotema , double area){
    return perimetro = 6 * l;

   public static  double Oprecionespentagono(double lado, double apotema , double area){
    return 5 * lado * apotema; 
 }
}