public class Account {
  private int accountId;

  public Account(int accountId) {
    this.accountId = accountId;
  }
  public int getAccountId() {
    return accountId;
  }

  @Override
  public String toString() {
    return "Account{" +
            "accountId=" + accountId +
            '}';
  }
}
