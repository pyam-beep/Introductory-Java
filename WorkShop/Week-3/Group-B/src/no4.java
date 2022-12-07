import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = f.nextInt();
        int i = 1, fr = 1;
        while (i <= n){
            fr = fr * i;
            i++;
        }
        System.out.println("The factorial of given number is "+fr);
    }
}
