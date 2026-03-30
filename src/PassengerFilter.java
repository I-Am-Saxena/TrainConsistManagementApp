package src;

import java.util.List;
import java.util.stream.Collectors;

public class PassengerFilter {

    private List<PassengerBogie> passengerBogies;

    public PassengerFilter(List<PassengerBogie> passengerBogies) {
        this.passengerBogies = passengerBogies;
    }

    public List<PassengerBogie> filterHighCapacity(int minCapacity) {
        List<PassengerBogie> filtered = passengerBogies.stream()
                .filter(b -> b.getCapacity() > minCapacity)
                .collect(Collectors.toList());

        System.out.println("Filtered Passenger Bogies (Capacity > " + minCapacity + "):");
        filtered.forEach(b -> System.out.println(b.getType() + " - " + b.getCapacity()));
        return filtered;
    }
}