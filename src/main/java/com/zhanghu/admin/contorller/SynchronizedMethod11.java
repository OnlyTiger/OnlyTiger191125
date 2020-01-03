/**
 * com.zhanghu.admin.contorller
 * SynchronizedRecursion11.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:49:17 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 可重入粒度测试：调用类内另外的方法
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:49:17 
 * @version 1.0.0 
 */
public class SynchronizedMethod11 {

	public static void main(String[] args) {
		SynchronizedMethod11 s11 = new SynchronizedMethod11();
		s11.method1();

	}

	private synchronized void method1() {
		System.out.println("这是mtthod1");
		method2();
	}

	private synchronized void method2() {
		System.out.println("这是mtthod2");
	}

}
