import java.util.ArrayList;
import java.util.Arrays;

public class TestOop {

    public static void main(String[] args) {
        System.out.println("Тест на знание героев в мультфильме Простоквашино.\n");

        Answer[] listAnswer1 = new Answer[]{
                new Answer("1. Пушок"),
                new Answer("2. Матроскин"),
                new Answer("3. Рыжик"),
                new Answer("4. Гав")};
        Answer[] listAnswer2 = new Answer[]{
                new Answer("1. Дядя Федор"),
                new Answer("2. Дядя Петя"),
                new Answer("3. Дядя Вася"),
                new Answer("4. Дядя Женя")};
        Answer[] listAnswer3 = new Answer[]{
                new Answer("1. Овечкин"),
                new Answer("2. Тучкин"),
                new Answer("3. Печкин"),
                new Answer("4. Бочкин")};

        //Answer[] listAnswers = new Answer[]{answer1, answer2, answer3, answer4};

        Question question1 = new Question("Вопрос №1. Как звали кота?", listAnswer1, new Answer("2. Матроскин"));
        Question question2 = new Question("Вопрос №2. Как звали мальчика?", listAnswer2, new Answer("1. Дядя Федор"));
        Question question3 = new Question("Вопрос №3. Как звали почтальона?", listAnswer3, new Answer("3. Печкин"));
        String[] listQuestions = {question1.getNameQuestion(), question2.getNameQuestion(), question3.getNameQuestion()};
        System.out.println(Arrays.toString(listQuestions));
        //String[][] listAnswers = {question1.getListAnswers(), question2.getListAnswers(), question3.getListAnswers()};
        //System.out.println(Arrays.toString(listAnswers));

        System.out.println(question1.getNameQuestion());
        System.out.println(Arrays.toString(question1.getListAnswers()));

    }
}


