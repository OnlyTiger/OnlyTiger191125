/**
 * com.zhanghu.admin.contorller
 * SynchronizedSuperClass12.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:55:10 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

/**
 * 可重入粒度测试：调用父类的方法【不是同一个类】
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午4:55:10 
 * @version 1.0.0 
 */
public class SynchronizedSuperClass12 {
	public synchronized void doSomething() {
		System.out.println("我是父类方法");
	}

	public static void main(String[] args) {
		TestClass s = new TestClass();
		s.doSomething();
	}
}

class TestClass extends SynchronizedSuperClass12 {
	public synchronized void doSomething() {
		System.out.println("我是子类方法");
		super.doSomething();
	}

}
