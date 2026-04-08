public class UC18LinearSearch {
    public static void main(String[] args) {
        String[] arr={"B1","B2","B3"};
        String key="B2";

        for(String s:arr){
            if(s.equals(key)){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }
}