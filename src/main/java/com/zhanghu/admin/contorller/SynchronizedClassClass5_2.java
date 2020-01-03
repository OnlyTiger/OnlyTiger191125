/**
 * com.zhanghu.admin.contorller
 * SynchronizedClassClass5_2.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午12:02:07 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 类锁的第二种形式，synchronized(*.class)形式：SynchronizedClassClass5_1.class
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午12:02:07 
 * @version 1.0.0 
 */
public class SynchronizedClassClass5_2 implements Runnable {
	static SynchronizedClassClass5_2 instance1 = new SynchronizedClassClass5_2();
	static SynchronizedClassClass5_2 instance2 = new SynchronizedClassClass5_2();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		method();

	}

	private void method() {
		synchronized (SynchronizedClassClass5_2.class) {
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
