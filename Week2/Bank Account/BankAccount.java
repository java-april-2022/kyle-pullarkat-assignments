
public class BankAccount {



        // #2 class should have attributes (double) checking balance , saving balance
        private double checkingsBalance;
        private double savingsBalance;


        //
        public static int numAccounts = 0;
        public static double total = 0;


        public BankAccount() {
            BankAccount.numAccounts +=1;
            this.checkingsBalance = 0;
            this.savingsBalance = 0;
        }

        // Returns checkings Balance
        public double getCheckingsBalance() {
            return this.checkingsBalance;
        }

        // Returns Savings Balance
        public double getSavingsBalance() {
            return this.savingsBalance;
        }

        // Deposits to either checking or savings
        public void deposit(double amount, String account){
            if(account.equals("savings"))
                this.savingsBalance += amount;
            else if(account.equals("checkings"))
                this.checkingsBalance += amount;
            BankAccount.total += amount;
        }

        // Withdraw
        public void withdraw(double amount, String account){
            boolean neededAmount = false;
            if(account.equals("savings")){
                if(this.savingsBalance - amount > 0){
                    neededAmount = true;
                }
            }

            else if(account.equals("checkings")){
                if(this.checkingsBalance - amount > 0){
                    neededAmount = true;
                    this.checkingsBalance -= amount;
                }
            }
            if(neededAmount){
                BankAccount.total -= amount;
            }
            else{
                System.out.println("Insufficent funds");
            }
        }

        
        public void displayAccountBalance(){
            System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingsBalance));
        }
}