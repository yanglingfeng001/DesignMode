package strategy;

public class ZhaoYun {
    public static void main(String[] args) {
        new Context(new WhiteDoor()).operate();
        new Context(new BackDoor()).operate();
    }
}
