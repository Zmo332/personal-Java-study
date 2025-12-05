public class Main
{
    public static void main(String[] args)throws CloneNotSupportedException
    {
        Study study = new Teacher("Teacher.Zhang",30,"male");
        if(study instanceof Teacher)
        {
            study.study();
        }

        Student student = new Student("Linda",20,"female");
        Student clone = (Student)student.clone();
        System.out.println(student);
        System.out.println(clone);
        System.out.println(student == clone);

        //(JAVA16)record class
        Order o1 = new Order(1,"brush","10010");

    }
}
