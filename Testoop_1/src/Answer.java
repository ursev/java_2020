public class Answer {
    private String nameAnswer;

    public Answer(String nameAnswer) {
        this.nameAnswer = nameAnswer;
}

   public String getNameAnswer() {   //Метод не используется
        return nameAnswer;
    }

    @Override
    public String toString() {
        return nameAnswer;
    }
}
