// Wed March 28th, 2018

import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        int entry2 = 0;
        
        System.out.println("\nI shall add up the integers that YOU WILL provide me.");
        System.out.print("Begin: ");
        int entry1 = input.nextInt();
        
        while (counter <= 5) {
            sum = entry1 + entry2;
            System.out.print("\nYour total sum is currently " + sum + ".\nNext: ");
            entry1 = sum;
            entry2 = input.nextInt();
            
            counter += 1;
        }
        
        System.out.println("\nYour TOTAL is " + (entry1 + entry2) + ".\nHave an okay day."); // lol you need those brackets for the (entry1 + entry2) 
        // or else 21 + 6 will equal 216 instead of 27 ;?)
    }
}
