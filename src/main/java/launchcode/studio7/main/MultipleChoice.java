package launchcode.studio7.main;

import java.util.ArrayList;
import java.util.Objects;

public class MultipleChoice extends Question {

    private String response;
    private String answer;
    private ArrayList<String> choices;

    public MultipleChoice(String aPrompt, String answer, ArrayList<String> choices) {
        super(aPrompt);
        this.answer = answer;
        this.choices = choices;
    }
    public String getPrompt() {
        return super.getPrompt();
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultipleChoice that = (MultipleChoice) o;
        return response.equals(that.response) && answer.equals(that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response, answer);
    }

    public boolean checkAnswer(){
        if (response.equals(answer)){
            return true;
        }
        else return false;
    }
}
