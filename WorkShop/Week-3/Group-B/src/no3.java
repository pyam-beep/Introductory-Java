import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner m =new Scanner(System.in);
        System.out.print("Enter the number that you need to find the multiplication table of: ");
        int n = m.nextInt();
        while (n < 0){
            System.out.print("Enter positive integer: ");
            int n1 = m.nextInt();
        }
        int i = 1, mu = 1;
        while (i <= 10) {
            mu = n * i;
            i++;
            System.out.println("The multiplication table is " + mu);
        }

    }
}
