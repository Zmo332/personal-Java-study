public class Person
{
    //实际上默认情况下所有的类都是继承自Object的，只是可以省略
    protected int age;
    protected String name;
    protected String gender;
    protected String profession;

    protected Person(int age,String name,String gender,String profession)
    {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.profession = profession;
    }

    public void self_introduction()
    {
        System.out.println(name + age + gender);
    }

}
