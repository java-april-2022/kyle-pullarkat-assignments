public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bkact = new BankAccount();
        bkact.deposit(110, "checkings");
        bkact.deposit(100, "savings");
        bkact.displayAccountBalance();
        // Displays Totals after Deposits
        System.out.println(BankAccount.total);
        bkact.withdraw( 75, "checkings");
        bkact.withdraw( 99, "savings");
        bkact.displayAccountBalance();
        // Displays Totals after Withdrawls
        System.out.println(BankAccount.total);
    }
}
