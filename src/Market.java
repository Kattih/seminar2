import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private final List<Actor> queue;

    public Market(List<Actor> queue) {
        this.queue = queue;
    }

    @Override
    public void acceptToMarket(Actor actor) {//вывести в консоль, что actor пришел в магазин
        // и добавить его в очередь (использовать метод ниже takeInQueue(Actor actor))

        takeInQueue(actor);
        System.out.println("Посетитель " + actor.getName() + " пришел в магазин");
    }
    @Override
    public void takeInQueue(Actor actor) {//добавлять посетителя в очередь (в список)
        queue.add(actor);
    }
    @Override
    public void takeOrders() {//пройтись по всему списку очереди, проверить с пом метода isMakeOrder тех,
        //у кого заказ еще не был сделан и проставить флаг с помощью сеттера
        for (Actor actor:queue){
            if (!actor.isMakeOrder()) {
            actor.setMakeOrder(true);
            System.out.println("Заказ для " + actor.getName() + " принят в работу");
            }
        }
    }
    @Override
    public void giveOrders() {// пройтись по всему списку очереди, проверить тех, у кого флаг isMakeOrder
        //true, и проставляем им флаг isTakeOrder тоже true
        for (Actor actor:queue){
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println("Заказ отдан для " + actor.getName());
            }
        }
    }

    @Override
    public void releaseFromQueue() {// составить новый список тех actor-ов, которые готовы
        //выходить из магазина - по методу isTakeOrder
        List<Actor> outActor = new ArrayList<>();
        for (Actor actor:queue){
            if (actor.isTakeOrder()) {
                outActor.add(actor);
                System.out.println("Посетитель " + actor.getName() + " вышел из магазина");
            }
        }
        releaseFromMarket(outActor);
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {//удаляем посетителей из магазина, т.е. удаляем из
        //списка, который находится в переменной. Этот метод можно вызывать из предыдущего метода
        queue.removeAll(actors);
    }

    @Override
    public void update() {//содержит 3 метода: takeOrders(), giveOrders(), releaseFromQueue()
        takeOrders();
        giveOrders();
        releaseFromQueue();

    }
}
