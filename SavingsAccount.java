public class SavingsAccount extends BankAccount{
  private double rate = 0.025;
  private int savingsNumber = 0;
  private String accountNumber;
  SavingsAccount(BankAccount oldAccount, double amount) {
    super(oldAccount, amount);
    savingsNumber += 1;
    accountNumber = oldAccount.getAccountNumber() + "-" + String.valueOf(savingsNumber);
  } 
  public SavingsAccount(String name, double balance){
    super(name, balance);
    accountNumber = super.getAccountNumber() + "-" + String.valueOf(savingsNumber);
  }
  public void postInterest () {
    double worth = getBalance() * rate;
    deposit(worth);
  }
  public String getAccountNumber()
	{
		return accountNumber;
	}
  public int getSavingsNumber() {
    return savingsNumber;
  }
}