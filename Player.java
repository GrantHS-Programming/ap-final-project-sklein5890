public class Player {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

//basic player with nothing special(npc)
    public Player() {
        strength= 10;
        dexterity= 10;
        constitution= 10;
        intelligence= 10;
        wisdom= 10;
        charisma= 10;

    }

    public Player(int strength,int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        this.strength= strength;
        this.dexterity= constitution;
        this.constitution= constitution;
        intelligence= 10;
        wisdom= 10;
        charisma= 10;
    }

}
