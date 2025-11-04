// Prints the number in terms of hundreds, tens, and ones.
public class NumWords {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
    }
}