import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perArmut = 2.14 , perElma = 3.67 , perDomates = 1.11 , perMuz = 0.95 ,perPatlican = 5.00;
        double armut,elma,domates,muz,patlican;
        System.out.println("Kaç Kilo Armut alındı: ");
        armut = input.nextDouble();

        System.out.println("Kaç kilo Elma alındı: ");
        elma =input.nextDouble();

        System.out.println("Kaç kilo Domates alındı: ");
        domates =input.nextDouble();

        System.out.println("Kaç kilo Muz alındı: ");
        muz =input.nextDouble();

        System.out.println("Kaç kilo Patlıcan alındı: ");
        patlican = input.nextDouble();

        double ucret1 = (patlican * perPatlican);
        double ucret2 = (muz * perMuz);
        double ucret3 = (domates * perDomates);
        double ucret4 = (elma * perElma);
        double ucret5 = (armut * perArmut);

        double toplam = (ucret1 + ucret2 + ucret3 + ucret4 + ucret5);
        System.out.println(toplam);

    }
}
