public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person("啥子",20,"男");
        System.out.println(p.getAge());
        p.setName("大啥子");
        p.setName("小啥子");
        System.out.println(p.getName());

    }
}
