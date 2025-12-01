public class Student extends Person
{

    Student(int age,String gender,String name)
    {
        super(name,age,gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //子类在重写父类方法时，不能降低父类方法中的可见性,比如此时Person父类中的test方法访问权限为public，那么此时子类重写test时，访问权限必须不低于public
    //可以在子类中提升权限
    public void test()
    {
        System.out.println("测试方法（学生子类）");
    }
}
