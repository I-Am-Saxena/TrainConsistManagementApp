package src;

public class Main {
    public static void main(String[] args) {
        TrainEngine engine = new TrainEngine("Diesel");
        engine.start();

        PassengerBogie sleeper = new PassengerBogie("Sleeper", 50);
        PassengerBogie acChair = new PassengerBogie("AC Chair", 30);

        sleeper.showInfo();
        acChair.showInfo();

        sleeper.bookSeat();
        acChair.bookSeat();

        GoodsBogie rectangular = new GoodsBogie("Rectangular", 100);
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical", 80);

        rectangular.showInfo();
        cylindrical.showInfo();

        rectangular.loadCargo(40);
        cylindrical.loadCargo(50);
    }
}