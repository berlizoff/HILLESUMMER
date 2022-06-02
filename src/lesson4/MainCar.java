package lesson4;

public class MainCar {
    public static void main(String[] args) {
        double stoimostbenz = 33;
        double sumazapravki;
        Car ferrari = new Car(70, 40, 9.4);
        //общий маршрут 474 км
        //до кривого озера 179 км
        //до жашкова 153 км
        System.out.println("Перед поездкой Одесса - Киев заправим полный бак ");
        ferrari.polnyibak();
        System.out.println("До Кривого озера 179 км");
        double benzin = ferrari.kmlitrov();
        sumazapravki = stoimostbenz * benzin;
        double allcena = 0;
        allcena = sumazapravki + allcena;
        System.out.println("       " + allcena);
        System.out.println("До Жашкова 153 км");
        benzin = ferrari.kmlitrov();
        sumazapravki = stoimostbenz * benzin;
        allcena = sumazapravki + allcena;
        System.out.println("       " + allcena);
        System.out.println("До Киева осталось 142 км");
        ferrari.kmlitrov();
        System.out.println("На бензин было потрачено " + allcena);

    }
}
