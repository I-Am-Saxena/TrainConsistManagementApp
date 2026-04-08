import java.util.*;

class Bogie {
    String type, cargo;
    Bogie(String t, String c){ type=t; cargo=c; }
}

public class UC12SafetyCheck {
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Cylindrical","Petroleum"),
                new Bogie("Rectangular","Coal")
        );

        boolean safe = bogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        System.out.println("Safe: " + safe);
    }
}