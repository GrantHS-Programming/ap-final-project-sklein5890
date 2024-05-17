public class Item {

    private String name;
    private int quantity;

    public Item(String name){
        this.name = name;
        quantity = 1;
    }
    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
}
