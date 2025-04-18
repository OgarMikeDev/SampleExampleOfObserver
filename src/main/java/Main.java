import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задайте свой вопрос и выберите советчика(Ангел/Дьявол):");
        String question = new Scanner(System.in).nextLine();

        ActualQuestion actualQuestion = new ActualQuestion();
        actualQuestion.askQuestion(question);

        AngelListener angelListener = new AngelListener();

        DevilListener devilListener = new DevilListener();

        System.out.println("Напишите советчика - ANGEL/DEVIL:");
        ChoiceAngelOrDevil choiceUser = ChoiceAngelOrDevil.valueOf(new Scanner(System.in).nextLine());

        getAnswerFromAngelOrDevil(actualQuestion, angelListener, devilListener, choiceUser);
    }

    public static void getAnswerFromAngelOrDevil(
            ActualQuestion actualQuestion,
            AngelListener angelListener,
            DevilListener devilListener,
            ChoiceAngelOrDevil choiceUser
    ) {
        if (choiceUser.equals(ChoiceAngelOrDevil.ANGEL)) {
            angelListener.actionPerformed(actualQuestion);
        } else if (choiceUser.equals(ChoiceAngelOrDevil.DEVIL)) {
            devilListener.actionPerformed(actualQuestion);
        }
    }
}
