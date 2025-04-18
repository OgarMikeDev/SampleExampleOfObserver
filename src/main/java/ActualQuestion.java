public class ActualQuestion {
    private String question;

    public String getQuestion() {
        return question;
    }

    public void askQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return question;
    }
}
