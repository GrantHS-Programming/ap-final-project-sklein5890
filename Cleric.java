import java.util.ArrayList;

public class Cleric extends Player{


    private ArrayList<Spell> spellsKnown = new ArrayList<>();

    public Cleric(int[] stats){
        super(stats);
        super.setClassName("Cleric");

    }

    public void setSpellsKnown(ArrayList<Spell> spellsKnown) {
        this.spellsKnown = spellsKnown;
    }
}
