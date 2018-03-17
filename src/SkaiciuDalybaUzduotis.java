import java.util.Scanner;

public class SkaiciuDalybaUzduotis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite pirmaji skaiciu");
        double x = sc.nextInt();
        System.out.println("Iveskite anraji skaiciu");
        double y = sc.nextInt();
        if (y == 0) {
            do {
                System.out.println("Iveskite anraji skaiciu");
                y = sc.nextInt();
            }
            while (y == 0);
            skaiciuDalijimas(x, y);
        } else {
            skaiciuDalijimas(x, y);
        }

    }

    private static void skaiciuDalijimas(double x, double y) {
        double dalijimoRezultaas = x / y;
        System.out.println("Padalinus skaiciu " + x + " is " + y + " gavosi = " + dalijimoRezultaas);
    }

}
