/**
 * com.zhanghu.admin.contorller
 * SynchronizedToLock.java
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午5:41:45 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * (用一句话描述该类/接口作用)
 * 创建人:OnlyTiger
 * 时间：2020年1月3日-下午5:41:45 
 * @version 1.0.0 
 */
public class SynchronizedToLock13 {
	Lock lock = new ReentrantLock();

	public synchronized void method1() {
		System.out.println("我是synchronized形式的锁");
	}

	public void method2() {
		lock.lock();
		try {
			System.out.println("我是lock形式的锁");
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		SynchronizedToLock13 s13 = new SynchronizedToLock13();
		s13.method1();
		s13.method2();
	}

}
