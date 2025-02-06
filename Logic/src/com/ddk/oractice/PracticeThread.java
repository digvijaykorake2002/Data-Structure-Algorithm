package com.ddk.oractice;

// 1) Threading by Thread Class

class MyThread extends Thread{
	
	public void run() {
		while(0<=100) {
		System.out.println("Good Morning");
	}
	}
}

class MyThread1 extends Thread{
	@Override
	public void run() {
		while(0<=100) {
			System.out.println("Good Night");
		}
		
	}
	
}
public class PracticeThread {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		MyThread1 t2=new MyThread1();
		
		t1.start();
		t2.start();

	}

}



// 2) Threading By Ruunable Interface

//
//class MyThread implements Runnable{
//	
//	public void run() {
//		while(0<=100) {
//		System.out.println("Good Morning");
//	}
//	}
//}
//
//class MyThread1 implements Runnable{
//	@Override
//	public void run() {
//		while(0<=100) {
//			System.out.println("Good Night");
//		}
//		
//	}
//	
//}
//public class PracticeThread {
//
//	public static void main(String[] args) {
//		
//		MyThread t1=new MyThread();
//		Thread bullet1=new Thread(t1);
//		
//		MyThread1 t2=new MyThread1();
//		Thread bullet2=new Thread(t2);
//		
//		bullet1.start();
//		bullet2.start();
//
//	}
//
//}

