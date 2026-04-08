import java.util.Arrays;

public class UC16BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}