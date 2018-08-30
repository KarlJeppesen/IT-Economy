import java.util.Scanner;

public class distCalc {

    public static void main(String[] args) {

        System.out.println("Indtast a og retur");
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        System.out.println("Indtast b og retur");
        Scanner sb = new Scanner(System.in);
        int b = sb.nextInt();
        System.out.println("Indtast x og retur");
        Scanner sx = new Scanner(System.in);
        int x = sx.nextInt();
        System.out.println("Indtast y og retur");
        Scanner sy = new Scanner(System.in);
        int y = sy.nextInt();

        double dist = (Math.abs(a * x - y + b)) / Math.sqrt(1 + a * a);
        System.out.println("Afstanden er " + dist);
    }
}
