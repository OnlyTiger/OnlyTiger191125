/**
 * com.zhanghu.OnlyTiger190218.server.demo.admin.controller
 * TestController.java
 * 创建人:lenovo
 * 时间：2019年7月18日-上午10:26:39 
 * 2019*****公司-版权所有
 */
package com.zhanghu.admin.contorller;

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

	public static void main(String[] args) {
		System.out.println("test:" + new Date());
		String toBig = NumberUtil.Test2(232343);
		System.out.println("转换后：" + toBig);
	}

}
