public abstract class son extends Person
{
    //抽象类的子类也可以是抽象类
    protected son(String name, int age, String gender, String profession)
    {
        super(name,age,gender,profession);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }
    public void test()
    {
        System.out.println("抽象子类继承抽象方法");
    }
}
