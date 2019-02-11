package strategy;

public class Context {
    private IStrategy s;
    public Context(IStrategy s)
    {
        this.s=s;
    }
    public void operate()
    {
        s.operate();
    }
}
