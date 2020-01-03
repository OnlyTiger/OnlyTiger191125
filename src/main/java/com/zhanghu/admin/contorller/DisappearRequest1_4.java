/**
 * com.zhanghu.admin.contorller
 * DisappearRequest1_4.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午2:56:28 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * (用一句话描述该类/接口作用)
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午2:56:28 
 * @version 1.0.0 
 */
public class DisappearRequest1_4 implements Runnable {
	static DisappearRequest1_4 instance = new DisappearRequest1_4();

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
	public void run() { // 不能再非自己写的方法上添加static关键字实现同步
		// TODO Auto-generated method stub
		for (int j = 0; j < 10000; j++) {
			i++;
		}

	}

}
