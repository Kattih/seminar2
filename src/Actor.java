public abstract class Actor implements ActorBehavoir{
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected final String name;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}
