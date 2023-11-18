public class Toy {

    private int id;
    private String name;
    private int quantity;
    private int dropChance;

    public Toy(int id, String name, int quantity, int dropChance){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.dropChance = dropChance;
    }

    public int getId() {
        return id;
    }

    public int getDropChance() {
        return dropChance;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
}
