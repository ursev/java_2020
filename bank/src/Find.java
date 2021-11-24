import java.util.HashMap;
import java.util.Map;

public class Find {
    public static void main(String[] args) {

            Client Client1 = new Client("Иванов");
            Client Client2 = new Client("Петров");
            Client Client3 = new Client("Сидоров");

            Map<Account, Client> accounts = new HashMap<>();
            accounts.put(new Account(1122),Client1);
            accounts.put(new Account(1123),Client1);
            accounts.put(new Account(1124),Client1);
            accounts.put(new Account(1222),Client2);
            accounts.put(new Account(1322),Client3);

            Client idName = accounts.get(1122); // хотел по счету вывести фамилию
            System.out.println(idName);

            for (Map.Entry entry: accounts.entrySet()) { // Выводит всю Map

                    System.out.println(entry);
            }
    }
}
