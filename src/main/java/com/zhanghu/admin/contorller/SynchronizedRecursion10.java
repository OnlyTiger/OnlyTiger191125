/**
 * com.zhanghu.admin.contorller
 * SynchronizedRecursion10.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:43:50 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 可重入粒度测试：递归调用本方法
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:43:50 
 * @version 1.0.0 
 */
public class SynchronizedRecursion10 {
	int a = 0;

	public static void main(String[] args) {
		SynchronizedRecursion10 synchronizedRecursion10 = new SynchronizedRecursion10();
		synchronizedRecursion10.method1();

	}

	private synchronized void method1() {
		System.out.println("这是mtthod1，a=" + a);
		if (a == 0) {
			a++;
			method1();
		}

	}

}
