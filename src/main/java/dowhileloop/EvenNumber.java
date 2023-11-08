package dowhileloop;

public class EvenNumber {
    public static void main(String[] args) {
        int i = 1;
        int EvenCount = 2;
        System.out.println("Even numbers:");
        do {
            System.out.println(EvenCount);
            EvenCount += 2;
            i++;
        } while (i <= 5);
    }
}
