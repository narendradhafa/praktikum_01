import java.util.Scanner;

public class SuratKaisar {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kalimat = input.nextLine();
        char[] huruf = kalimat.toCharArray();
        int pergeseran = input.nextInt();

        for (int i = 0; i < huruf.length; i++) {
            switch (cekJenisChar(huruf[i])) {
                case 1 -> geserHurufKapital(huruf[i], pergeseran);
                case 2 -> geserHurufKecil(huruf[i], pergeseran);
                default -> System.out.print(huruf[i]);
            }
        }
    }

    public static int cekJenisChar(char huruf) {
        if (huruf <= 122 && huruf >= 97) {
            return 1;
        } else if (huruf <= 90 && huruf >= 65) {
            return 2;
        } else return 0;
    }

    public static void geserHurufKapital(char huruf, int pergeseran) {
        huruf += pergeseran;
        if (huruf > 122) {
            while (huruf > 122) {
                huruf -= 26;
            }
        }
        System.out.print(huruf);
    }

    public static void geserHurufKecil(char huruf, int pergeseran) {
        huruf += pergeseran;
        if (huruf > 90) {
            while (huruf > 90) {
                huruf -= 26;
            }
        }
        System.out.print(huruf);
    }


}
