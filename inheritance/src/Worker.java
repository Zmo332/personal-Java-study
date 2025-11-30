public final class Worker extends Person
{
    //类的继承可以不断向下，但是同时只能继承一个类，同时，标记为final的类不允许被继承
    String name;

    public Worker(int age,String name,String gender)
    {
        super(age,name,gender,"worker");
        //父类构造调用必须在子类构造的最前面，父类构造调用前的任何代码都不予执行
    }

    public void work()
    {
        System.out.println(name+"子类名称");
        System.out.println(super.name+"父类名称");
    }
}
