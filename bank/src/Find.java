import java.util.*;

public class Find {
    public static void main(String[] args) {
            LocalDate age1 = LocalDate.of(2019, Month.FEBRUARY, 22);
            LocalDate age2 = LocalDate.of(1985, Month.FEBRUARY, 22);
            LocalDate age3 = LocalDate.of(2000, Month.FEBRUARY, 22);

            Client client1 = new Client("Иванов",age1);
            Client client2 = new Client("Петров",age2);
            Client client3 = new Client("Сидоров",age3);

            Account account1 = new Account(1);
            Account account2 = new Account(2);
            Account account3 = new Account(3);
            Account account4 = new Account(4);
            Account account5 = new Account(5);

            client1.setAccounts(account1, account2);
            client2.setAccounts(account3);
            client3.setAccounts(account4, account5);

            Map<Client, List<Account>> map = new HashMap<>();
            map.put(client1, client1.getAccounts());
            map.put(client2, client2.getAccounts());
            map.put(client3, client3.getAccounts());

            Bank bank = new Bank(map);

            System.out.println(bank.getAccounts(client1)); // Вывод счетов
            System.out.println(bank.getAccounts(client2));
            System.out.println(bank.getAccounts(client3));

            System.out.println(bank.findClient(account1)); // Вывод фамилии по счету
            System.out.println(bank.findClient(account2));
            System.out.println(bank.findClient(account3));
            System.out.println(bank.findClient(account4));
            System.out.println(bank.findClient(account5));
    }
}
