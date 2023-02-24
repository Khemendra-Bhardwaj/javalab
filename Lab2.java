import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Account account1 = new Account(scn);

        System.out.println("Enter -1 : exit \n1: deposit \n2: show Balance \n3: withdrawal\n");

        while (true) {
            int oper = scn.nextInt();

            if (oper == -1) {
                break;
            }
            if (oper == 1) {
                account1.Deposit();
            }
            if (oper == 2) {
                account1.showBalance();
            }
            if (oper == 3) {
                account1.Withdraw();
            } if(oper>=4 ) {
                System.out.println("Invalid Operation  \n");
            }
        }
    }
}


class Account {
    private double balance = 1000;
    private Scanner scn;

    public Account(Scanner scn) {
        this.scn = scn;
    }

    public void showBalance() {
        System.out.println("Your Account Has : " + balance + "\n");
    }

    public void Deposit() {
        System.out.println("Enter the amount to deposit: ");
        double money = scn.nextDouble();
        balance += money;
        System.out.println("Amount Deposited  : " + money + "\n");
    }

    public void Withdraw() {
        System.out.println("Enter the amount to withdraw: ");
        double take_out = scn.nextDouble();
        if (take_out > balance) {
            System.out.println("Insufficient Balance \n");
        } else {
            balance -= take_out;
            System.out.println("Amount Withdrawn  " + take_out + "\n");
        }
    }
}

