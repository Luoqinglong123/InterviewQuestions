package com.lql.我的回到;

public class XiaoLi implements CallBack{

    private  XiaoWang xiaoWang;

    public XiaoLi(XiaoWang xiaoWang) {
        this.xiaoWang = xiaoWang;
    }

    public void askQuestion() throws InterruptedException {
        System.out.println("小李问了小王一个问题...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    xiaoWang.phone(XiaoLi.this,"1+1=?");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        doOtherThing();

    }

    private void doOtherThing() {
        System.out.println("小李去上街了");

    }

    @Override
    public void resolve(String result) {
        System.out.println("得到结果，为："+result);
    }
}
