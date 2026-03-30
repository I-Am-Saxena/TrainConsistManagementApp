package src;

public class Main {

    public static void main(String[] args) {

        // ---------- UC1: Train Engine Setup ----------
        TrainEngine engine = new TrainEngine("Diesel Engine", 5000);
        System.out.println("Engine initialized: " + engine.getType());

        // ---------- UC2: Passenger Bogies ----------
        PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
        PassengerBogie acChair = new PassengerBogie("AC Chair", 60);
        PassengerBogie firstClass = new PassengerBogie("First Class", 50);

        // Book some seats
        sleeper.bookSeats(40);
        acChair.bookSeats(50);
        firstClass.bookSeats(30);

        // ---------- UC3: Goods Bogies ----------
        GoodsBogie rectangular = new GoodsBogie("Rectangular", 100);
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical", 120);

        // Load cargo
        rectangular.loadGoods(80);
        cylindrical.loadGoods(90);

        // ---------- UC4: Train Composition ----------
        TrainComposition composition = new TrainComposition(engine);
        composition.addPassengerBogie(sleeper);
        composition.addPassengerBogie(acChair);
        composition.addPassengerBogie(firstClass);
        composition.addGoodsBogie(rectangular);
        composition.addGoodsBogie(cylindrical);

        // ---------- UC5: Show Composition ----------
        composition.showComposition();

        // ---------- UC6: Goods Management ----------
        rectangular.loadGoods(15);  // add more goods
        cylindrical.unloadGoods(30); // remove some goods
        System.out.println("Updated Goods Status:");
        System.out.println(rectangular);
        System.out.println(cylindrical);

        // ---------- UC7: Composition Safety & Validation ----------
        CompositionSafety safety = new CompositionSafety(composition);
        safety.validate();

        // ---------- Final Composition Display ----------
        composition.showComposition();
    }
}