import java.util.ArrayList;

public class Wizard extends Player{



    private ArrayList<Spell> spellsKnown = new ArrayList<>();

    public Wizard(int[] stats){
        super(stats);
        super.setClassName("Wizard");

    }

    public void setSpellsKnown(ArrayList<Spell> spellsKnown) {
        this.spellsKnown = spellsKnown;
    }

}
