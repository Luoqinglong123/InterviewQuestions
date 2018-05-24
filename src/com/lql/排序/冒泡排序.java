package com.lql.排序;

/*
 * 冒泡排序
 */
public class 冒泡排序 {

    public static int[]  bubble(int[] data){
        for (int i = 0; i <data.length ; i++) {
            for (int j = 0; j <data.length-1-i ; j++) {
                if(data[j]>data[j+1]){
                   /* int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;*/
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;

                }
            }
            for (int a:data
                    ) {
                System.out.println(a);
            }
            System.out.println("*---------"+i+"-------------*");
        }
        System.out.println("*----------------------*");
        return data;
    }

    public static void main(String[] args) {

        int[] aa = {3,2,41,52,21,1,2,45,1};
        for (int a:bubble(aa)
             ) {
            System.out.println(a);
        }
    }
}