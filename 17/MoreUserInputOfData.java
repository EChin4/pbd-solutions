// Fri Feb 23rd, 2018

import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give me your info!! Right now!!!");
        System.out.print("First name: ");
        String firstName = input.next();
        
        System.out.print("Last name: ");
        String lastName = input.next();
        
        System.out.print("Grade (1-12): ");
        int grade = input.nextInt();
        
        System.out.print("Student ID: ");
        int studentID = input.nextInt();
        
        System.out.print("Login: ");
        String login = input.next();
        
        System.out.print("Average: ");
        double average = input.nextDouble();
        
        // System.out.println(" "); to make a space since they're too smushed together when you output it
        System.out.print(System.lineSeparator()); // this is so great. Less sketchy
         
        System.out.println("Your (but now it's also my) Information: ");
        System.out.println("Login: " + login);
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Avg: " + average);
        System.out.println("Grade: " + grade);
    }
}

