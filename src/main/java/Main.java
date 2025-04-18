public class Main {
    public static void main(String[] args) {
        ActualQuestion actualQuestion = new ActualQuestion();
        actualQuestion.askQuestion("Ты пойдёшь в это воскресенье храм?");

        AngelListener angelListener = new AngelListener();
        angelListener.actionPerformed(actualQuestion);

        DevilListener devilListener = new DevilListener();
        devilListener.actionPerformed(actualQuestion);
    }
}
