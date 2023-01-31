package launchcode.studio7.main;

import java.util.Objects;

public class TrueFalse extends Question {
    private String response;
    private String answer;

    public TrueFalse(String aPrompt, String answer) {
        super(aPrompt);
        this.answer = answer;
    }

    public String getPrompt() {
        return super.getPrompt();
    }

    public String getAnswer() {
        return answer;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrueFalse trueFalse = (TrueFalse) o;
        return response.equals(trueFalse.response) && answer.equals(trueFalse.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response, answer);
    }

    public boolean checkAnswer(){
        if (answer.toLowerCase().equals(response.toLowerCase().trim())){
            return true;
        }
        else return false;
    }
}
