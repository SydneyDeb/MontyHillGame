public class MHG {
    private int carDoor;
    private int GoatDoor1;

    public MHG() {
        carDoor = (int) (Math.random() * 3) + 1;
    }

    public int GoatDoor(int userPick) {
        GoatDoor1 = (int) (Math.random() * 3) + 1;
        if (GoatDoor1 != carDoor && GoatDoor1 != userPick) {
            return GoatDoor1;
        }
        else {
            GoatDoor1 = (int) (Math.random() * 3) + 1;
        }
        return GoatDoor1;
    }

    public void winOrLoose(int userPick) {
        if (userPick == carDoor) {
            System.out.println("You won the car!");
        }
        else {
            System.out.println("The car was behind door " + carDoor + ". You lost the car but hey, you still won a goat!");
        }
    }
}
