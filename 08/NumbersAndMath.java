public class NumbersAndMath {
    public static void main(String[] args) {
        System.out.println("I will now count my emus.");
        
        System.out.println("♀️Emus" + (25 + 30 / 6)); // divides 30 by 6 which equals 5. Then adds 25. Output = 30
        System.out.println("♂️Emus" + (100 - 25 * 3 % 4)); // multiples 25 by 3 which equals 75. 4 will only go into 75 eighteen times (4 x 18 = 72) with the remainder being 3 (bc 75 - 72). 100 minus 3. Output = 97 

        System.out.println("Now I will count the huevos:");
        
        System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6); // basically 6 - 5 + 0 - 6.25 which should equal -5.25
        
        System.out.println("Is it true that 3 + 2 < 5 - 7?"); // no
        
        System.out.println("What is 3 + 2? " + (3 + 2));
        System.out.println("What is 5 - 7? " + (5 - 7));
        
        System.out.println("OhhhHhOhh, that's why it's false.");
        
        System.out.println("How about some more."); // I'd rather not
        
        System.out.println("Is it greater? " + (5 > -2));
        System.out.println("Is it greater or equal? " + (5 >= -2));
        System.out.println("Is it less or equal? " + (5 <= -2));
    }
}
