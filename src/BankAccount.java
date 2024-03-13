public class BankAccount {
    private double balance;
    private String accountnumber;
    public BankAccount(double balance , String accountnumber)
    {
        this.balance = balance;
        this.accountnumber = accountnumber;
    }

    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println("Ammount:" +amount+ ".New Balance:" +balance);
        } else {
            System.out.println("Invalid amount Please enter valid positive value:");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -=amount;
            System.out.println("Amount:" +amount+  ".New Balance:" +balance);
        } else {
            System.out.println("Invalid amount enter please enter valid number");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountnumber;
    }

    public static void main (String args[]){

        BankAccount myAccount = new BankAccount (100 , "134567");
        System.out.println("Account Balance:" + myAccount.getBalance());
        System.out.println("Account Number:" + myAccount.getAccountNumber());

        myAccount.deposit (100.0);
        myAccount.withdraw (200.0);
        myAccount.withdraw (100.0);
    }
}
