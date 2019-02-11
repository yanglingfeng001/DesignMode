package Multition;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
    private static int maxNumOfEmperor=2;
    private static ArrayList emperorInfoList=new ArrayList(maxNumOfEmperor);//皇帝名字列表
    private static ArrayList emperorList=new ArrayList(maxNumOfEmperor);
    private static int countNumOfEmperor=0;//当前被使唤的是第几个皇帝
    static {
        for (int i = 0; i <maxNumOfEmperor ; i++) {
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }
    private Emperor()
    {}
    private Emperor(String info)
    {
        emperorInfoList.add(info);
    }
    public static Emperor getInstance()
    {
        Random r=new Random();
        countNumOfEmperor=r.nextInt(maxNumOfEmperor);
        return (Emperor)emperorList.get(countNumOfEmperor);//得出来的类型是object类型，强转至emperor类型
    }
    public static void emperorInofo()
    {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
