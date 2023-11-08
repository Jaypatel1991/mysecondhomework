package dowhileloop;

public class Tableof5 {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        System.out.println("The Table of " + num + ":");
        do{
            System.out.println(num + "*" + i + "=" + (num * i));
            i++;
        } while (i <= 10);
    }
}
