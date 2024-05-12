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
            System.out.println("Would you like to rent item now?");
            String answerTwo = scanner.nextLine();
            if(answerTwo.equals("no") ||answerTwo.equals("No") || answerTwo.equals("n")){
                System.exit(0);
            }
        } else if (answerOne.equals("d")) {
            if (!(SuperRent.checkMembership(primaryMember))) {
                System.out.println("Please register first");
                SuperRent.register(primaryMember);
            } else {
                System.out.println("Choose an item");
                System.out.println();
                storeOne.listItems();
                String choiceOne = scanner.nextLine();
                Item itemOne = storeOne.findItem(choiceOne);
                if (itemOne != null) {
                    if (storeOne.checkItemAvailability(itemOne)) {
                        System.out.println("Your rental fee is: " + itemOne.getTitle().getRentalFee());
                        double cash = scanner.nextDouble();
                        scanner.nextLine();
                        storeOne.processPayment(itemOne, cash);
                    } else {
                        System.out.println("Item unavailable");
                    }

                }

            }
        }

        System.out.println("Choose an item");
        System.out.println();
        storeOne.listItems();
        String choiceOne = scanner.nextLine();
        Item itemOne = storeOne.findItem(choiceOne);
        if (itemOne != null) {
            if (storeOne.checkItemAvailability(itemOne)) {
                System.out.println("Your rental fee is: " + itemOne.getTitle().getRentalFee());
                double cash = scanner.nextDouble();
                scanner.nextLine();
                System.out.println(storeOne.processPayment(itemOne, cash));
            } else {
                System.out.println("Item unavailable");
            }


        }
    }
}
