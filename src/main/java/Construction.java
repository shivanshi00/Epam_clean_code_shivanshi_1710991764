import java.io.IOException;
import java.util.Scanner;

public class Construction {
    private float area;
    private boolean exit;

    Construction() {
        area = 0;
        exit = false;
    }

    public void calculate() throws IOException {
        Scanner sc = new Scanner(System.in);
        ConstructionCost cost = new ConstructionCost();
        while (exit == false) {
            System.out.write("\nEnter area of house: (in sqr feet)".getBytes());
            area = sc.nextFloat();
            System.out.write("**** Material Standards ****\n".getBytes());
            System.out.write("1. Standard Material @ Rs.1200/sq feet\n".getBytes());
            System.out.write("2. Above Standard Material @ Rs.1500/sq feet\n".getBytes());
            System.out.write("3. High Standard Material @ Rs.1800/sq feet\n".getBytes());
            System.out.write("4. High Standard Material and Fully Automated @ Rs.2500/sq feet\n".getBytes());
            System.out.write("5. Exit\n".getBytes());
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.write(("The total cost of standard material for house of area " + area + " sq feet is Rs." + cost.standardHouseCost(area)).getBytes());
                    break;
                case 2:
                    System.out.write(("The total cost of above standard material for house of area " + area + " sq feet is Rs." + cost.aboveStandardHouseCost(area)).getBytes());
                    break;
                case 3:
                    System.out.write(("The total cost of high standard material for house of area " + area + " sq feet is Rs." + cost.highStandardHouseCost(area, false)).getBytes());
                    break;
                case 4:
                    System.out.write(("The total cost of high standard material and fully automated house of area " + area + " sq feet is Rs." + cost.highStandardHouseCost(area, true)).getBytes());
                    break;
                case 5:
                    System.out.write("Program Terminating..".getBytes());
                    exit = true;
                    System.exit(0);
                    break;
                default:
                    System.out.write("Wrong choice!!".getBytes());
            }
        }

    }
}
