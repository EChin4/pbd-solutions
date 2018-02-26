// Mon Feb 26th, 2018
import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Name? ");
        String name = input.next();
        
        System.out.print("Nice to meet you, " + name + ". Age? ");
        int age = input.nextInt();
        
        System.out.print(System.lineSeparator());
        System.out.print("Wow! In case you don't know how to math, let me tell you this: in 5 years you're gonno be " + (age + 5) + ", " + name + "! And 5 years ago you were " + (age - 5) + "! Holy McMoley. Now that's a brain tickler.");
    }
}
