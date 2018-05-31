package com.lql.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        while(true){
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            int len = 0 ;
            byte[] temp = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while((len=inputStream.read(temp))!=-1){
                String res = new String(temp,0,len);
                sb.append(res);
                if(res.indexOf("eof")!=-1){
                    break;
                }
            }
            System.out.println("received data ------ start =====");
            System.out.println(sb.toString());
            System.out.println("received data ------   end ======");
            String res = sb.toString()+"res";
            outputStream.write(res.getBytes());
        }}
}