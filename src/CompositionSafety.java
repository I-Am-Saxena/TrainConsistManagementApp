package src;

public class CompositionSafety {

    private TrainComposition composition;

    public CompositionSafety(TrainComposition composition) {
        this.composition = composition;
    }

    public void validate() {
        boolean safe = true;

        int totalGoods = 0;
        for (GoodsBogie gb : composition.getGoodsBogies()) {
            totalGoods += gb.getCurrentLoad();
            if (gb.getCurrentLoad() > gb.getCapacity()) {
                System.out.println("Overloaded goods bogie: " + gb.getType());
                safe = false;
            }
        }

        for (PassengerBogie pb : composition.getPassengerBogies()) {
            if (pb.getBookedSeats() > pb.getCapacity()) {
                System.out.println("Overbooked passenger bogie: " + pb.getType());
                safe = false;
            }
        }

        if (totalGoods > 200) { // Example: max total goods allowed
            System.out.println("Total goods exceed maximum safe limit!");
            safe = false;
        }

        if (safe) {
            System.out.println("Train composition is safe.");
        } else {
            System.out.println("Train composition has safety issues!");
        }
    }
}