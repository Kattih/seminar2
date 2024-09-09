import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);//добавляет посетителя в магазин
    void releaseFromMarket(List<Actor> actors);//выходят из магазина (список покупателей)
    void update();//обновление магазина
}
