import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Member primaryMember = new Member();

        Store storeOne = new Store("FirstStore", "5th Avenue", "188357", "Kenan");
        SuperRent.addStore(storeOne);
        storeOne.addItem(new Item(100, new Movie(1000, "John Wick", "Action movie", TitleType.Normal, 885679, "Chad Stahelski", "Keanu Reeves", 101, 2014, 30, 5)));
        storeOne.addItem(new Item(101, new Game(1001, "Call of Duty", "RPG game", TitleType.NewArrival, 956742, "Activision", 2024, 32, 6)));
        storeOne.addItem(new Item(102, new Music(1002, "Not Like Us", "Hip-Hop", TitleType.Promotional, 456239, "Kendrick Lamar", 4, 1, 5, 1)));

        System.out.println("Welcome to SuperRent!");
        System.out.println("If you would like to register, press 'r' , if you want to rent a dvd, press 'd' ");
        Scanner scanner = new Scanner(System.in);
        String answerOne = scanner.nextLine();

        if (answerOne.equals("r")) {
            SuperRent.register(primaryMember);
            renting(scanner,storeOne,primaryMember);
        } else if (answerOne.equals("d")) {
            if (!(SuperRent.checkMembership(primaryMember))) {
                System.out.println("Please register first");
                SuperRent.register(primaryMember);
                renting(scanner,storeOne,primaryMember);
            } else {
                renting(scanner,storeOne,primaryMember);
            }
        }
    }
    public static void renting(Scanner scanner,Store storeOne, Member primaryMember){
        boolean done = false;
        int totalRentalFee = 0;
        do {
            System.out.println("Choose an item");
            System.out.println();
            storeOne.listItems();
            String choiceOne = scanner.nextLine();
            Item itemOne = storeOne.findItem(choiceOne);
            if (itemOne != null) {
                if (storeOne.checkItemAvailability(itemOne)) {
                    double rentalFee = itemOne.getTitle().getRentalFee();
                    totalRentalFee += rentalFee;
                    System.out.println("Your rental fee is: " + rentalFee);
                    System.out.println("Total rental fee so far: " + totalRentalFee);
                    System.out.println("Do you want to rent another item? (Y/N)");
                    String continueRenting = scanner.nextLine();
                    if (!continueRenting.equalsIgnoreCase("Y")) {
                        done = true;
                    }
                } else {
                    System.out.println("Item unavailable");
                }
                storeOne.getBoughtItems().add(itemOne);
            }


        } while (!done);


        System.out.println("Your total rental fee is: " + totalRentalFee);
        System.out.println("Please enter the payment amount:");
        double cash = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(storeOne.processPayment(storeOne.getBoughtItems(), cash));
    }
}
