public interface QueueBehaviour {
    void takeInQueue(Actor actor);// помещает человека в очередь
    void takeOrders();//принимает заказ
    void giveOrders();//отдает заказ
    void releaseFromQueue();//удаляет из очереди
}
