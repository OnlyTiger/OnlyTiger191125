/**
 * com.zhanghu.admin.contorller
 * SynchronizedObjectmethod3.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午11:18:28 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 对象锁示例2：方法锁形式
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午11:18:28 
 * @version 1.0.0 
 */
public class SynchronizedObjectmethod3 implements Runnable {
	static SynchronizedObjectmethod3 instance = new SynchronizedObjectmethod3();

	public static void main(String[] args) {
		Thread t1 = new Thread(instance);
		Thread t2 = new Thread(instance);
		t1.start();
		t2.start();
		while (t1.isAlive() || t1.isAlive()) {

		}
		System.out.println("finished");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		method();

	}

	public synchronized void method() {
		System.out.println("我的对象锁的方法修饰符形式，我叫" + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "，运行结束");
	}

}
