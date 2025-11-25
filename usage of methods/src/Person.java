public class Person
{
    int age;
    String name;
    String gender;

    //方法的创建在类的内部
    void self_introduction()
    {
        System.out.println("我叫"+name+"，今年"+age+"岁了");
        return;
        //System.out.println("对于无返回值函数，return表退出");
        //编译会报错不可达
    }

    //形参和实参
    int sum(int a,int b)
    {
        int c = a + b;
        System.out.println(c + "（函数调用）");
        return c;
        //return后的语句不可达
    }

    int swap(int a , int b)
    {
        int temp;
        temp = a;
        a = b;
        System.out.println("a = "+a+",b = "+b+"（函数内变量）");
        return 0;
    }

    void rename(Person person)
    {
        System.out.println("（改名前）"+person.name);
        person.name = "（改名后）小红";
        System.out.println(person.name);
    }

    void setName(String name)
    {
        //name = name;出现重名时，优先使用作用域最接近的，这里实际上是将方法参数的局部变量name赋值为本身
        this.name = name;
    }


    //函数的重载
    int swap1(int a, int b)
    {
        return a + b;
    }
    double swap1(double a, double b)
    {
        return a + b;
    }


}

