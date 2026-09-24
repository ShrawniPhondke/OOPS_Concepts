package OOPS;

import java.util.Scanner;

public class Add {

    int a ;
    int b ;

    void getdata(){
        Scanner ss = new Scanner(System.in);
        System.out.println("enter first number : ");
        a = ss.nextInt();
        System.out.println("enter second number:  ");
        b = ss.nextInt();
    }

    void putdata(){
        System.out.println("addition: " + (a + b));
    }

}
class demo{
    public static void main (String[] args){

        Add aa = new Add();
        aa.getdata();
        aa.putdata();

    }
}
