import java.util.Scanner;

public class Selde {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        long angka = input.nextLong();
        cekSelde(angka);
    }

    public static void cekSelde(long angka) {
        String stringAngka = String.valueOf(angka);

        String angkaTerbalik = tukarPosisi(stringAngka);

        if (angkaTerbalik.equals(stringAngka)) {
            System.out.println(stringAngka + " adalah selde.");
        } else {
            System.out.println(stringAngka + " bukan selde.");
        }
    }

    public static String tukarPosisi(String angka) {
        char[] charAngka = angka.toCharArray();

        String angkaTerbalik = "";

        for (int i = angka.length() - 1; i >= 0; i--) {
            angkaTerbalik += charAngka[i];
        }

        return angkaTerbalik;
    }
}
