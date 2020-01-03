/**
 * com.zhanghu.OnlyTiger190218.server.demo.admin.controller
 * TestController.java
 * 创建人:lenovo
 * 时间：2019年7月18日-上午10:26:39 
 * 2019*****公司-版权所有
 */
package com.zhanghu.admin.contorller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhanghu.admin.utils.NumberUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * 转换测试
 * 创建人:OnlyTiger
 * 时间：2019年11月25日-下午5:17:06 
 * @version 1.0.0
 */
@Api(tags = "测试")
@RestController("testController")
public class TestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@ApiOperation(value = "测试接口")
	@RequestMapping(value = "/testController", method = RequestMethod.GET)
	public String test() {
		logger.info("request!!");
		return "request!!!";
	}

	public static void main(String[] args) throws ParseException {
		System.out.println("test:" + new Date());
		String toBig = NumberUtil.Test2(232343);
		System.out.println("转换后：" + toBig);

		SimpleDateFormat simpleDateFormat01 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");// 建议使用
		Date parse01 = simpleDateFormat01.parse("2019-12-31 23:59:59");
		System.out.println("parse01:" + parse01);// Tue Dec 31 23:59:59 CST 2019

		SimpleDateFormat simpleDateFormat02 = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");// 不建议使用
		Date parse02 = simpleDateFormat02.parse("2019-12-31 23:59:59");
		System.out.println("parse02:" + parse02);// Sun Dec 30 23:59:59 CST 2018

		SimpleDateFormat simpleDateFormat03 = new SimpleDateFormat("YYYY-MM-DD"); // 这个容易出错相差（回退）一年的时间
		Date parse03 = simpleDateFormat03.parse("2020-1-1");
		System.out.println("parse03:" + parse03);// Sun Dec 29 00:00:00 CST 2019

	}

}
