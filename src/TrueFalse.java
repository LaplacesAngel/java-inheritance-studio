public class TrueFalse extends Question {
    private String question;
    private boolean answer;

    public TrueFalse (String correctAnswer, String questionType, String answerType, String question, boolean answer) {
        super(correctAnswer, questionType, answerType);
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
