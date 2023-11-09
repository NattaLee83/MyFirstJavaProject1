package bankapp;

public class BankAccount {

        //Vi skapar en variabel kallad balance som
        //Representerar mängden vi har på kontot!
        //Den innehåller för tillfället inget värde!
        private int balance;
        private String name;

        //Vi skapar en konstruktor för att ta in en summa
        // som vi sedan sätter balance, lika med.
        //Vi gör sedan samma sak med myName/name
        public BankAccount(int myBalance, String myName) {
            if (myBalance < 0) {
                balance = 0;
            } else {
                balance = myBalance;
            }
            name = myName;
        }


    public void printBalance() {
    }

    public void setBalance(int i) {
    }

    public void deposit(int i) {
    }

    public void withdraw(int i) {
    }
}
