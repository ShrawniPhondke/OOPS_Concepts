package OOPS.Encp;

public class Enc {

    // enc is a wrapping data and methods in a single unit . and restrict the direct access od the data using private variable

    private String name;
    private int balance;
    private int accnumber;

    public Enc(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(int accnumber) {
        this.accnumber = accnumber;
    }

    void deposite(int i){
        balance = balance + i;
        System.out.println(balance);
    }
}

    class demoo {
        public static void main (String[] args){


            Enc nn = new Enc(1000);


            System.out.println(nn.getName());

            nn.setAccnumber(1234);
            System.out.println(nn.getAccnumber());

            System.out.println(nn.getBalance());

           nn.deposite(90);

        }
    }

