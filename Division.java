import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        float result;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number1 = input.nextInt();
        System.out.println("Введите целое число: ");
        int number2 = input.nextInt();

        try {
            if (number2 != 0) {
                result = (float) number1 / number2;
                System.out.println(result);
            } else {
                result = number1 / number2;
            }
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }

    public void doAnyWork(DataSource ds) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        try (Connection conn = ds.getConnection();
             InputStream stream = classLoader.getResourceAsStream("/file.txt")) {

        } catch (Exception e) {

        }
    }

}
