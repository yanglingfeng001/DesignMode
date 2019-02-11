package socket;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server=new ServerSocket(65000);
        while(true)
        {
            Socket s=server.accept();
            System.out.println("已经连接");
            new LengthCaculator(s).start();
        }
    }
}
