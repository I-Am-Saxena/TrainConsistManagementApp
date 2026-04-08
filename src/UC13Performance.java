import java.util.*;

public class UC13Performance {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10000;i++) list.add(i);

        long start = System.nanoTime();

        for(int i:list){}

        long end = System.nanoTime();
        System.out.println("Time: " + (end-start));
    }
}