package src;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BogieGrouper {

    private List<Bogie> bogies;

    public BogieGrouper(List<Bogie> bogies) {
        this.bogies = bogies;
    }

    public Map<String, List<Bogie>> groupByType() {
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("Grouped Bogies by Type:");
        grouped.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(b -> System.out.println("  " + b.getName() + " - " + b.getCapacity()));
        });

        return grouped;
    }
}