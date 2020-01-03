/**
 * com.zhanghu.admin.contorller
 * SynchronizedClassStatic4.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午11:43:57 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 类锁的第一种形式，Static形式【方法上的】
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午11:43:57 
 * @version 1.0.0 
 */
public class SynchronizedClassStatic4 implements Runnable {
	static SynchronizedClassStatic4 instance1 = new SynchronizedClassStatic4();
	static SynchronizedClassStatic4 instance2 = new SynchronizedClassStatic4();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		method();

	}

	public static synchronized void method() {
		System.out.println("我是类锁的第一种形式：static形式，我叫" + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "，运行结束");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(instance1);
		Thread t2 = new Thread(instance2);
		t1.start();
		t2.start();
		while (t1.isAlive() || t1.isAlive()) {

		}
		System.out.println("finished");
	}

}
