import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args){
        double x1, x2, y1, y2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese las coordenadas (x;y) de Starbucks");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        System.out.println("Ingrese las coordenadas (x;y) de la persona");
        x2=sc.nextDouble();
        y2=sc.nextDouble();

        System.out.println("La distancia es de "+distancia(x1, x2, y1, y2));
        sc.close();
    }
    public static double distancia(double a,double b, double c, double d){
        double dist=Math.sqrt(Math.pow(b-a,2)+Math.pow(d-c,2));
        return dist;
    }
}
