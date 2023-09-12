import java.util.Arrays;

//1304

 public class FindNUniqueIntegersSumuptoZero {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(11)));
    }

    public static int[] sumZero(int n) {
        int[] arr = new int [n];
        
        for(int i=0; i<n/2 ; i++){
            arr[i+i]= -(i+1);
            arr[i+i+1]= (i+1);
        }
        
        if(n%2 !=0)
            arr[arr.length-1]=0;

        return arr;
    }
}