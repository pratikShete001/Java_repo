import java.util.Scanner;

class bank1 {
    int accno;
    String accname;
    double balance;

    bank1(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    void deposit(double deposit_amount) {
        balance = balance + deposit_amount;
        System.out.println("Your new available balance is: " + balance);
    }

    void withdraw(double amount) {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Your current balance: " + balance);
        } else if (balance == amount) {
            System.out.println("Your current balance is " + balance +
                               ". Your minimum balance should be 100. Hence cannot withdraw.");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number, account name and balance: ");
        int a_no = sc.nextInt();// get account number from account number
        String a_name = sc.nextLine();// account name from user
        double bal = sc.nextDouble(); // balance from user

       
		bank1 a = new bank1(a_no, a_name, bal); // Object of bank1 class
        System.out.println("Enter\n 1 for depositing \n 2 for withdrawal");
        int option = sc.nextInt();
        double amount;

        switch (option) {
            case 1:
                System.out.println("Enter the amount to deposit: ");
                amount = sc.nextDouble();
                a.deposit(amount);
                break;

            case 2:
                System.out.println("Enter the amount to withdraw: ");
                amount = sc.nextDouble();
                a.withdraw(amount);
                break;

            default:
                System.out.println("Enter a valid option.");
                break;
        }
    }
}
