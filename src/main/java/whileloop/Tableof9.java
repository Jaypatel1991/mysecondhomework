package whileloop;

public class Tableof9 {
    public static void main(String[] args) {
        int num = 9, i = 1;
        System.out.println("The Table of " + num + ":");
        while (i <= 10) {
            System.out.println(num + "*" + i + "=" + (num * i));
            i++;
        }
    }
}