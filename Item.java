import java.util.Scanner;

public class Item {

    private String name;
    private int quantity;


    public Item(){
        Scanner keyboard = new Scanner(System.in);

        keyboard.useDelimiter("\\n");
        System.out.println("What will the name of the item be?");
        name = keyboard.next();

    }

    public Item(String name){
        this.name = name;
        quantity = 1;
    }
    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
}
