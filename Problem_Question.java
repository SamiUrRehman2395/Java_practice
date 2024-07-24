import java.util.Scanner;
import java.util.Random;

public class Problem_Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : \n1 for Pizza\n2 for Burger\n3 for Sandwich");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput==computerInput) {
            System.out.println("Draw");
        } else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("You Win");
        } else {
            System.out.println("Computer Wins");
        }
        System.out.println("Compuer Choice: " + computerInput);
    }
}


