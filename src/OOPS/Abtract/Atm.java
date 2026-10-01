package OOPS.Abtract;

abstract class Atm {

    abstract void withdraw();

    void checkBalance() {
        System.out.println("Checking balance...");
    }
}
 class Main {
    public static void main(String[] args) {

        sbi s = new sbi();

        s.withdraw();
        s.checkBalance();
    }
}
