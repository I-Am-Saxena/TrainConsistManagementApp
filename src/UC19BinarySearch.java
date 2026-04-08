public class UC19BinarySearch {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        String key="C";

        int low=0, high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            int cmp=key.compareTo(arr[mid]);

            if(cmp==0){
                System.out.println("Found");
                return;
            } else if(cmp<0) high=mid-1;
            else low=mid+1;
        }
        System.out.println("Not Found");
    }
}