public class CheckingAccount extends BankAccount{
    static double FEE = 0.15;
    public  CheckingAccount(String name, int account){
    super(); 
      String modAccount = account + "-10";
      setAccountNumber(modAccount);
    }
    public boolean withdraw(double amount){
      double modWithdraw = amount + FEE;
      return super.withdraw(modWithdraw);
    }
}
    