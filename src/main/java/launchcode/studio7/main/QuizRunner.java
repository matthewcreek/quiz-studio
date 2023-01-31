package launchcode.studio7.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        MultipleChoice question1 = new MultipleChoice("What is the first letter?","a", new ArrayList<>(Arrays.asList("a","b","c")));

        TrueFalse question2 = new TrueFalse("A wasp is a type of Bird. True or False?", "False");

        Checkbox question3 = new Checkbox("What are the first three letters?", new ArrayList<String>(Arrays.asList("a","b","c")), new ArrayList<String>(Arrays.asList("a","b","c","d")));

        Quiz quizTest = new Quiz();
        quizTest.addQuestion(question1);
        quizTest.addQuestion(question2);
        quizTest.addQuestion(question3);
        quizTest.giveQuiz();
        quizTest.gradeQuiz();
    }
}
