import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = n.nextInt();
        int p=1 ,ne =1 ,z=1 ;
        String yn = n.nextLine();
        do{
            if (number > 0){
                p++;
            }
            else if (number < 0){
                ne++;
            }
            else {
                z++;
            }
        }while (yn.equals("Y"));

    }
}
