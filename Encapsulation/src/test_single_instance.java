public class test_single_instance
{
    //单例模式
    int info;

    private test_single_instance(){}

    private static test_single_instance instance;

    public static test_single_instance generate_instance()
    {
        if(instance == null)
            return new test_single_instance();
        return instance;
    }
}
