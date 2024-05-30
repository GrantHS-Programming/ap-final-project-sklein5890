import java.util.ArrayList;

public class Player {

            private String className = "no class";
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


}





