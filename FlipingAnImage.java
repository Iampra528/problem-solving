//832
public class FlipingAnImage {
    public static void main(String[] args) {
        
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int k = 0,temp=0;
        for(int i =0; i<image.length; i++){
            k = image[i].length-1;
            int j = 0;
            for( j=0 ; j<=k; j++){
                temp=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;

                image[i][j]=image[i][j]==1 ? 0 : 1;

                if(j<k)
                    image[i][k]=image[i][k]==1 ? 0 : 1;

                k--;

                
            }
            // if(j==k){
            //     image[i][j]=image[i][j]==1 ? 0 : 1;
            // }
        }
            return image;
    }
}
