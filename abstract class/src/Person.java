public abstract class Person
{
    protected String name;   //大体内容其实普通类差不多
    protected int age;
    protected String gender;
    protected String profession;

    protected Person(String name, int age, String gender, String profession)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }


    //抽象方法无需代码块实现功能，访问权限不能为private
    protected abstract void test();
    public void test01()
    {
        System.out.println("抽象类中也可以有具体的方法");
    }
}
