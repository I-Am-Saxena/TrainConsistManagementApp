import java.util.*;

public class UC20EmptyCheck {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        if(list.isEmpty()){
            throw new IllegalStateException("No bogies available");
        }
    }
}