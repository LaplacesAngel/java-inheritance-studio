public class TrueFalse extends Question {
    private String question;
    private boolean answer;

    public TrueFalse(String theQuestion, String theAnswer, String question, boolean answer) {
        super(theQuestion, theAnswer);
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
