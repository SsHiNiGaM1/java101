import java.util.Scanner;

public class UcakBiletiHesaplama{
    public static void main(String[] args) {
        int mesafe, yas, yolculuktipi;
        double normaltutar, tutar, indirim;
        double mesafetutarı = 0.10, ogrenci = 0.10, cocuk = 0.50, yasli = 0.30, tip = 0.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe bilgisini km cinsinden yazınız: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini seçiniz 1-Tek Yön 2-Gidiş-Dönüş");
        System.out.print("Seçiminiz: ");
        yolculuktipi = input.nextInt();

        normaltutar = mesafe * mesafetutarı;
        if (mesafe > 0 && yas > 0 && (yolculuktipi == 1 || yolculuktipi == 2)) {
            if (yas < 12) {
                indirim = normaltutar * cocuk;
            } else if (yas >= 12 && yas <= 24) {
                indirim = normaltutar * ogrenci;
            } else if (yas >= 65) {
                indirim = normaltutar * yasli;
            } else {
                indirim = 0;
            }
            tutar = normaltutar - indirim;

            switch (yolculuktipi) {
                case 1:
                    tutar =tutar;
                    break;
                case 2:
                    indirim = tutar * tip;
                    tutar = (tutar - indirim) * 2;
                    break;
            }
            System.out.println("Toplam tutar: " + tutar);
        } else
            System.out.print("Hatalı giriş yaptınız!");
    }
}