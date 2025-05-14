package advancedmathlearning;

import java.util.Scanner;

public class AdvancedMathLearning {

    public static void main(String[] args) {

        String[] questions = {
            "Question 1: What is the result of 1+2: ",
            "Question 2: What is the result of 2+2: ",
            "Question 3: What is the result of 3+2: ",
            "Question 4: What is the result of 4+2: ",
            "Question 5: What is the result of 5+2: ",};
        int[] answers = {3, 4, 5, 6, 7};
        int correct = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int userAnswer = scanner.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct");
                correct++;
            } else {
                System.out.println("False");
            }
        }
        System.out.println("You goot " + correct + " from 5 correct");
        scanner.close();

    }

}
