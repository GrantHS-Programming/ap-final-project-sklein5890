import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {

            private String className = "no class";

            private Race race;
            private int strength;
            private int dexterity;
            private int constitution;
            private int intelligence;
            private int wisdom;
            private int charisma;
            private Armor armorOwned;
            private ArrayList<Weapon> weaponsOwned = new ArrayList<>();
            private ArrayList<Item> itemsOwned = new ArrayList<>();
            private int level;



    //player with specific values, either from rolling or standard array
            public Player(int[] stats){
                strength = stats[0];
                dexterity = stats[1];
                constitution = stats[2];
                intelligence = stats[3];
                wisdom = stats[4];
                charisma = stats[5];
            }

            public void addToStats(int[] stats){
                strength += stats[0];
                dexterity += stats[1];
                constitution += stats[2];
                intelligence += stats[3];
                wisdom += stats[4];
                charisma += stats[5];
            }

            public void setWeapons(ArrayList<Weapon> weapons) {
                this.weaponsOwned = weapons;
            }

            public void setItems(ArrayList<Item> items){
                this.itemsOwned = items;
            }

            public int[] getAllStats(){
                int[] stats = {strength,dexterity,constitution,intelligence,wisdom,charisma};
                return stats;
            }

            public void setClassName(String str){
                className = str;
            }

            public String getClassName(){
                return className;
            }

            public int[] pickRace(){
                Scanner keyboard = new Scanner(System.in);

                Race race1;

                keyboard.useDelimiter("\\n");
                System.out.println("What race do you want to be : Human, Elf, Dwarf,");
                String raceChoice = keyboard.next();

                if (raceChoice.equals("Human")){
                    int[] given = {1,1,1,1,1,1};
                    race1 = new Race("Human", given);
                }

                else if (raceChoice.equals("Elf")){
                    int[] given = {0,2,0,0,1,0};
                    race1 = new Race("Elf", given);
                }

                else if (raceChoice.equals("Dwarf")){
                    int[] given = {1,0,2,0,0,0};
                    race1 = new Race("Dwarf", given);
                }

                else {
                    int[] given = {0,0,0,0,0,0};
                    race1 = new Race("none", given);
                }

                race = race1;

                return race1.getStatBonus();

            }


}





