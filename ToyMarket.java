import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyMarket {
    public List<Toy> toyWeight(List<Toy> toyList){
        if (toyList.size() > 0){
            ArrayList<Integer> weights = new ArrayList<>();
            int sumWeight = 1;
            int countFileWriter = 0;
            for (Toy item: toyList) {
                weights.add(item.getDropChance());
                sumWeight += item.getDropChance();
            }
            Random rnd = new Random();
            int rndNumber = rnd.nextInt(1, sumWeight);

            for (Toy item: toyList) {
                countFileWriter += item.getDropChance();
                if (countFileWriter >= rndNumber){
                    if (item.getQuantity() > 0){
                        System.out.printf("Вы выиграли игрушку: %s, осталось %dшт.\n", item.getName(), item.getQuantity());
                        item.setQuantity(item.getQuantity() - 1);
                        break;
                    } else {
                        System.out.printf("Вы выиграли игрушку: %s, больше таких не осталось.\n", item.getName());
                        toyList.remove(item);
                        break;
                    }
                }
            }
        }else{
            System.out.println("Игрушки кончились!");
        }
        return toyList;
    }

    public List<Toy> creatToys(){
        List<Toy> toys = new ArrayList<>();
        toys.add(0, new Toy(1, "Самокат", 3, 20));
        toys.add(1, new Toy(2, "Мишка плюшевый", 3, 25));
        toys.add(2, new Toy(3, "Водяной пистолет", 3, 30));
        toys.add(3, new Toy(4, "Кукла Маша", 3, 45));
        toys.add(4, new Toy(5, "Тамагочи", 3, 10));
        return toys;
    }
}