// Generates three random integer numbers in a given range
// and prints them in increasing order.
public class Ascend {
    public static void main(String[] args) {

        int limit = Integer.parseInt(args[0]);
        int a = (int) (Math.random() * limit);
        int b = (int) (Math.random() * limit);
        int c = (int) (Math.random() * limit);

        int smallest = Math.min(a, Math.min(b, c));
        int biggest = Math.max(a, Math.max(b, c));
        int middle = a + b + c - smallest - biggest; // סכום שלושת המספרים פחות הקטנים והגדול

        System.out.println(a + " " + b + " " + c);
        System.out.println(smallest + " " + middle + " " + biggest);
    }
}