import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {

        int km;
        double perKm=2.20, total, startPrice=10;
        Scanner scan= new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz:");
        km= scan.nextInt();

        total =km*perKm;
        total+= startPrice;

        total=(total<20)?20:total;
        System.out.println("Toplamtutar:" + total);

    }
}
