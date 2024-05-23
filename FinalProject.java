import java.util.ArrayList;
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
            Player player1 = new Player(rolledPlayer());
        }

        else if(choice == 2){
            Player player1 = new Player(standardArrayPlayer());
        }

    }

    public static int[] rolledPlayer(){
        Scanner keyboard = new Scanner(System.in);

        int numsToGive[] = new int[6];
        String stats[] = {"strength", "dexterity",  "constitution",  "intelligence",  "wisdom",  "charisma"};
        ArrayList<Integer> rolls = new ArrayList<>();

        for (int x = 0; x < 6; x++){
            rolls.add((int)((Math.random() * 20) + 1));
        }
        System.out.println("You rolled " + rolls);
        int l = 0;
        for (int x = 0; x < 6; x++){
            System.out.println("Which of these numbers do you want to assign to "+ stats[x] +" ?");
            keyboard.useDelimiter("\\n");
            System.out.println(rolls);
            Integer choice = keyboard.nextInt();

            int p = 0;

            for (int z : rolls){
                if (z == choice){
                    numsToGive[l] = z;
                }
                p++;
            }
            rolls.remove(rolls.indexOf(choice));
            l++;
        }
        System.out.println("Here are the final values for your player: (in order of:\"strength\", \"dexterity\",  \"constitution\",  \"intelligence\",  \"wisdom\",  \"charisma\") "+Arrays.toString(numsToGive));
        return numsToGive;
    }

    public static int[] standardArrayPlayer(){
        Scanner keyboard = new Scanner(System.in);

        int numsToGive[] = new int[6];
        String stats[] = {"strength", "dexterity",  "constitution",  "intelligence",  "wisdom",  "charisma"};
        ArrayList<Integer> rolls = new ArrayList<>();

        rolls.add(15);
        rolls.add(14);
        rolls.add(13);
        rolls.add(12);
        rolls.add(10);
        rolls.add(8);

        System.out.println("This is the standard array: " + rolls);
        int l = 0;
        for (int x = 0; x < 6; x++){
            System.out.println("Which of these numbers do you want to assign to "+ stats[x] +" ?");
            keyboard.useDelimiter("\\n");
            System.out.println(rolls);
            Integer choice = keyboard.nextInt();

            int p = 0;

            for (int z : rolls){
                if (z == choice){
                    numsToGive[l] = z;
                }
                p++;
            }
            rolls.remove(rolls.indexOf(choice));
            l++;
        }
        System.out.println("Here are the final values for your player: (in order of:\"strength\", \"dexterity\",  \"constitution\",  \"intelligence\",  \"wisdom\",  \"charisma\") "+Arrays.toString(numsToGive));
        return numsToGive;
    }


}
