import java.util.Scanner;

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

        Question question1 = new Question("Вопрос №1. Как звали кота?", listAnswer1, new Answer("Матроскин"));
        Question question2 = new Question("Вопрос №2. Как звали мальчика?", listAnswer2, new Answer("Дядя Федор"));
        Question question3 = new Question("Вопрос №3. Как звали почтальона?", listAnswer3, new Answer("Печкин"));
        Question[] listQuestions = {question1, question2, question3};
        Answer[][] listAnswers = {listAnswer1, listAnswer2, listAnswer3};
        Answer[] rightAnswers = {question1.getCorrectAnswer(), question2.getCorrectAnswer(), question3.getCorrectAnswer()};
        Answer[] inputValues = new Answer[listQuestions.length];

        int testResult = 0;
        for (int q = 0; q < listQuestions.length; q++) {
            System.out.println(listQuestions[q]);
            for (int a = 0; a < listAnswers[q].length; a++) {
                System.out.println(listAnswers[q][a]);
            }
            System.out.print("Введите вариант ответа от 1 до " + listAnswers[q].length + " :");
            Scanner scan = new Scanner(System.in);
            inputValues[q] = scan.nextLine();
            if (inputValues[q] == rightAnswers[q]) {
                testResult++;
                System.out.println("Правильный ответ");
            } else {
                System.out.println("Неправильный ответ на вопрос");
            }
            System.out.println("Количество правильных ответов: " + testResult);
        }
    }
}


