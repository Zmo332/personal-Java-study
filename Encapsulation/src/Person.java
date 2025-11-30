public class Person
{
    private String name;    //现在类的属性只能被自己直接访问
    private int age;
    private String gender;

    public Person(String name,int age,String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName()
    {
        return name;    //想要知道这个对象的名字，必须通过getName()方法来获取，并且得到的只是名字值，外部无法修改
    }

    public String getGender()
    {
        return gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        if (name.contains("小"))
            return;
        this.name = name;
    }
}