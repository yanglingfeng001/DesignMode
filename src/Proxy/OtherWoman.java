package Proxy;

public class OtherWoman implements Woman{
    @Override
    public void action_one() {
        System.out.println("other1");
    }

    @Override
    public void action_two() {
        System.out.println("other2");
    }
}
