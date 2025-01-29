import java.util.Scanner;

public class QuizApp {
    private static Question[] questions = {
        new Question("What is the capital of France?", new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"}, 3),
        new Question("Which is the largest planet in the solar system?", new String[]{"1. Earth", "2. Jupiter", "3. Mars", "4. Venus"}, 2),
        new Question("Who wrote 'To Kill a Mockingbird'?", new String[]{"1. Harper Lee", "2. J.K. Rowling", "3. Ernest Hemingway", "4. Mark Twain"}, 1)
    };

    private static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println(q.question);
            for (String option : q.options) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();

            if (answer == q.correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + q.correctAnswer + "\n");
            }
        }

        System.out.println("Quiz finished! Your score: " + score + "/" + questions.length);
        scanner.close();
    }
}
class Question {  
    String question;
    String[] options;
    int correctAnswer;

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}