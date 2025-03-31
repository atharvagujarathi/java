import java.util.*;

class addition {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int no1 = sobj.nextInt();

        System.out.println("Enter the Second Number : ");
        int no2 = sobj.nextInt();

        int result = no1 + no2;

        System.out.println(result);
    }
}