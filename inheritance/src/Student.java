public class Student extends Person
{
    public void s_self_introduction()
    {
        System.out.println(name);
    }

    public Student(int age, String name,String gender)
    {
        super(age,name,gender,"student");
    }
}
