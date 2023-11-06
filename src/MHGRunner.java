import java.util.Scanner;
class MHGRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MHG round = new MHG();
        System.out.println("Welcome to the Monty Hall Game!");
        System.out.println("There are two goats and a car randomly placed behind doors 1, 2, and 3");
        System.out.println("Where do you think the car is? Enter 1, 2 or 3: ");
        int userPick = scan.nextInt();

        int revealedDoor = round.GoatDoor(userPick);
        System.out.println("One of the goats is behind door " + revealedDoor);
        scan.nextLine();
        System.out.println("Would you like to switch your guess? Enter Yes or No: ");
        String userSwitch = scan.nextLine();

        if (userSwitch.equals("Yes") || userSwitch.equals("yes")) {
            int switchedGuess = 6 - (userPick) - revealedDoor;
            userPick = switchedGuess;
            System.out.println("You switched to door " + switchedGuess);
        }
        else if (userSwitch.equals("No") || userSwitch.equals("no")) {
            System.out.println("You stayed with door " + userPick);
        }
        else {
            System.out.println("Please input Yes or No.");
        }

        round.winOrLoose(userPick);
    }
}
