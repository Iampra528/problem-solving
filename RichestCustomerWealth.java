public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{1,2,3},{5,6,1,2}};
        System.out.println(maximumWealth(arr));

    }
    public static int maximumWealth(int[][] accounts) {
        int total = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < accounts.length ; i++ ){
            sum = 0;

            for(int j = 0 ; j < accounts[i].length ; j++){
                sum += accounts[i][j];
            }
            if(sum > total)
                total = sum;
            
        }
        return total;
    }
}
