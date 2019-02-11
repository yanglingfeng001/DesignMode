package socket;

import java.io.*;
import java.net.Socket;

public class LengthCaculator extends Thread{
    private Socket socket;
    public LengthCaculator(Socket s)
    {
        this.socket=s;

    }    @Override
    public void run() {
        try{
            //3、获取输入流，并读取客户端信息
             InputStream is = socket.getInputStream();
             InputStreamReader isr =new InputStreamReader(is);
             BufferedReader br =new BufferedReader(isr);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
             String info =null;
             String info2=null;
             while((info=br.readLine())!=null){
                 info2=info;
                 }
             socket.shutdownInput();//关闭输入流
             //4、获取输出流，响应客户端的请求
             pw.write(String.valueOf(info2.length()));
             pw.flush();


             //5、关闭资源
             pw.close();
             os.close();
             br.close();
             isr.close();
             is.close();
             socket.close();
        }
        catch (Exception e)
        {
        e.printStackTrace();
        }
    }
}
