public abstract class Question {
    private String theQuestion;
    private String theAnswer;

    public Question(String theQuestion, String theAnswer) {
        this.theQuestion = theQuestion;
        this.theAnswer = theAnswer;
    }

    //method

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }
}
