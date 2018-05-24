package com.lql.我的回到;

public class XiaoWang {

    public void phone(CallBack callBack,String question) throws InterruptedException {
        System.out.println("收到小李的问题:"+question);
        System.out.println("小王在思考如何解决....");
        Thread.sleep(2000);
        System.out.println("小王思考完毕");
        String res = "1+1=2";
        callBack.resolve(res);
    }
}
