package launchcode.studio7.main;

public abstract class Question {
    private static String prompt;

    public Question(String aPrompt){
        prompt = aPrompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public abstract boolean checkAnswer();

}
