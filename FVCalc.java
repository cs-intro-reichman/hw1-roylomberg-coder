// Computes the future value of a saving investment.
public class FVCalc {
    public static void main(String[] args) {
        // Inputs: current value (int), annual interest rate in percent (0-100), years (int)
        int current = Integer.parseInt(args[0]);
        double ratePercent = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);

        // Convert percent to fraction and compute future value using compounding
        double rate = ratePercent / 100.0;
        double future = current * Math.pow(1 + rate, years);

        // Output as specified (future printed as an int)
        System.out.println("After " + years + " years, $" + current
                + " saved at " + ratePercent + "% will yield $" + (int) future);
    }
}