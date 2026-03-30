package src;

public class GoodsBogie {
    private String cargoType; // Rectangular, Cylindrical
    private int capacity;

    public GoodsBogie(String cargoType, int capacity) {
        this.cargoType = cargoType;
        this.capacity = capacity;
    }

    public void showInfo() {
        System.out.println(cargoType + " Goods Bogie with capacity: " + capacity);
    }

    public boolean hasSpace() {
        return capacity > 0;
    }

    public void loadCargo(int amount) {
        if(amount <= capacity) {
            capacity -= amount;
            System.out.println(amount + " units loaded. Remaining capacity: " + capacity);
        } else {
            System.out.println("Not enough space in " + cargoType + " Goods Bogie.");
        }
    }
}