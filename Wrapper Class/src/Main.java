import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main
{
    public static void main(String[] args)
    {
        Integer i = new Integer(20);
        Integer o = 10;
        //== Integer o = Integer.valueOf(10);
        int u = i;
        //== int u = i.intValue(i);

        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println(a == b);
        //包装类创建了两个不同的对象，虽然值相等但指向的地址不同

        Integer c = 10,d = 10;
        System.out.println(c == d);
        //自动装箱的两个对象，若值相等（-128~127)则相同

        //特殊包装类
        BigInteger a0 = BigInteger.valueOf(Long.MAX_VALUE);
        a0 = a0.pow(100);
        System.out.println(a0);

        BigDecimal  a1 = BigDecimal.valueOf(10);
        a1 = a1.divide(BigDecimal.valueOf(3),100, RoundingMode.CEILING);
        System.out.println(a1);

    }
}
