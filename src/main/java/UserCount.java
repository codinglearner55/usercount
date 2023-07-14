import java.util.Scanner;  // Import the Scanner class

public class UserCount {

    public static void main (String[] args){
        // Create scanner object to take input
        Scanner userInputObj = new Scanner(System.in);

        // Get the user name using the scanner object
        System.out.println("Enter Username");
        String userName = userInputObj.nextLine(); // User input

        // Get the number the user wants to count up to
        System.out.println("hi " + userName + ", how high do you want to count?");
        int  userCount = userInputObj.nextInt(); // User input

        // Count up to the users count and print out each number
        for (int i = 1; i <= userCount; i++){
            System.out.println(i);
        }
    }
}
