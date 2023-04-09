public class Answer {
    private String Statement;

    public Answer() {
    }

    public Answer(String statement) {
        Statement = statement;
    }

    public String getStatement() {
        return Statement;
    }

    public void setStatement(String statement) {
        Statement = statement;
    }

    public static Answer[] stringsToAnswers(String[] stringAnswer) {
        if (stringAnswer == null || stringAnswer.length == 0) return new Answer[]{};

        Answer[] answers = new Answer[stringAnswer.length];
        for (int i = 0; i < stringAnswer.length; i ++) {
            answers[i] = new Answer(stringAnswer[i]);
        }
        return answers;
    }
}
