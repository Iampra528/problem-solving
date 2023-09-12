import java.util.ArrayList;
import java.util.List;

//1380
public class LuckeyNumersInAMatrix {
    public static void main(String[] args) {
        
    }


    // bit faster approach
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        
        for (int row = 0; row < matrix.length; row++) {
            int minCol = minColInRow(matrix, row);
            int value = matrix[row][minCol];
            if (checkIfMaxInCol(matrix, minCol, value)) {
                result.add(value);
            }
        }
        
        return result;
    }
    
    private static int minColInRow(int[][] matrix, int row) {
        int minIndex = 0, min = matrix[row][minIndex];
        for (int col = 1; col < matrix[row].length; col++) {
            if (matrix[row][col] < min) {
                min = matrix[row][col];
                minIndex = col;
            }
        }
        return minIndex;
    }
    
    private static boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] > value) return false;
        }
        return true;
    }


    public static List<Integer> luckyNumbers1 (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int minValue =0,maxValue =0,minIndex=0;

        for(int i = 0 ; i < matrix.length ; i++){
            minValue = matrix[i][0];
            for(int j = 0 ; j < matrix[i].length ; j++){
                if(matrix[i][j]<minValue){
                    minValue = matrix[i][j];
                    minIndex = j;
                }
            }

            maxValue = minValue;
            for(int row=0 ; row < matrix.length ; row++){
                if(maxValue < matrix[row][minIndex]){
                    maxValue = matrix[row][minIndex];
                    break;
                }
            }

            if(maxValue == minValue)
                list.add(minValue);
        }
        return list;
    }

}
