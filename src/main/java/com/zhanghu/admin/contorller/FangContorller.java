/**
 * com.zhanghu.admin.contorller
 * FangContorller.java
 * 创建人:OnlyTiger
 * 时间：2019年11月25日-下午4:23:26 
 * 2019 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anxhit.fw.core.result.ResultDTO;
import com.zhanghu.admin.service.FangService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * （武汉）房天下数据查询：https://wuhan.fang.com/
 * 创建人:OnlyTiger
 * 时间：2019年11月25日-下午4:23:26 
 * @version 1.0.0 
 */
@Api(tags = "（武汉）房天下数据查询")
@RestController("fang")
public class FangContorller {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	FangService fangService;

	@ApiOperation("查房价")
	@RequestMapping(value = "/fangjia", method = RequestMethod.GET)
	public ResultDTO<?> fangjia(
			@ApiParam(value = "楼盘名称或地址") @RequestParam(name = "keyword", required = false) String keyword) {
		logger.info("查房价接口参数：=>{}", keyword);
//		this.service.newhouse(keyword);
		return fangService.newhouse(keyword);

	}

	@ApiOperation("买新房")
	@RequestMapping(value = "/newhouse", method = RequestMethod.GET)
	public ResultDTO<?> newhouse(
			@ApiParam(value = "楼盘名称或地名") @RequestParam(name = "keyword", required = false) String keyword) {
		logger.info("买新房接口参数：=>{}", keyword);
//		this.service.newhouse(keyword);
		return fangService.newhouse(keyword);

	}

	@ApiOperation("买二手房")
	@RequestMapping(value = "/esf", method = RequestMethod.GET)
	public ResultDTO<?> esf(String keyword) {
		logger.info("买二手房接口参数：=>{}", keyword);

		return null;

	}

	@ApiOperation("找租房")
	@RequestMapping(value = "/zu", method = RequestMethod.GET)
	public ResultDTO<?> zu(String keyword) {
		logger.info("找租房接口参数：=>{}", keyword);

		return null;

	}

	@ApiOperation("装修家居")
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ResultDTO<?> home(String keyword) {
		logger.info("装修家居接口参数：=>{}", keyword);

		return null;

	}

	@ApiOperation("房产快讯")
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public ResultDTO<?> news(String keyword) {
		logger.info("房产快讯接口参数：=>{}", keyword);

		return null;

	}

	@ApiOperation("海外房产")
	@RequestMapping(value = "/world", method = RequestMethod.GET)
	public ResultDTO<?> world(String keyword) {
		logger.info("海外房产接口参数：=>{}", keyword);

		return null;

	}

}
