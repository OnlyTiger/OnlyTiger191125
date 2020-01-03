/**
 * com.zhanghu.admin.contorller
 * SynchronizedObjectCodeBlock1.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午11:16:22 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 对象示例锁1，代码块形式(this或者创建一个对象：this)
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-上午11:16:22 
 * @version 1.0.0 
 */
public class SynchronizedObjectCodeBlock2_1 implements Runnable {
	static SynchronizedObjectCodeBlock2_2 instance = new SynchronizedObjectCodeBlock2_2();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			System.out.println("我是对象所的代码形式。我叫" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "， 运行结束。");

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
