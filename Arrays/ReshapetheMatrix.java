//566
public class ReshapetheMatrix {
    public static void main(String[] args) {
        
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int size = mat.length*mat[0].length;
        if(size!=(r*c))
            return mat;

        int[][] arr = new int[r][c];
        int row = 0, col = 0;

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[i].length ; j++){
                
                arr[row][col++] = mat[i][j];

                if(col == c)
                {
                    col = 0;
                    row++;
                }
              
            }
        }
        return arr;
    }
}
