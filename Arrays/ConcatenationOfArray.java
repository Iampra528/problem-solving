import java.util.Arrays;

public class ConcatenationOfArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

     public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
    }
}