public class Person
{
    int age;
    String name;
    String gender;


    Person(String name,int age,String gender)
    {
        this.age = age;
        this.name = name;
        this.gender = gender;

    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(obj instanceof Person)
        {
            Person person = (Person)obj;
            return this.name.equals(person.name) && this.age == person.age && this.gender.equals(this.gender);

        }
        return false;
        }

    public String toString()
    {    //使用IDEA可以快速生成
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + gender + '\'' + '}';
    }

    public void test()
    {
        System.out.println("测试方法（父类）");
    }

    public final void test01()
    {
        System.out.println("不希望被重写的子类前面加上final");
    }
}



