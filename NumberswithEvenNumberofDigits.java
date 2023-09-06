//1295
public class NumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] arr = {1,2,34,567,8654,3654};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(((int)(Math.log10(nums[i]))+1)%2==0)
                 count++;
        }
        return count; 
     }
}
