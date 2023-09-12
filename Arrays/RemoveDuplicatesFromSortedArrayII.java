//80
public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
        
    }

    //my solution
    public static int removeDuplicates1(int[] nums) {
        int k = Integer.MIN_VALUE , index=1;

        for(int i = 1 ; i < nums.length ; i++){
           if(nums[i]!=nums[i-1])
                nums[index++]=nums[i];
                
           else if(nums[i]==nums[i-1] && k!=nums[i]){
                nums[index++]=nums[i];
                k = nums[i];
                
            }
            
                
        }
        return index;
    }


    public static int removeDuplicates2(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int index = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static  int removeDuplicates3(int[] nums) {
        int j=1;
        for(int i=2;i<nums.length;i++)
            if(nums[i]!=nums[j-1])
                nums[++j]=nums[i];
        return j+1;
    }
    
}