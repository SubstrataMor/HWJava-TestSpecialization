import java.util.List;

public class PrintToys {
    public static void print(List<Toy> toyList){
        for (Toy item: toyList) {
            System.out.print(String.format("id:%s, ", item.getId()));
            System.out.print(String.format("%s, ", item.getName()));
            System.out.print(String.format("Количество:%sшт, ", item.getQuantity()));
            System.out.println(String.format("Шанс выигрыша:%s%%", item.getDropChance()));
        }
    }

    public static void print(Toy toy){
        System.out.print(String.format("%s. ", toy.getId()));
        System.out.print(String.format("%s, ", toy.getName()));
        System.out.print(String.format("%s, ", toy.getQuantity()));
        System.out.println(String.format("%s ", toy.getDropChance()));
    }


}