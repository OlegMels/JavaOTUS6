import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Question {

    private static final String HINT = "(в качестве ответа подразумевается номер ответа, который считаете верным)";
    private String statement;
    private Answer[] answers;
    private int correctAnswerNum;

    public Question() {
    }

    public Question(String statement, Answer[] answers, int correctAnswerNum) {
        this.statement = statement;
        this.answers = answers;
        this.correctAnswerNum = correctAnswerNum;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public int getCorrectAnswerNum() {
        return correctAnswerNum;
    }

    public void setCorrectAnswerNum(int correctAnswerNum) {
        this.correctAnswerNum = correctAnswerNum;
    }

    public void printQuestion() {
        //  Вывод вопроса на экран
        System.out.println(this.statement + HINT);

        //  Вывод вариантов ответов на экран
        for (int i = 0; i < this.answers.length; i++) {
            System.out.println(i + 1 + ". " + this.answers[i].getStatement());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof Question) {
            Question question = (Question) o;
            return (correctAnswerNum == question.correctAnswerNum && Objects.equals(statement, question.statement) && Arrays.equals(answers, question.answers));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(statement, correctAnswerNum);
        result = 31 * result + Arrays.hashCode(answers);
        return result;
    }
}
