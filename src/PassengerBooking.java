package src;

public class PassengerBooking {

    private TrainComposition composition;

    public PassengerBooking(TrainComposition composition) {
        this.composition = composition;
    }

    public void bookSeat(String type, int numSeats) {
        boolean booked = false;
        for (PassengerBogie pb : composition.getPassengerBogies()) {
            if (pb.getType().equalsIgnoreCase(type)) {
                for (int i = 0; i < numSeats; i++) {
                    booked |= pb.bookSeat();
                }
            }
        }
        if(booked) {
            System.out.println(numSeats + " seats booked in " + type + " bogie.");
        } else {
            System.out.println("Not enough seats available in " + type + " bogie.");
        }
    }
}