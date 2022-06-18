package Main;

public class Main {

    public static void main(String[] args) {
        CarRider Maki = new CarRider ("Zenin Maki", 20, "080000000120");
        CarRider Panda = new CarRider ("Panda", 22, "080000000305");
        CarRider Yuta = new CarRider ("Okkotsu Yuta", 21, "080000000307");
        CarRider Toge = new CarRider ("Inumaki Toge", 20, "080000001023");

        CarData data = new CarData();
        data.addCar ("SUV", "J 0120 JK", "Mercedes-Benz");
        data.addCar ("SPORT", "J 0305 JK", "Lexus");
        data.addCar ("ELECTRIC CAR", "J 0307 JK", "Tesla");
        data.addCar ("OFFROAD", "J 1023 JK", "Jeep");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent (Maki, data.carList.get(0), 5);
        arsip.Rent (Panda, data.carList.get(0), 3);
        arsip.Rent (Yuta, data.carList.get(1), 1);
        arsip.Rent (Toge, data.carList.get(1), 2);

        System.out.println("");
        arsip.info();
    }
}
