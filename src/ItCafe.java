
import java.util.ArrayList;
import java.util.Scanner;

public class ItCafe {

    private Computers computers;
    public ItCafe(){
        computers = new Computers();
    }

    public void ComputerBooking(){
        System.out.println("Menu: Choose an option: ");

        Scanner scan = new Scanner(System.in);
        System.out.println("1-Check available computers ");
        System.out.println("2-Do you want to book a computer?");
        System.out.println("3-Are you done?");

        int input = scan.nextInt();
        if(input == 1){

            // Kalde en metode i klassen computers - hvilke der er ledige.
            // Den skal give en array liste med hvilke der der fri.
            ArrayList<Integer> list = computers.getAvailable();
            for (Integer i : list) {
                System.out.println(i);
            }


        }
        else if (input == 2) {
            System.out.println("which computer do you want to book?");
            int computerNumber =scan.nextInt();
            //kalde metoden i klassen computers at den skal bookes
            computers.BookComputer(computerNumber);

        }
        else if (input == 3){
            System.out.println("which computer are you done with?");
            int computerNumber =scan.nextInt();
            computers.UnBookComputer(computerNumber);

            // kalder metoden hvor den siger at computeren er fri igen
        }
        else {
            throw new ArithmeticException("Out of range");
        }
    }

}

