import java.util.Scanner;
public class Practise {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE INITTIAL SPEED: ");
        double u = sc.nextDouble();
        System.out.println("ENTER THE ACCELERATION: ");
        double a = sc.nextDouble();
        System.out.println("ENTER THE TIME: ");
        double t = sc.nextDouble();
        double s= u*t + 0.5*a*t*t;
        System.out.println("THE DISTANCE TRAVELLED IS: "+s);
    }
}
