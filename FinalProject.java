import java.util.Arrays;
import java.util.Scanner;

public class FinalProject {

    public static void main(String[] args) {
        makePlayer();
    }

    public static void makePlayer(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to DND Character Creator!");
        System.out.println();

        keyboard.useDelimiter("\\n");
        System.out.println("Do you want to use : (1) rolls, (2) standard array, (3) your own values?");
        int choice = keyboard.nextInt();

        if (choice == 1){
            rolledPlayer();
        }

    }

    public static void rolledPlayer(){
        Scanner keyboard = new Scanner(System.in);

        String stats[] = {"strength", "dexterity",  "constitution",  "intelligence",  "wisdom",  "charisma"};
        int rolls[] = new int[6];
        for (int x = 0; x < 6; x++){
            rolls[x] = (int)((Math.random() * 20) + 1);
        }
        System.out.println("You rolled" + Arrays.toString(rolls));

        for (int x = 0; x < 6; x++){
            System.out.println("What stat do you want to put "+ rolls[x] +"into?");
            keyboard.useDelimiter("\\n");
            System.out.println(stats);
            String choice = keyboard.next();
        }

    }


}
