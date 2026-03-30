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
    }
}