import java.io.IOException;
import java.util.Scanner;

public class InterestCalc {
    private boolean exit;
    private float p, r, t, interest, amount;
    InterestCalc(){
        exit=false;
        p=r=t=interest=amount=0;
    }
    public void calculate() throws IOException {
        Scanner s = new Scanner(System.in);
        CalcInterest ic = new CalcInterest();
        while (exit == false) {
            System.out.write("\nEnter Principal, Rate and Time period(in years): ".getBytes());
            p = s.nextFloat();
            r = s.nextFloat();
            t = s.nextFloat();
            System.out.write("\n**** MENU ****\n".getBytes());
            System.out.write("1. Calculate Simple Interest\n".getBytes());
            System.out.write("2. Calculate Compound Interest\n".getBytes());
            System.out.write("3. Exit\n".getBytes());
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    interest = ic.calculateSI(p, r, t);
                    System.out.write(("The simple interest on principal Rs. " + p
                            + " @ " + r + "% for " + t
                            + " years is Rs." + interest).getBytes());
                    amount = p + interest;
                    System.out.write(("\nThe total amount to be paid is Rs." + amount).getBytes());
                    break;
                case 2:
                    interest = ic.calculateCI(p, r, t);
                    System.out.write(("The Compoud interest on principal Rs. " + p
                            + " @ " + r + "% for " + t
                            + " years is Rs." + interest).getBytes());
                    amount = p + interest;
                    System.out.write(("\nThe total amount to be paid is Rs." + amount).getBytes());
                    break;
                case 3:
                    System.out.write("Program Terminating ...".getBytes());
                    exit = true;
                    break;
                default:
                    System.out.write("enter valid input".getBytes());
            }
        }
    }

}
