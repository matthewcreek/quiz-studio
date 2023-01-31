package launchcode.studio7.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Checkbox extends Question {
    private String response;
    private ArrayList<String> answer;
    private ArrayList<String> choices;
    private ArrayList<String> responseToArrayList;

    public Checkbox(String aPrompt, ArrayList<String> answer, ArrayList<String> choices) {
        super(aPrompt);
        this.answer = answer;
        this.choices = choices;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setResponse(String response) {
        this.response = response;
        //implement string to array list here
        String[] strSplit = response.split(",");
        responseToArrayList = new ArrayList<>(Arrays.asList(strSplit));
        for (int i = 0; i < responseToArrayList.size(); i++) {
            responseToArrayList.set(i,responseToArrayList.get(i).trim());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checkbox checkbox = (Checkbox) o;
        return answer.equals(checkbox.answer) && responseToArrayList.equals(checkbox.responseToArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, responseToArrayList);
    }
    public boolean checkAnswer(){
        if (answer.equals(responseToArrayList)){
            return true;
        } else return false;
    }
}
