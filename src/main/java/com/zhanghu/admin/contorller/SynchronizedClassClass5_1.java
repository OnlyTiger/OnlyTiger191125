/**
 * com.zhanghu.admin.contorller
 * SynchronizedClassClass5.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午11:56:46 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 类锁的第二种形式，synchronized(*.class)形式：this
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午11:56:46 
 * @version 1.0.0 
 */
public class SynchronizedClassClass5_1 implements Runnable {
	static SynchronizedClassClass5_1 instance1 = new SynchronizedClassClass5_1();
	static SynchronizedClassClass5_1 instance2 = new SynchronizedClassClass5_1();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		method();

	}

	private void method() {
		synchronized (this) {
			System.out.println("我是类锁的第二种形式：synchronized(*.class)形式，我叫" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "，运行结束");
		}
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
