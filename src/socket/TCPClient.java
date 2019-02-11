package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        //客户端
         //1、创建客户端Socket，指定服务器地址和端口
         Socket socket =new Socket("localhost",65000);
         //2、获取输出流，向服务器端发送信息
         OutputStream os = socket.getOutputStream();//字节输出流
         PrintWriter pw =new PrintWriter(os);//将输出流包装成打印流
         String message=new Scanner(System.in).next();
         pw.write(message);
         pw.flush();
         socket.shutdownOutput();
         //3、获取输入流，并读取服务器端的响应信息
         InputStream is = socket.getInputStream();
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
         String info = null;
         while((info=br.readLine())!=null){
              System.out.println(info);
             }

         //4、关闭资源
         br.close();
         is.close();
         pw.close();
         os.close();
         socket.close();
    }
}
