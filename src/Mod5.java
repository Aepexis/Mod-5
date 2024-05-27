import java.util.*;

public class Mod5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        String[] month = {
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December",
        };
        int[] hiTemp = {
                34, 40, 49, 57, 66, 74, 83, 83, 73, 58, 42, 32
        };
        int[] loTemp = {
                25, 26, 32, 37, 44, 50, 56, 56, 47, 37, 30, 22
        };
        System.out.println("Hello! Please type the month to view the average temperature");
        System.out.println("Or type \"Year\" to see the each month's average temp.");
        System.out.println("If you would like to exit type \"Quit\"");

        while (true) {

            String userInput = scnr.nextLine();

            if(userInput.equalsIgnoreCase("Quit")){
                System.out.println("Thank you! Enjoy your day.");
                break;

            } else if (!Arrays.asList(month).contains(userInput)) {
                System.out.println("This is not an valid input");
                continue;
            }
            for (i = 0; i < month.length; ++i) {

                if (userInput.equalsIgnoreCase(month[i])) {
                    System.out.println(month[i] + "'s" + " average temperature was " + (hiTemp[i] + loTemp[i]) / 2);
                    break;
                }
            }
        }
    }
}