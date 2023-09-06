//1572
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        
    }

    //my approach 
    public int diagonalSum1(int[][] mat) {
        int k = mat[0].length-1;
        int sum = 0;
        for(int i = 0 ; i < mat.length ; i++){
            sum += (i!=k) ? mat[i][k] : 0 ;
            k--;

            for(int j = 0 ; j < mat[i].length ; j++){
                
                sum += (i==j) ? mat[i][j] : 0;
            }
        }
        return sum;
    }



    // alternate approach with single condition 
    public int diagonalSum2(int[][] mat) {
        int sum = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[i].length ; j++){
                
                sum += (i==j)||i+j==mat.length-1 ? mat[i][j] : 0;
            }
        }
        return sum;
    }


    // best approach
    public int diagonalSum3(int[][] mat) {
        int i=0,j=mat.length-1,k=0,s=0;
        while(i<mat.length){
          s += (k!=j) ? (mat[i][k]+mat[i][j]) : mat[i][j];
          
          i++;k++;j--;
          
        }
        return s;
      }
}
