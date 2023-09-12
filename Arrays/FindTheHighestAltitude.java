public class FindTheHighestAltitude {
    public static void main(String[] args) {
        
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;

        for(int i=0; i<gain.length; i++){
            current +=gain[i];
            
            max = Math.max(max,current); 
        }
        return max;
    }
}
