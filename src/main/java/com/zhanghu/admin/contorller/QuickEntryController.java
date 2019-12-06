/**
 * com.zhanghu.admin.contorller
 * QuickEntryController.java
 * 创建人:OnlyTiger
 * 时间：2019年12月3日-上午10:43:26 
 * 2019 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.contorller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anxhit.fw.core.result.ResultDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 快速入口：https://wuhan.newhouse.fang.com/house/s/a9%BA%E3%B4%F3%B3%C7%D4%C3%BA%FE%B9%AB%B9%DD%2052-94m%3F%B5%D8%B1%EA%D6%AE%D7%F7/
 * 创建人:OnlyTiger
 * 时间：2019年12月3日-上午10:43:26 
 * @version 1.0.0 
 */
@Api(tags = "快速入口")
@RestController("quickEntry")
public class QuickEntryController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@ApiOperation("本月开盘")
	@RequestMapping(value = "/saledate", method = RequestMethod.GET)
	public ResultDTO<?> saledate(
			@ApiParam(value = "区域") @RequestParam(name = "district", required = false) String district) {
		logger.info("本月开盘接口参数：=>{}", district);
//		return hotsearchService.newhouse(district); 
		return null;

	}

	@ApiOperation("本月入住")
	@RequestMapping(value = "/livindate", method = RequestMethod.GET)
	public ResultDTO<?> livindate(
			@ApiParam(value = "区域") @RequestParam(name = "district", required = false) String district) {
		logger.info("本月入住接口参数：=>{}", district);
//		return hotsearchService.newhouse(district); livindate
		return null;

	}

	@ApiOperation("新开楼盘")
	@RequestMapping(value = "/buynewhouse", method = RequestMethod.GET)
	public ResultDTO<?> buynewhouse(
			@ApiParam(value = "区域") @RequestParam(name = "district", required = false) String district) {
		logger.info("新开楼盘接口参数：=>{}", district);
//		return hotsearchService.newhouse(district);
		return null;

	}

}
