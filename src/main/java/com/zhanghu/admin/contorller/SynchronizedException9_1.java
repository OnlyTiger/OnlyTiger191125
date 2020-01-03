/**
 * com.zhanghu.admin.contorller
 * SynchronizedException9.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:03:28 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 方法抛异常后，会释放锁。展示不抛出异常前和抛出异常后的对比；一单抛出异常，第二个线程会立刻进入同步方法，意味着锁已经释放。
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:03:28 
 * @version 1.0.0 
 */
public class SynchronizedException9_1 implements Runnable {
	static SynchronizedException9_1 instance = new SynchronizedException9_1();

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
			throw new Exception();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
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
