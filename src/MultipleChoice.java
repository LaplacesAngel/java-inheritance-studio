public class MultipleChoice extends Question{
    private String question;
    private String answer;

    public MultipleChoice(String correctAnswer, String questionType, String answerType, String question, String answer) {
        super(correctAnswer, questionType, answerType);
        this.question = question;
        this.answer = answer;
    }
}
