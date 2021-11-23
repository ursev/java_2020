import java.util.Objects;

public class Answer {
    private String nameAnswer;

    public Answer(String nameAnswer) {
        this.nameAnswer = nameAnswer;
}

   public String getNameAnswer() {   //Метод не используется
        return nameAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return Objects.equals(nameAnswer, answer.nameAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAnswer);
    }

    @Override
    public String toString() {
        return nameAnswer;
    }

}
