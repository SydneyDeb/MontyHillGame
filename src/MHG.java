public class MHG {
    private int carDoor;
    private int goatDoor1;

    public MHG() {
        carDoor = (int) (Math.random() * 3) + 1;
    }

    public int GoatDoor(int userPick) {
        goatDoor1 = (int) (Math.random() * 3) + 1;
        if (carDoor == 1 && userPick == 2) {
            goatDoor1 = 3;
        }
        else if (carDoor == 1 && userPick == 3){
            goatDoor1 = 2;
        }
        else if (carDoor == 2 && userPick == 3){
            goatDoor1 = 1;
        }
        else if (carDoor == 2 && userPick == 1){
            goatDoor1 = 3;
        }
        else if (carDoor == 3 && userPick == 1) {
            goatDoor1 = 2;
        }
        else if (carDoor == 3 && userPick == 2) {
            goatDoor1 = 1;
        }
        else {
            return goatDoor1;
        }
        return goatDoor1;
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
