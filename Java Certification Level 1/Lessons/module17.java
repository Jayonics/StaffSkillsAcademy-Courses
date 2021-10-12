public class module17 {
    public static void main (String[] args) {

        int alpha = 3;
        int bravo = 13;

        System.out.println("Addition" + (alpha + bravo));
        System.out.println("Subtraction" + (alpha - bravo));
        System.out.println("Multiplication" + bravo * alpha);
        System.out.println("Division" + bravo / alpha);
        System.out.println("Modulus" + bravo % alpha);

        System.out.println((double)bravo/(double)alpha);
        /* Because we've casted the numbers as doubles, the real value is displayed
        * If an integer was casted, only a whole number would be printed. */

    }
}
