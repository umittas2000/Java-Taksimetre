import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double ucret,kmUcret,acilisUcreti,hesap;
        int  mesafe;

        kmUcret = 2.20;
        acilisUcreti=10.0;

        System.out.print("Mesafe ne kadar?(KM): ");
        mesafe = input.nextInt();

        hesap = acilisUcreti + (mesafe * kmUcret);

        if(hesap<20.0)
            hesap=20.0;

        System.out.print("Toplam ucret: " + hesap + "TL.");

    }
}
