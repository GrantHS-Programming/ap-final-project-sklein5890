public class Armor extends Item{

    private String type;
    private int armorClass;

    public Armor(String name, String type, int armorClass){
        super(name);
        this.type = type;
        this.armorClass = armorClass;
    }

}
