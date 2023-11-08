package dowhileloop;

public class OddNumber {
    public static void main(String[] args) {
        int i = 1;
        int OddCount = 1;
        System.out.println("Odd numbers:");
        do {
            System.out.println(OddCount);
            OddCount += 2;
            i++;
        } while (i <= 5);
    }
}
