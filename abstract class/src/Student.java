public class Student extends Person implements Study,Cloneable
{
    //接口不同于继承，implement后面可以跟多个接口名称

    public Student(String name,int age,String gender)
    {
        super(name,age,gender,"student");
        this.gender = gender;
        this.age = age;
        this.name = name;

    }

    private Status status;

    public Status getStatus()
    {
        return status;
    }

    public void test()
    {
        System.out.println("继承抽象类时，必须具体化方法");
    }

    public void study()
    {
        System.out.println("I will study.");
    }

    public Object clone() throws CloneNotSupportedException
    {   //提升clone方法的访问权限
        return super.clone();   //因为底层是C++实现，我们直接调用父类的实现就可以了
    }

    @Override
    public String toString()
    {
        return "name:"+name+"age:"+age+"gender:"+gender+"profession:"+profession;
    }
}
