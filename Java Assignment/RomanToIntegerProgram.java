/**
* @author : Saurabh Taware
* @description : Solution Class for Java Problem -
                 B)Enter a Roman Number as input and convert it to an integer. (ex IX = 9)
*/
import java.util.Scanner;

public class RomanToIntegerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase(); // Convert input to uppercase
        scanner.close();

        int result = romanToInteger(roman);
        if (result != -1) {
            System.out.println("Integer value: " + result);
        } else {
            System.out.println("Invalid Roman numeral entered.");
        }
    }

    /**
    * @author : Saurabh Taware
    * @description : Method Converts the roman numeral in Integer format
    * @param : String roman number
    */
    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char romanChar = s.charAt(i);
            int value = 0;

            switch (romanChar) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    // Invalid Roman numeral character
                    return -1;
            }

            if (value < prevValue) {
                if (prevValue / value > 10) {
                     return -1;
                }
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }
}
