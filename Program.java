import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {
        ToyMarket toyMarket = new ToyMarket();
        SaveFile save = new SaveFile();
        List<Toy> toys = toyMarket.creatToys();
        save.writeData(toys.get(0), false);
        toys.remove(0);
        for (Toy item : toys) {
            save.writeData(item, true);
        }
        Menu menu = new Menu();
        menu.start();
    }
}