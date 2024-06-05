import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FinalProject {


    public static void main(String[] args) {
        makePlayer();
    }

    public static void makePlayer(){

        int[] defaultStats = {15,14,13,12,10,8};

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to DND Character Creator!");
        System.out.println();
        Player player1 = null;

        keyboard.useDelimiter("\\n");
        System.out.println("What class do you want to be?");
        System.out.println("Options: Fighter, Wizard, Cleric,");
        String classChoice = keyboard.next();

        if (classChoice.equals("Fighter") || classChoice.equals("fighter")){
            keyboard.useDelimiter("\\n");
            System.out.println("Do you want to use : (1) rolls, (2) standard array, (3) your own values?");
            int rollChoice = keyboard.nextInt();

            if (rollChoice == 1){
                player1 = new Fighter(rolledPlayer());
            }

            else if(rollChoice == 2){
                player1 = new Fighter(standardArrayPlayer());
            }

            else if (rollChoice == 3){
                player1 = new Fighter(ownValuesPlayer());
            }
        }

        else if (classChoice.equals("Wizard")|| classChoice.equals("wizard")){
            keyboard.useDelimiter("\\n");
            System.out.println("Do you want to use : (1) rolls, (2) standard array, (3) your own values?");
            int rollChoice = keyboard.nextInt();

            if (rollChoice == 1){
                player1 = new Wizard(rolledPlayer());
            }

            else if(rollChoice == 2){
                player1 = new Wizard(standardArrayPlayer());
            }

            else if (rollChoice == 3){
                player1 = new Wizard(ownValuesPlayer());
            }
        }

        else if (classChoice.equals("Cleric")|| classChoice.equals("cleric")){
            keyboard.useDelimiter("\\n");
            System.out.println("Do you want to use : (1) rolls, (2) standard array, (3) your own values?");
            int rollChoice = keyboard.nextInt();

            if (rollChoice == 1){
                player1 = new Cleric(rolledPlayer());
            }

            else if(rollChoice == 2){
                player1 = new Cleric(standardArrayPlayer());
            }

            else if (rollChoice == 3){
                player1 = new Cleric(ownValuesPlayer());
            }
        }

        else {
            keyboard.useDelimiter("\\n");
            System.out.println("Do you want to use : (1) rolls, (2) standard array, (3) your own values?");
            int rollChoice = keyboard.nextInt();

            if (rollChoice == 1) {
                player1 = new Player(rolledPlayer());
            }
            else if (rollChoice == 2) {
                player1 = new Player(standardArrayPlayer());
            }
            else if (rollChoice == 3) {
                player1 = new Player(ownValuesPlayer());
            }
            else {
                player1 = new Player(defaultStats);
            }
        }

        player1.addToStats(player1.pickRace());


        System.out.println("Here are the final values for your " + player1.getClassName() +" character : (in order of:\"strength\", \"dexterity\",  \"constitution\",  \"intelligence\",  \"wisdom\",  \"charisma\") ");
        System.out.println(Arrays.toString(player1.getAllStats()));


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
        return numsToGive;
    }

    public static int[] ownValuesPlayer(){
        Scanner keyboard = new Scanner(System.in);

        int numsToGive[] = new int[6];
        String stats[] = {"strength", "dexterity",  "constitution",  "intelligence",  "wisdom",  "charisma"};

        int l = 0;
        for (int x = 0; x < 6; x++){
            System.out.println("Which number do you want to assign to "+ stats[x] +" ?");
            keyboard.useDelimiter("\\n");
            Integer choice = keyboard.nextInt();
            numsToGive[l] = choice;
            l++;
        }
        return numsToGive;
    }


    public static void askMakeItem(){
        Scanner keyboard = new Scanner(System.in);

        keyboard.useDelimiter("\\n");
        System.out.println("What type of item do you want to make?");
        System.out.println("Basic, Weapon, or Armor?");
        String makeChoice = keyboard.next();


        if (makeChoice.equals("Basic")){

        }


    }


}
