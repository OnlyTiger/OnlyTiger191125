/**
 * com.zhanghu.admin.contorller
 * DisappearRequest1.java
 * 创建人:OnlyTiger
 * 时间：2020年1月2日-下午4:20:57 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 消失的请求：多线程执行次数变少
 * 创建人:OnlyTiger
 * 时间：2020年1月2日-下午4:20:57 
 * @version 1.0.0 
 */
public class DisappearRequest1_0 implements Runnable {
	static DisappearRequest1_0 instance = new DisappearRequest1_0();

	static int i = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(instance);
		Thread t2 = new Thread(instance);
		t1.start();
		t2.start();
		t1.join();// 能够使得线程之间的并行执行变成串行执行。
		t2.join();
		System.out.println("并发的次数和：" + i);// 14898,14495,12156,10578,10110。可以发现每次结果都不一样，这不是我们想要的。

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 10000; j++) {
			i++;
		}

	}

}
