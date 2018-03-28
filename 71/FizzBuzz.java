// Friday March 23rd, 2018 +
// definitely IN PROGRESS
// https://stackoverflow.com/questions/8023659/java-check-if-integer-is-multiple-of-a-number
// thenk you so much
// frogot about modulus

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int x = 1; x <= 100; x ++) {
            if (x % 15 == 0) { // need to check if x is (evenly?) divisble by 15 FIRST and then check if x is divisible by either 3 or 5. FIZZBUZZ IS PRIORITY
                System.out.println("FIZZBUZZ");
            } else if (x % 3 == 0) {
                System.out.println("fizz");
            } else if (x % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(x);
            }
        }
    }
}
