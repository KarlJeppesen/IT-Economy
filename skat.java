public class skat {
    public static void main(String[] args) {
        int indkomst = 120000;
        double ambi, pension, bundskat;

        ambi = indkomst * 8.0 / 100.0;
        pension = indkomst * 1.0 / 100.0;
        bundskat = (indkomst - ambi) * 7.0 / 100.0;

        System.out.print("Arbejdsmarkedsbidrag: ");
        System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        System.out.print("Bundskat: ");
        System.out.println(bundskat);

    }
}