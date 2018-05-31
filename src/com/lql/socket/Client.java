package com.lql.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 8888);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        String sendStr="client send 1 eof";
        outputStream.write(sendStr.getBytes());
        StringBuilder builder = new StringBuilder();
        int len = 0 ;
        byte[] res = new byte[1024];
        while ((len=inputStream.read(res))!=-1){
            String temp = new String(res,0,len);
            builder.append(temp);
            if(temp.indexOf("res")!=-1){
                break;
            }
        }
        System.out.println("client receive start =====");
        System.out.println(builder.toString());
        System.out.println("client receive end =====");
    }
}
