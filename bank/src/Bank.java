import java.util.List;
import java.util.Map;

public class Bank {

    private Map<Client, List<Account>> map;

    public Bank(Map<Client, List<Account>> map) {
        this.map = map;
    }

    public List<Account> getAccounts(Client client) {
        return map.get(client);
    }

    public Client findClient(Account account) {
        for (Map.Entry<Client, List<Account>> entry : map.entrySet()) {
            for (Account a : entry.getValue()) {
                if (a.equals(account)) {
                    return entry.getKey();
                }
            }
        }

        return null;
    }
}
