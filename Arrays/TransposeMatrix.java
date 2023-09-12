//867
public class TransposeMatrix {
    public static void main(String[] args) {
        
    }

    
    public int[][] transpose1(int[][] matrix) {
        int[][] ani = new int[matrix[0].length][matrix.length];
    
        for(int i = 0; i<matrix.length;i++){
            for(int j =0; j< matrix[i].length; j++ ){
                ani[j][i] = matrix[i][j];
            }
        }
        return ani;
    }


    public int[][] transpose2(int[][] matrix) {
        
        int[][] arr = new int[matrix[0].length][matrix.length];

        for(int j = 0 ; j < matrix[0].length ; j++){
            for(int i = 0 ; i < matrix.length ; i++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
    
}
