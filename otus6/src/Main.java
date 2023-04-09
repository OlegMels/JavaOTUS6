import java.util.Scanner;


public class Main {

    private static Question[] createQuestions() {
        return new Question[]{
                new Question(
                        "Что является важным условием для произрастания водорослей?",
                        Answer.stringsToAnswers(new String[]{"Влажность", "Плодородие грунта", "Жара"}),
                        1
                ),

                new Question(
                        "Выберите признак, характерный для водорослей?",
                        Answer.stringsToAnswers(new String[]{"Имеют корень, стебель, листья, цветы",
                                "Их строение может быть одноклеточным или многоклеточным",
                                "Размножаются исключительно спорами или делением клеток"}),
                        2
                ),

                new Question(
                        "Клеточная пластида, вмещающая пигменты, называется:",
                        Answer.stringsToAnswers(new String[]{"Хлоропласт", "Вакуоль", "Хроматофор"}),
                        3
                ),

                new Question(
                        "Как расшифровывается с греческого языка название «хламидомонада»?",
                        Answer.stringsToAnswers(new String[]{"Водоросль, имеющая зеленую окраску",
                                "Простейший организм, покрытый одеждой (оболочкой)",
                                "Растение, живущее в воде"}),
                        2
                ),

                new Question(
                        "При помощи чего передвигаются хламидомонады в воде?",
                        Answer.stringsToAnswers(new String[]{"Ресничек", "Жгутиков", "Хвостика"}),
                        2
                ),
        };
    }

    private static int getAnswerNumFromConsole() {
        // Считываем с консоли ответ пользователя
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static void printAnswerResult(int answerNum, int correctAnswerNum) {
        //Проверяем ответ и выводим результат
        if (answerNum == correctAnswerNum) {
            System.out.print("Верно");
        } else {
            System.out.print("Неверно");
        }
    }

    private static void printAnswerResultTotal(int correctCount, int wrongCount) {
        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }

    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        Question[] questions = createQuestions();

        int answerNum;

        // Цикл по всем вопросам
        for (int i = 0; i < questions.length; i++) {
            //  Вывод вопроса на экран
            questions[i].printQuestion();

            answerNum = -1;
            while (answerNum == -1) {
                System.out.print("Ваш ответ: ");
                answerNum = getAnswerNumFromConsole();
            }

            printAnswerResult(answerNum, questions[i].getCorrectAnswerNum());

            //увеличиваем счетчики правильных и неправильных ответов
            if (answerNum == questions[i].getCorrectAnswerNum()) {
                correctCount++;
            } else {
                wrongCount++;
            }

            System.out.println();
        }

        printAnswerResultTotal(correctCount, wrongCount);
    }
}