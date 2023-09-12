public class MinimumCosttoMoveChipstoTheSamePosition {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,3,3};
        System.out.println(minCostToMoveChips(arr));
    }

    public static int minCostToMoveChips(int[] position) {
        int even = 0 , odd = 0; 
        for(int i = 0 ; i<position.length ; i++){
            if(position[i]%2==0)
                even++;
            else
                odd++;
            
        }
        return Math.min(even,odd);
    }
}
