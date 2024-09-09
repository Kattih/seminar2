import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Actor> queue = new ArrayList<>();
        Market market = new Market(queue);

        Human human1 = new Human("Иванов");
        Human human2 = new Human("Петров");
        Human human3 = new Human("Сидоров");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);

        market.update();
        System.out.println("На данный момент в очереди " + queue.size() + " человек");




    }
}