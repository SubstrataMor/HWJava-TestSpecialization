import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class SaveFile {
    public void writeData(Toy toy, boolean sign){
        File file = new File("src/toys.txt");
        try (FileWriter filewriter = new FileWriter(file, sign)) {
            StringBuilder data = new StringBuilder();
            data.append(toy.getId() + ";");
            data.append(toy.getName() + ";");
            data.append(toy.getQuantity() + ";");
            data.append(toy.getDropChance() + ";");
            filewriter.write(data.toString() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}