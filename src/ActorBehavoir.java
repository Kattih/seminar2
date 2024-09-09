public interface ActorBehavoir {
    void setMakeOrder(boolean makeOrder); //метод для создания заказа
    // (в скобках создан заказ или нет)
    void setTakeOrder(boolean takeOrder); // метод будет указывать, забрал ли посетитель заказ
    boolean isMakeOrder();// метод для проверки, создан ли заказ
    boolean isTakeOrder();// метод для проверки, забрали ли заказ
}
