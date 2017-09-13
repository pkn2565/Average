import java.util.Scanner;

/**Patrick Nguyen
*September 11, 2017
*author Patrick Nguyen
*Average of 10 variables
*/

public class Average {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers separated by a comma");
        Scanner keyboardNumber = new Scanner(System.in);
        keyboardNumber.useDelimiter(","); //Changes delimiter to a comma


        int n1 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer
        int n2 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer
        int n3 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer
        int n4 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer
        int n5 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer
        int n6 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer
        int n7 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer
        int n8 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer
        int n9 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer
        int n10 = keyboardNumber.nextInt(); //allows keyboard to understand the next integer

        int sum = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10); //adds all off the integers together
        int average = sum/10; //divides the sum by 10(averages the numbers)

        System.out.println("You entered:\n " + n1 + " " + n2 + " " + n3 + " " + n4 +
                " " + n5 + " " + n6 + " " + n7 + " " + n8 + " " + n9 + " " + n10); //tells user what was entered
        System.out.println("Your average is:\n " + average); //Shows the average


    }


}
