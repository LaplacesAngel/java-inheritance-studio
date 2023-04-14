public class MultipleChoice extends Question{
    private String question;
    private String answer;

    public MultipleChoice(String theQuestion, String theAnswer, String question, String answer) {
        super(theQuestion, theAnswer);
        this.question = question;
        this.answer = answer;
    }
}
