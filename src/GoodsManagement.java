package src;

public class GoodsManagement {

    private TrainComposition composition;

    public GoodsManagement(TrainComposition composition) {
        this.composition = composition;
    }

    public void loadCargo(String type, int amount) {
        boolean loaded = false;
        for (GoodsBogie gb : composition.getGoodsBogies()) {
            if (gb.getType().equalsIgnoreCase(type)) {
                loaded |= gb.loadCargo(amount);
            }
        }
        if (loaded) {
            System.out.println(amount + " units of cargo loaded into " + type + " bogie.");
        } else {
            System.out.println("Not enough space in " + type + " bogie.");
        }
    }
}