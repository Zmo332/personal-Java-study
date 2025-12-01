public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("linda",20,"female");
        Person p2 = new Person("linda",20,"female");

        System.out.println(p1.equals(p2));
        //如果使用Object类自带的equals方法，此处输出false
//        public boolean equals(Object obj)
//        {
//             return (this == obj);
//        }

        System.out.println(p1);

        p1.test();

        Student s = new Student(15,"male","Jim");
        s.test();

        Worker w = new Worker(25,"Ham","female");
        w.test();

    }
}
