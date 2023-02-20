import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int numerButa1;

        System.out.println("Podaj numer buta:");
        numerButa1 = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj swoją średnią z polskiego: ");
        double srednia = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj swoje imię: ");
        String imie = klawiatura.nextLine();

        System.out.println("Twój numer buta to: " + numerButa1 +
                ", twoja średnia z polskiego: " + srednia +
                ", imię: " + imie);

    }
}
