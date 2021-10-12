import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {

        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int noScores = 5;
        int[] scores = new int[noScores];
        System.out.println("Enter your three scores");

        for (int i = 0; i < noScores; i++) {
            System.out.print("Score " + (i + 1) + ":");
            scores[i] = scanner.nextInt();
        }

        System.out.println("Name: " + name);
        System.out.print("Scores: ");
        for (int i = 0; i < noScores; i++) {
            if (i == (noScores - 1)) {
                System.out.print(scores[i]);
            } else {
                System.out.print(scores[i] + ", ");
            }
        }
    }
}
