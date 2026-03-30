package src;

public class PassengerBogie {
    private String type; // Sleeper, AC Chair, First Class
    private int seats;

    public PassengerBogie(String type, int seats) {
        this.type = type;
        this.seats = seats;
    }

    public void showInfo() {
        System.out.println(type + " Bogie with " + seats + " seats.");
    }

    public boolean hasAvailableSeats() {
        return seats > 0;
    }

    public void bookSeat() {
        if(seats > 0) {
            seats--;
            System.out.println("Seat booked. Remaining: " + seats);
        } else {
            System.out.println("No seats available in " + type + " Bogie.");
        }
    }
}