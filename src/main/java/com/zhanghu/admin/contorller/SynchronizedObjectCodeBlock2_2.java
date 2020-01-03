/**
 * com.zhanghu.admin.contorller
 * SynchronizedObjectCodeBlock2.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午10:21:07 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 对象示例锁1，代码块形式(this或者创建一个对象：lock1)
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午10:21:07 
 * @version 1.0.0 
 */
public class SynchronizedObjectCodeBlock2_2 implements Runnable {
	static SynchronizedObjectCodeBlock2_2 instance = new SynchronizedObjectCodeBlock2_2();
	Object lock1 = new Object();
	Object lock2 = new Object();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (lock1) {
			System.out.println("我是lock1。我叫" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ",lock1运行结束。");

		}

		synchronized (lock1) {
			System.out.println("我是lock2。我叫" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ",lock2运行结束。");

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
