public class Pattern {
    public static void main(String[] args) {
        pattern2(5);
    }

    public static void pattern1(int n){
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }


    public static void pattern2 (int n){
        for (int i = 1; i < 2*n; i++) {
           int totalCOlsInRow = i>n ? 2*n-i : i; 
            for (int j = 0; j < totalCOlsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
