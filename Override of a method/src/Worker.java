public class Worker extends Person
{

    Worker(int age,String gender,String name)
    {
        super(name,age,gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void test()
    {
        System.out.println("测试方法（工人子类）");
    }
}


