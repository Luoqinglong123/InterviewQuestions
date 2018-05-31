package com.lql.threadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {

	int i = 0 ;
	public static void main(String[] args) throws Exception{
		Test1 test1 = new Test1();
		T1 t1 = test1.new T1();
		T2 t2 = test1.new T2();
		ExecutorService pool = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 2; i++) {
			pool.execute(t1);
			pool.execute(t2);
		}
		pool.shutdown();
		
	}
	
	class T1 implements Runnable{

		@Override
		public  void run() {
			inc();
		}

		public  synchronized void inc() {
				i++;
				System.out.println("i增加了"+Thread.currentThread()
						.getName());
		}
		
	}
	
	class T2 implements Runnable{

		@Override
		public  void run() {
			dec();
		}

		public synchronized void dec() {
				i--;
				System.out.println("i减少了"+Thread.currentThread()
						.getName());
		}
		
	}
}
