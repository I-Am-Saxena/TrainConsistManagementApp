package src;

import java.util.ArrayList;
import java.util.List;

public class TrainComposition {
    private TrainEngine engine;
    private List<PassengerBogie> passengerBogies = new ArrayList<>();
    private List<GoodsBogie> goodsBogies = new ArrayList<>();

    public TrainComposition(TrainEngine engine) {
        this.engine = engine;
    }

    public void addPassengerBogie(PassengerBogie bogie) {
        passengerBogies.add(bogie);
        System.out.println("Added passenger bogie: " + bogie.getType());
    }

    public void addGoodsBogie(GoodsBogie bogie) {
        goodsBogies.add(bogie);
        System.out.println("Added goods bogie: " + bogie.getType());
    }

    public void showComposition() {
        System.out.println("Train Composition:");
        System.out.println("Engine: " + engine.getType());
        System.out.println("Passenger Bogies:");
        for(PassengerBogie pb : passengerBogies) pb.showInfo();
        System.out.println("Goods Bogies:");
        for(GoodsBogie gb : goodsBogies) gb.showInfo();
    }

    public boolean checkSafety() {
        for(GoodsBogie gb : goodsBogies) {
            if(!gb.hasSpace()) {
                System.out.println("Safety alert: Goods bogie full!");
                return false;
            }
        }
        System.out.println("All bogies safe.");
        return true;
    }
}