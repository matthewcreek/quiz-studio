package launchcode.studio7.main;

public abstract class Question {
    private String prompt;
    private String response;

    public Question(String aPrompt){
        prompt = aPrompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public abstract boolean checkAnswer();

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}
