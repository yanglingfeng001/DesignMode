package Singleton;

public class Emperor {
    private static final Emperor emperor=new Emperor();//避免多个线程同时使用以出现多个实例
    private Emperor()
    {
    }
    public synchronized static Emperor getInstance()//同上加上锁以使得不会同时有两个或以上线程同时访问以创建实例
    {
            return emperor;
    }
    public static void getInfo()
    {
        System.out.println("this is our emperor");

    }
}
