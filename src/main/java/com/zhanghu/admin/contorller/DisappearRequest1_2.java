/**
 * com.zhanghu.admin.contorller
 * DisappearRequest1_2.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午2:56:07 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 *  消失的请求：解决方法二（添加同步代码块-this）
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午2:56:07 
 * @version 1.0.0 
 */
public class DisappearRequest1_2 implements Runnable {
	static DisappearRequest1_2 instance = new DisappearRequest1_2();

	static int i = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(instance);
		Thread t2 = new Thread(instance);
		t1.start();
		t2.start();
		t1.join();// 能够使得线程之间的并行执行变成串行执行。
		t2.join();
		System.out.println("并发的次数和：" + i);// 20000

	}

	@Override
	public void run() {
		synchronized (this) {
			// TODO Auto-generated method stub
			for (int j = 0; j < 10000; j++) {
				i++;
			}
		}

	}

}
