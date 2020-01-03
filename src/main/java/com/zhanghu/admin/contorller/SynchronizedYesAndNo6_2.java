/**
 * com.zhanghu.admin.contorller
 * SynchronizedYesAndNo6_2.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午3:26:09 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 同时访问同步方法和非同步方法：两个不同方法里面如果加了类锁 *.class,则会同步。添加this可能一样
 * 和SynchronizedDifferentMethod7的方式的原理是一样的
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午3:26:09 
 * @version 1.0.0 
 */
public class SynchronizedYesAndNo6_2 implements Runnable {
	static SynchronizedYesAndNo6_2 instance = new SynchronizedYesAndNo6_2();

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread-0")) {
			method1();
		} else {
			method2();
		}
	}

	private synchronized void method1() {
		synchronized (SynchronizedYesAndNo6_2.class) {
//			synchronized (this) {
			System.out.println("我是加锁的方法，我叫" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "，运行结束");
		}
	}

	private void method2() {
		synchronized (SynchronizedYesAndNo6_2.class) {
//			synchronized (this) {
			System.out.println("我是没加锁的方法，我叫" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "，运行结束");
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(instance);
		Thread t2 = new Thread(instance);
		t1.start();
		t2.start();
		while (t1.isAlive() || t1.isAlive()) {

		}
		System.out.println("finished");
	}

}
