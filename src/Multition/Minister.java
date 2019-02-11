package Multition;

public class Minister {
    public static void main(String[] args) {
        int ministernum=10;
        for (int i = 0; i < ministernum; i++) {
            System.out.print("第"+i+"个大臣参拜的是第");
            Emperor emperor=Emperor.getInstance();
            emperor.emperorInofo();
        }
    }
}
