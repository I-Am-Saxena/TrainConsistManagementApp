package src;

public class Main {
    public static void main(String[] args) {
        // UC1 to UC8 code
        TrainEngine engine = new TrainEngine("Diesel");
        engine.start();

        PassengerBogie sleeper = new PassengerBogie("Sleeper", 50);
        PassengerBogie acChair = new PassengerBogie("AC Chair", 30);

        GoodsBogie rectangular = new GoodsBogie("Rectangular", 100);
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical", 80);

        TrainComposition composition = new TrainComposition(engine);
        composition.addPassengerBogie(sleeper);
        composition.addPassengerBogie(acChair);
        composition.addGoodsBogie(rectangular);
        composition.addGoodsBogie(cylindrical);

        composition.showComposition();
        composition.checkSafety();

        // UC5: Passenger Booking
        PassengerBooking booking = new PassengerBooking(composition);
        booking.bookSeat("Sleeper", 5);
        booking.bookSeat("AC Chair", 2);

        composition.showComposition();

        // UC6: Goods Handling & Safety
        GoodsManagement goodsMgmt = new GoodsManagement(composition);
        goodsMgmt.loadGoods("Rectangular", 50);
        goodsMgmt.loadGoods("Cylindrical", 30);
        goodsMgmt.checkSafety();

        // UC8: Filter Passenger Bogies
        PassengerFilter filter = new PassengerFilter(composition.getPassengerBogies());
        filter.filterHighCapacity(40);

        // ---------- UC9: Group Bogies by Type ----------
        BogieGrouper grouper = new BogieGrouper(composition.getAllBogies());
        grouper.groupByType();
    }
}