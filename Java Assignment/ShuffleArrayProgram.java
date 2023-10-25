/**
* @author : Saurabh Taware
* @description : Solution Class for Java Problem 
                 A)Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it
*/
import java.util.Random;

public class ShuffleArrayProgram {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(originalArray);
        
        // Printing the shuffled array
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }

    /**
    * @author : Saurabh Taware
    * @description : Method Shuffles the array
    * @param : Array of integers
    */
    public static void shuffleArray(int[] arr) {
        int n = arr.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
