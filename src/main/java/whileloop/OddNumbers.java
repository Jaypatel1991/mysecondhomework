package whileloop;

public class OddNumbers {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Odd Numbers");
        while (i<=10)
        {
            if (i%2==1)
            {
            System.out.println(i+"");
            }
            i++;;
        }
    }
}