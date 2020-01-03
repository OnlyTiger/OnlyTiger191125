/**
 * com.zhanghu.admin.contorller
 * SynchronizedDifferentMethod7.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午3:33:02 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 同时访问同一个类的不同的普通同步方法
 * 和SynchronizedYesAndNo6_2的方式的原理是一样的
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午3:33:02 
 * @version 1.0.0 
 */
public class SynchronizedDifferentMethod7 implements Runnable {
	static SynchronizedDifferentMethod7 instance = new SynchronizedDifferentMethod7();

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread-0")) {
			method1();
		} else {
			method2();
		}

	}

	private synchronized void method1() {
		System.out.println("我是加锁的方法1，我叫" + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "，运行结束");
	}

	private synchronized void method2() {
		System.out.println("我是加锁的方法2，我叫" + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "，运行结束");
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
