package Proxy;

public class Ximenqing {
    public static void main(String[] args) {
        Wangpo w=new Wangpo();
        w.action_one();
        w.action_two();
        w=new Wangpo(new OtherWoman());
        w.action_one();
        w.action_two();
    }
}
