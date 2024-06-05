import java.util.Scanner;

public class Weapon extends Item{
    private int diceType;
    private int diceNum;
    private String dmgType;


    public Weapon(){
        super();

        Scanner keyboard = new Scanner(System.in);

        keyboard.useDelimiter("\\n");
        System.out.println("What dice will it use");
        diceType = keyboard.nextInt();

        keyboard.useDelimiter("\\n");
        System.out.println("How many of that dice will it use?");
        diceNum = keyboard.nextInt();

        keyboard.useDelimiter("\\n");
        System.out.println("What type of damage will it deal?");
        dmgType = keyboard.next();
    }


    public Weapon(String name, int diceType, int diceNum, String dmgType){
        super(name);
        this.diceType = diceType;
        this.diceNum = diceNum;
        this.dmgType = dmgType;
    }

}
