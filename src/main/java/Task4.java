import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String args[]) throws IOException {
        Scanner s =new Scanner(System.in);
        System.out.write("Enter 1 for calculating SI or CI".getBytes());
        System.out.write("\nEnter 2 to calculate the cost of construction".getBytes());
        System.out.write("\nEnter 3 to exit".getBytes());
        int choose=s.nextInt();
        switch (choose){
            case 1:
                InterestCalc i=new InterestCalc();
                i.calculate();
                break;
            case 2:
                Construction c=new Construction();
                c.calculate();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.write("invalid choice".getBytes());
        }
    }
}
