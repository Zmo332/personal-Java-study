public class Person_reload
{
    int age;
    String name;
    String gender;
    static String info;

    //无参构造函数
    Person_reload()
    {
        System.out.println(age);
        age = 18;
        name = "小绿";
        gender = "female";
        System.out.println("函数重载");
        System.out.println("无参构造函数");
    }

    //有参构造函数
    Person_reload(int age,String name,String gender)
    {
        System.out.println(age);
        this.age = age;
        this.name = name;
        this.gender = gender;
        System.out.println("函数重载");
        System.out.println("有参构造函数");
    }

    void self_introduction()
    {
        System.out.println("我叫"+name+"，今年"+age+"岁了");
    }


}


