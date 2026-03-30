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

        rectangular.loadCargo(40);
        cylindrical.loadCargo(50);

        // UC4: Train Composition
        TrainComposition composition = new TrainComposition(engine);
        composition.addPassengerBogie(sleeper);
        composition.addPassengerBogie(acChair);
        composition.addGoodsBogie(rectangular);
        composition.addGoodsBogie(cylindrical);

        composition.showComposition();
        composition.checkSafety();
    }
}