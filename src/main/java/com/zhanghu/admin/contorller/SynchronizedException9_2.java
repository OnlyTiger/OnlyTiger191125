/**
 * com.zhanghu.admin.contorller
 * SynchronizedException9_2.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:14:25 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 方法抛异常后，会释放锁。使用不同的抛异常方法
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:14:25 
 * @version 1.0.0 
 */
public class SynchronizedException9_2 implements Runnable {
	static SynchronizedException9_2 instance = new SynchronizedException9_2();

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
		throw new RuntimeException();
//		System.out.println(Thread.currentThread().getName() + "，运行结束");
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
