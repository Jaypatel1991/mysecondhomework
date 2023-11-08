package forloop;

public class Tableof10 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("The Table of " + num + ":");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + "*" + i + "=" + ( num * i ));
        }
    }
}