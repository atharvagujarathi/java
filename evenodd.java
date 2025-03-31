import java.util.Scanner;

public class evenodd {

    public static int evenOdd(int no1) {
        if (no1 % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int no1 = sobj.nextInt();

        int iBet = evenOdd(no1);
        if (iBet == 1) {
            System.out.println("even it is");
        } else {
            System.out.println("odd it is");
        }
    }
}
