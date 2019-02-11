package Proxy;

public class Wangpo implements Woman{
    private Woman woman;
    public Wangpo()
    {
        this.woman=new Panjinlian();

    }    public Wangpo(Woman woman)
    {
        this.woman=woman;
    }

    @Override
    public void action_two() {
        woman.action_two();
    }

    @Override
    public void action_one() {
        woman.action_one();
    }
}
