import java.util.ArrayList;

public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        createTargetArray(nums, index);
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            arr.add(index[i], nums[i]);
        }

        int res[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            res[i] = arr.get(i);
        }
        System.out.println(arr);
        return res;
    }
}
