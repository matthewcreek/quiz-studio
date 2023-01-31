package launchcode.studio7.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private double grade;
    private double correctAnswers = 0;
    private ArrayList<Question> quizStorage = new ArrayList<>();

    public Quiz() {
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getCorrectAnswers() {
        return correctAnswers;
    }

    public ArrayList<Question> getQuizStorage() {
        return quizStorage;
    }

    public void addQuestion(Question q) {
        quizStorage.add(q);
    }
    public void giveQuiz() {
        Scanner input = new Scanner(System.in);
        for (Question q : quizStorage) {
            System.out.println(q.getPrompt());
            q.setResponse(input.nextLine());
            if (q.checkAnswer()) {
                correctAnswers = correctAnswers + 1;
            } else;
        }
        input.close();
    }
    public void gradeQuiz() {
        setGrade(correctAnswers/quizStorage.size() * 100);
        System.out.println("Hooray! You have scored " + grade + "% on the quiz.");
    }
}
