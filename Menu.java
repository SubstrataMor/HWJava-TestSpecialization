import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    final String MENU = "1. Загрузить игрушки.\n" +
            "2. Розыгрыш.\n" +
            "3. Выход.\n";

    public void start() throws IOException {
        Scanner scan = new Scanner(System.in);
        ReadFile file = new ReadFile();
        List<Toy> toys = file.read();
        while (true) {
            System.out.println("Выбирите действие: ");
            System.out.println(MENU);
            String user_choose = scan.nextLine();

            if (user_choose.equals("1")) {
                if (toys.size() != 0) {
                    PrintToys.print(toys);
                } else {
                    System.out.println("Нет доступных игрушек. Необходимо создать игрушку.");
                }

            } else if (user_choose.equals("2")) {
                ToyMarket toyMarket = new ToyMarket();
                toyMarket.toyWeight(toys);
                
            } else if (user_choose.equals("3")) {
                System.out.println("Программа завершила свою работу.");
                if (toys.size() != 0) {
                    SaveFile save = new SaveFile();
                    save.writeData(toys.get(0), false);
                    toys.remove(0);
                    for (Toy item : toys) {
                        save.writeData(item, true);
                    }
                    break;
                } else {
                    break;
                }
            } else {
                System.out.println("Некорректный ввод. Попробуйте еще раз");
            }
        }
    }
}