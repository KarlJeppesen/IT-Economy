import java.util.Scanner;
import java.util.ArrayList;

public class andengradsLigning {

    public static void main (String[] args) {

        System.out.println("Indtast A, B og C adskilt af mellemrum");
        Scanner scan = new Scanner(System.in);
        String sA = scan.next();
        String sB = scan.next();
        String sC = scan.next();
        double A = Double.parseDouble(sA);
        double B = Double.parseDouble(sB);
        double C = Double.parseDouble(sC);

        double d = B * B - 4 * A * C;

        if (d < 0) {
            System.out.println("Ingen rødder");
        } else if (d == 0) {
            double x1 = ((B * -1) + Math.sqrt(d)) / (2 * A);
            System.out.println("x1");
        } else {
            double x1 = ((B * -1) + Math.sqrt(d)) / (2 * A);
            double x2 = ((B * -1) - Math.sqrt(d)) / (2 * A);
            System.out.println(x1 + " " + x2);
        }
    }
}
