package homework6;

public class Main {
    public static final String separator = "\n--------------------------------------------------------\n";

    public static void main(String[] args) {
        EasyTransport easyTransport = new EasyTransport(100.0, 220.0, 3.5, Brand.AUDI, 4, 7.0, BodyCar.SEDAN, 4);
        CargoTransport cargoTransport = new CargoTransport(400.0, 150.0, 8.0, Brand.SCANIA, 4, 40.0, 25.0);
        CivilTransport civilTransport = new CivilTransport(1000.0, 2500.0, 60.0, Brand.AIRBUS, 30.0, 10000.0, 125, true);
        MilitaryTransport militaryTransport = new MilitaryTransport(1000.0, 2500.0, 60.0, Brand.B52, 10.0, 5000.0, false, 10);

        System.out.println(easyTransport + separator);
        System.out.println(cargoTransport + separator);
        System.out.println(civilTransport + separator);
        System.out.println(militaryTransport + separator);
        //-------------------------------------------------
        easyTransport.way(5.4);
        System.out.println(separator);
        //-------------------------------------------------
        cargoTransport.liftingFull(27.0);
        System.out.println(separator);
        //-------------------------------------------------
        civilTransport.countPassengersFull(120);
        System.out.println(separator);
        //-------------------------------------------------
        militaryTransport.shot();
        System.out.print("Осталось ракет: " + militaryTransport.getCountWeapon());
        System.out.println();
        militaryTransport.isCatapulta();
        System.out.println(separator);
    }
}
