import java.util.Arrays;

//1886
public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        
    }
    
    
    public static boolean findRotation(int[][] mat, int[][] target) {
        int row = mat.length;
       
        for(int k=0;k<=3;++k){
           int[][] r = new int[row][row];
            for(int i =0;i<row;++i){
                for(int j =0;j<row;++j){
                    r[j][row-1-i]=mat[i][j];
                }
             
            }
            if(Arrays.deepEquals(r,target)){
                 return true;
             }
             mat = r;
        }
        return false;
        
    }
}
