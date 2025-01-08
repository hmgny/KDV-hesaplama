import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz : ");
        double fiyat = input.nextDouble();

        double kdvOran = 0.18;
        double KDV = fiyat * kdvOran;
        double KDVli = fiyat + KDV;


        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV tutarı : " + KDV + "TL");
        System.out.println("KDVsiz tutar : " + fiyat + "TL");
        System.out.println("KDVli tutar: " + KDVli + "TL");


    }
}