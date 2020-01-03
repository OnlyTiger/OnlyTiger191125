/**
 * com.zhanghu.admin.contorller
 * DisappearRequest1_3.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午2:56:21 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 *  消失的请求：解决方法二（添加同步代码块-类锁 *.class）
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午2:56:21 
 * @version 1.0.0 
 */
public class DisappearRequest1_3 implements Runnable {
	static DisappearRequest1_3 instance = new DisappearRequest1_3();

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
		synchronized (DisappearRequest1_3.class) {
			// TODO Auto-generated method stub
			for (int j = 0; j < 10000; j++) {
				i++;
			}
		}

	}

}
