package lesson4;

import java.util.Scanner;

public class Car {
    static double obem;
    double ostatok;
    static double rashod;

    public Car(int obem, int ostatok, double rashod) {
        this.obem = obem;
        this.ostatok = ostatok;
        this.rashod = rashod;

    }

    public void polnyibak() {
        System.out.println("У вас в баке " + ostatok + " литров");
        double nujno = obem - ostatok;
        System.out.println("Заливаем " + nujno + " литров до полного бака");
        ostatok = obem;
    }

    public void ostatoktopliva() {
        System.out.println("Сколько вы проехали километров? ");
        Scanner scanner = new Scanner(System.in);
        double rast = scanner.nextDouble();
        double ostatokkm;
        ostatokkm = ostatok - (rashod / 100 * rast);
        System.out.println("У вас осталось " + ostatokkm + " литров");

    }

    public double kmlitrov() {
        System.out.println("Сколько км до ближайшей заправки?");
        Scanner scanner = new Scanner(System.in);
        double rast = scanner.nextDouble();
        double benz = rashod/100*rast;
        double ostatokm;
        ostatokm = ostatok - benz;
        System.out.println("У вас осталось " + ostatokm + " литров" + " вам надо дозаправить на " + benz + " литров");
        return benz;
    }
}



