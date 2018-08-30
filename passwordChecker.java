import java.util.Scanner;

public class passwordChecker {

    public static void main (String[] args) {

        System.out.println("Indtast password og retur");
        Scanner spassword = new Scanner(System.in);
        String password = spassword.nextLine();

        int strlength = password.length();

        if (strlength < 5) {
            System.out.println("Password for kort");
        } else if (strlength > 8) {
            System.out.println("Password for langt");
        } else {
            System.out.println("Password tilpas");
        }

    }

}
