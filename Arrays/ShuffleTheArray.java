import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(shuffle(arr,2)));

    }
    public static int[] shuffle(int[] nums, int n) {
        int j = n;
        
        int[] arr = new int[nums.length];
        for(int i = 0 ; i <n ; i++){
            arr[i+i] = nums[i];
            arr[i+i+1] = nums[j];
            j++;
            
        }
        return arr;
    }
}
