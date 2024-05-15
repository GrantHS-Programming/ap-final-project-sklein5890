public class Player {
            private int strength;
            private int dexterity;
            private int constitution;
            private int intelligence;
            private int wisdom;
            private int charisma;
            private String[] weapons;
            private String armor;
            private String[] items;

            //basic player with nothing special(npc)
            public Player() {
                strength= 10;
                dexterity= 10;
                constitution= 10;
                intelligence= 10;
                wisdom= 10;
                charisma= 10;

            }
            //player with specific values, either from rolling or standard array
            public Player(int strength,int dexterity, int constitution, int intelligence, int wisdom, int charisma){
                this.strength= strength;
                this.dexterity= dexterity;
                this.constitution= constitution;
                this.intelligence= intelligence;
                this.wisdom= wisdom;
                this.charisma= charisma;
            }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }
}


