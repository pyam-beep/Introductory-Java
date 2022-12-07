import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter your first entity: ");
        int num1 = n.nextInt();
        System.out.println("enter your second entity");
        int num2 = n.nextInt();
        int i, num=1,j;
        for (i =1; i<=num2;i++){
            for (j = num2; j<=num2;j++){
                num *= num1;
            }
        }
        System.out.println("The power answer: "+num);
    }
}
