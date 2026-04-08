class InvalidCapacityException extends Exception {}

public class UC14InvalidCapacity {
    public static void main(String[] args) throws Exception {
        int capacity = -1;

        if(capacity <= 0){
            throw new InvalidCapacityException();
        }
    }
}