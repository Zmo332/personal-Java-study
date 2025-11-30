public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student(20,"linda","female");
//        s.name = "linda";
//        s.age = 20;
//        s.gender = "female";
//        无参构造时定义
        s.self_introduction();//父类的方法可以被子类继承使用

        Person test = new Student(18,"Jim","male");
        //子类对象可以当作父类使用（向上转型）
        test.self_introduction();
        //被当作父类的子类对象仅能访问父类中的方法
        //test.s_self_introduction();不可访问子类中的方法

        Student student = (Student) test;
        //强制类型转换，把Person类的test对象转换为Student类的student对象，即将父类对象转换为子类对象（向下转型）
        //若此处，Student不是Person的子类，则报错

        Worker w = new Worker(30,"nick","female");
        //判断对象的类
        if(s instanceof Person)
        {
            System.out.println("I am from Person class.");
        }
//        if(s instanceof Worker)
//        {
//            System.out.println("I am from Worker class");
//        }为啥报错？？

        w.work();

    }
}
