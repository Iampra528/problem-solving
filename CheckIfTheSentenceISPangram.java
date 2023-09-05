//1832

public class CheckIfTheSentenceISPangram {
    public static void main(String[] args) {
        String s = "qwertyuioplkjhgfdsazxcvbnm";
        System.out.println(checkIfPangram(s));
    }

    public static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        int count = 0;

        for(int i=0 ; i<sentence.length() ; i++){
            if(arr[sentence.charAt(i)-97]==0)
                count++;
            
            arr[sentence.charAt(i)-97]=1;
        }
        return count == 26;
    }
}
