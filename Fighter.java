public class Fighter extends Player{

    public Fighter(int strength,int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        super(strength,dexterity,constitution,intelligence,wisdom,charisma);

        //need to change above

    }

    @Override
    public void setWeapons(Weapon[] weapons) {
        super.setWeapons(weapons);
    }
}
