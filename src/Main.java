package src;

public class Main {
    public static void main(String[] args) {
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
    }
}