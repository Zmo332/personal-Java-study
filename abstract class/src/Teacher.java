public class Teacher extends Person implements Study
{
    protected Teacher(String name, int age, String gender) {
        super(name, age,gender, "教师");
    }


    public void test()
    {
        System.out.println("继承抽象类时，必须具体化方法");
    }

    @Override
    public void study()
    {
        System.out.println("I still study.");
    }
}
