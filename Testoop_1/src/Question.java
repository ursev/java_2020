public class Question {
    private String nameQuestion;
    private Answer[] listAnswers;
    private Answer correctAnswer;

    public Question(String nameQuestion, Answer[] listAnswers, Answer correctAnswer) {
        this.nameQuestion = nameQuestion;
        this.listAnswers = listAnswers;
        this.correctAnswer = correctAnswer;
    }

    public String getNameQuestion() {   //Метод не используется
        return nameQuestion;
    }

    @Override
    public String toString() {
        return nameQuestion;
    }

    public Answer[] getListAnswers() {   //Метод не используется
        return listAnswers;
    }
    public Answer getCorrectAnswer() {
        return correctAnswer;
    }


}
