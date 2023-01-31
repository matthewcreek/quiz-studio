package launchcode.studio7.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MultipleChoice questionTest = new MultipleChoice("What is the first letter?","a", new ArrayList<>(Arrays.asList("a","b","c")));
        System.out.println(questionTest.getPrompt());
        questionTest.setResponse(input.nextLine());
        System.out.println(questionTest.checkAnswer());

        TrueFalse question2 = new TrueFalse("A wasp is a type of Bird. True or False?", "False");
        System.out.println(question2.getPrompt());
        question2.setResponse(input.nextLine());
        System.out.println(question2.checkAnswer());

        Checkbox question3 = new Checkbox("What are the first three letters?", new ArrayList<String>(Arrays.asList("a","b","c")), new ArrayList<String>(Arrays.asList("a","b","c","d")));
        System.out.println(question3.getPrompt());
        question3.setResponse(input.nextLine());
        System.out.println(question3.checkAnswer());

        input.close();
    }
}
