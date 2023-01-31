package launchcode.studio7.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ArrayList<String> questionTestChoices = new ArrayList<>();
//        questionTestChoices.add("a");
//        questionTestChoices.add("b");
//        questionTestChoices.add("c");
//
//        MultipleChoice questionTest = new MultipleChoice("What is the first letter?","a", questionTestChoices);
//        System.out.println(questionTest.getPrompt());
//        questionTest.setResponse(input.nextLine());
//        System.out.println(questionTest.checkAnswer());
//
//        TrueFalse question2 = new TrueFalse("A wasp is a type of Bird. True or False?", "False");
//        System.out.println(question2.getPrompt());
//        question2.setResponse(input.nextLine());
//        System.out.println(question2.checkAnswer());
        ArrayList<String> question3Choices = new ArrayList<>();
        question3Choices.add("a");
        question3Choices.add("b");
        question3Choices.add("c");
        question3Choices.add("d");
        ArrayList<String> question3Answers = new ArrayList<>();
        question3Answers.add("a");
        question3Answers.add("b");
        question3Answers.add("c");

        Checkbox question3 = new Checkbox("What are the first three letters?",question3Answers,question3Choices);
        System.out.println(question3.getPrompt());
        question3.setResponse(input.nextLine());
        System.out.println(question3.checkAnswer());
    }
}
