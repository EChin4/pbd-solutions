// Thurs Feb 22nd, 2018

import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        System.out.print("How tall are you? "); // some errors when I input actual sentences and words that aren't 7'5" for example. even tho it's for strings. ill be back
        String height = input.next();
        
        System.out.print("How much do you weigh? (lbs) ");
        double weight = input.nextDouble();
        
        System.out.println("So you're " + age + " years old, huh? You're also " + height + " tall and you weigh " + weight + " lbs. Thanks for your input!!1");
    }
}
