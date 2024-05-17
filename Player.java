public class Player {
            private int strength;
            private int dexterity;
            private int constitution;
            private int intelligence;
            private int wisdom;
            private int charisma;
            private Weapon[] weaponsOwned;
            private Armor armorOwned;
            private Item[] itemsOwned;
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

            public void setWeapons(Weapon[] weapons) {
                this.weaponsOwned = weapons;
            }



}





