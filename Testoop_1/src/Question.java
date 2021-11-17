public class Question {
    private String nameQuestion;
    private Answer[] listAnswers;
    private Answer correctAnswer;

    public Question(String nameQuestion, Answer[] listAnswers, Answer correctAnswer) {
        this.nameQuestion = nameQuestion;
        this.listAnswers = listAnswers;
        this.correctAnswer = correctAnswer;
    }

    public String getNameQuestion() {
        return nameQuestion;
    }
    public Answer[] getListAnswers() {
        return listAnswers;
    }
    public Answer getCorrectAnswer() {
        return correctAnswer;
    }


}
