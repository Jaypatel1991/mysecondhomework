package whileloop;

public class EvenNumber {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Even Numbers");
        while (i<=10)
        {
            if (i%2==0)
            {
                System.out.println(i+"");
            }
            i++;;
        }
    }
}
