public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.age = 18;
        p.name = "小明";
        p.gender = "male";
        p.self_introduction();
        int result = p.sum(10,20);
        System.out.println(result);

        int a = 20;
        int b = 30;
        p.swap(a,b);
        System.out.println("a = "+a+",b = "+b+"（函数外变量）");
        //运行发现，a和b本身的值没有发生变化

        p.rename(p);

        p.setName("小强");
        System.out.println(p.name);

        //函数重载
        Person_reload p2 = new Person_reload();
        p2.self_introduction();
        Person_reload p3 = new Person_reload(20,"小黄","女");
        p3.self_introduction();

        Person_reload.info = "静态变量通过类去调用，而不通过对象去调用";
        System.out.println(Person_reload.info);

    }

}
