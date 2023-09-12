import java.util.Arrays;

public class SmallerNumberThenCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,8,5,2};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        for (int i = 0 ; i < nums.length ; i++){
            count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] < nums[i])
                    count++;
            }
            arr[i]=count;
        }
        return arr;
    }
}

