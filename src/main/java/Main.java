public class Main {
    public static void main(String[] args) {
        ActualQuestion actualQuestion = new ActualQuestion();
        actualQuestion.askQuestion("Ты пойдёшь в это воскресенье храм?");

        AngelListener angelListener = new AngelListener();

        DevilListener devilListener = new DevilListener();

        getAnswerFromAngelOrDevil(actualQuestion, angelListener, devilListener, ChoiceAngelOrDevil.DEVIL); //дьявол или ангел
    }

    public static void getAnswerFromAngelOrDevil(
            ActualQuestion actualQuestion,
            AngelListener angelListener,
            DevilListener devilListener,
            ChoiceAngelOrDevil nameListener) {
        if (nameListener.equals(ChoiceAngelOrDevil.ANGEL)) {
            angelListener.actionPerformed(actualQuestion);
        } else if (nameListener.equals(ChoiceAngelOrDevil.DEVIL)) {
            devilListener.actionPerformed(actualQuestion);
        }
    }
}
