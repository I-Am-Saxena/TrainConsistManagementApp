package src;

public class TrainEngine {
    private String engineType;

    public TrainEngine(String engineType) {
        this.engineType = engineType;
    }

    public void start() {
        System.out.println(engineType + " engine started.");
    }
}