public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();//p1类似于一个指向新对象的指针，此处称为引用
        Person p2 = p1;//这里p2复制的是对新对象的引用
        Person p3 = new Person();//p3是对另一个新对象的引用
        System.out.println(p1 == p2);
        //输出true
        System.out.println(p1 == p3);
        //输出false

        Person p = new Person();
        p.name = "小明";
        System.out.println(p.name);

        Person p4 = new Person();//创建一个新对象，不对任何属性赋值
        System.out.println(p4.name+" = name");
        System.out.println(p4.gender+" = gander");
        System.out.println(p4.ages+" = ages");

    }
}
