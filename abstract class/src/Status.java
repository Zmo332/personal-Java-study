public enum Status
{
    RUNNING("跑步"),SLEEPING("睡觉"),STUDY("学习");

    public final String name;
    private Status(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
