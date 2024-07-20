public class Precedence {
    public static void main(String[] args) {
        // Expression 1: 25 + 3 * 4 - 12 / 3
        double result1 = 25 + 3 * 4 - 12 / 3.0;

        // Expression 2: (10 - 2) ** 2 / 4 + 6
        // Since Java does not support ** operator, we use Math.pow() for exponentiation
        double result2 = Math.pow((10 - 2), 2) / 4 + 6;

        // Expression 3: 18 // 4 + 7 % 3 * 2
        // Since Java uses single slash for integer division
        int result3 = 18 / 4 + 7 % 3 * 2;

        // Print the results
        System.out.println("The result of the expression 25 + 3 * 4 - 12 / 3 is: " + result1);
        System.out.println("The result of the expression (10 - 2) ** 2 / 4 + 6 is: " + result2);
        System.out.println("The result of the expression 18 // 4 + 7 % 3 * 2 is: " + result3);
    }
}
