
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    double tutar, kdvOran, kdvTutar, kdvliTutar, err;

    Scanner input = new Scanner(System.in);

    System.out.println("Tutarı Giriniz");
    tutar = input.nextDouble();

    kdvOran = tutar < 1000 ? (0.18) : (0.08);
        System.out.println("KDV Oranınız: " + kdvOran + "%");
        System.out.println();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdv içermeyen tutar :" + tutar);
        System.out.println("Kdv oranı: " + kdvOran + "%");
        System.out.println("Kdv tutarı:" + kdvTutar);
        System.out.println("Kdv dahil tutar:" + kdvliTutar);



    }
}
