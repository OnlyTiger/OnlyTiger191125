/**
 * com.zhanghu.admin.contorller
 * MyTest.java
 * 创建人:OnlyTiger
 * 时间：2019年12月6日-下午4:18:17 
 * 2019 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhanghu.admin.service.FangService;

/**
 * 我的测试类
 * 创建人:OnlyTiger
 * 时间：2019年12月6日-下午4:18:17 
 * @version 1.0.0 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

	@Autowired
	FangService fangService;

	@Test
	public void test() {
		System.out.println("测试！");

//		String keyword = "qwe";
//		fangService.newhouse(keyword);

	}

}
