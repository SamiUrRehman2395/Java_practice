public class Table_of_5 {
    public static void main(String[] args) {
        int number = 5; // The number for which the table will be printed

        System.out.println("Multiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
