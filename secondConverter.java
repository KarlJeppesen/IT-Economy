import java.util.Scanner;

public class secondConverter {

    public static void main (String[] args) {

        System.out.println("Indtast sekunder og retur");
        Scanner ssec = new Scanner(System.in);
        int sec = ssec.nextInt();

        int secPrDay = 24*60*60;
        int secPrHour = 60*60;
        int secPrMin = 60;

        int days = sec / secPrDay;
        int remainderHours = sec % secPrDay;

        int hours = remainderHours / secPrHour;
        int remainderMins = sec % secPrHour;

        int minutes = remainderMins / secPrMin;
        int remainderSecs = sec % secPrMin;

        System.out.println(sec + " seconds equals " + days + " days, " + hours + " hours, " + minutes + " minutes and " + remainderSecs + " seconds.");

    }
}