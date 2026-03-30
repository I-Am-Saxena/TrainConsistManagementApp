package src;

import java.util.List;

public class SeatCounter {

    private List<Bogie> bogies;

    public SeatCounter(List<Bogie> bogies) {
        this.bogies = bogies;
    }

    public int totalSeats() {
        int total = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        System.out.println("Total seating capacity in train: " + total);
        return total;
    }
}