import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestOop {

    public static void main(String[] args) {
        System.out.println("Тест на знание героев в мультфильме Простоквашино.\n");

        Answer[] listAnswer1 = new Answer[] {
                new Answer("1. Пушок"),
                new Answer("2. Матроскин"),
                new Answer("3. Рыжик"),
                new Answer("4. Гав")};
        Answer[] listAnswer2 = new Answer[] {
                new Answer("1. Дядя Федор"),
                new Answer("2. Дядя Петя"),
                new Answer("3. Дядя Вася"),
                new Answer("4. Дядя Женя")};
        Answer[] listAnswer3 = new Answer[] {
                new Answer("1. Овечкин"),
                new Answer("2. Тучкин"),
                new Answer("3. Печкин"),
                new Answer("4. Бочкин")};

        //Answer[] listAnswers = new Answer[]{answer1, answer2, answer3, answer4};

        Question question1 = new Question("Вопрос №1. Как звали кота?",listAnswer1,new Answer("2. Матроскин"));
        Question question2 = new Question("Вопрос №2. Как звали мальчика?", listAnswer2, new Answer("1. Дядя Федор"));
        Question question3 = new Question("Вопрос №3. Как звали почтальона?", listAnswer3, new Answer("3. Печкин"));
        //List<Question> questions = Arrays.asList(question1, question2, question3);

        System.out.printf(question1.getNameQuestion(), Arrays.toString(question1.getListAnswers()));
        //System.out.printf(question2.getNameQuestion(), question2.getListAnswers(), question2.getCorrectAnswer());
        //System.out.printf(question3.getNameQuestion(), question3.getListAnswers(), question3.getCorrectAnswer());

        //String [] answers = new String[listAnswer1.length];

        //for(Question q : questions) {
        //    System.out.println(q);
           //q.getNameQuestion();
         // for(Answer a : answers) {
             //System.out.println(question1.getNameQuestion());
         // }
          //     a.getListAnswers();
         // }

        //for (int q = 0; q < questions.size(); q++) {
           // System.out.println(questions.get(q));
            //for (int a = 0; a < listAnswers[q].length; a++) {
           //    System.out.println(listAnswers[q][a]);
           // }

            //System.out.print("Введите вариант ответа от 1 до 4");
           // Scanner scan = new Scanner(System.in);
            //int sc = scan.nextInt();
        }





        /*int[] rightAnswers = new int[3];
        rightAnswers[0] = 2;
        rightAnswers[1] = 1;
        rightAnswers[2] = 3;

        int testResult = 0;
        int[] inputValues = new int[3];
        System.out.print("Введите вариант ответа от 1 до 4 :");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            inputValues[i] = scan.nextInt();
            if (inputValues[i] == rightAnswers[i]) {
                testResult++;
                System.out.println("Правильный ответ");
            } else if (inputValues[i] > 4) {
                System.out.println("Вы ввели несуществующий ответ");
            } else {
                System.out.println("Неправильный ответ на вопрос");
            }

        }
        System.out.println("Количество правильных ответов: " + testResult);*/
    //}
}


