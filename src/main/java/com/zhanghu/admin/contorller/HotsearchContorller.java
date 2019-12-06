/**
 * com.zhanghu.admin.contorller
 * hotsearchContorller.java
 * 创建人:OnlyTiger
 * 时间：2019年12月2日-下午4:21:12 
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
import com.zhanghu.admin.service.HotsearchService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 热门楼盘榜：https://newhouse.fang.com/top/?ctm=1.bj.xf_search.hotsearch.1
 * 创建人:OnlyTiger
 * 时间：2019年12月2日-下午4:21:12 
 * @version 1.0.0 
 */
@Api(tags = "热门楼盘榜")
@RestController("hotSearch")
public class HotsearchContorller {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	HotsearchService hotsearchService;

	@ApiOperation("热门榜")
	@RequestMapping(value = "/hot", method = RequestMethod.GET)
	public ResultDTO<?> hot(
			@ApiParam(value = "区域") @RequestParam(name = "district", required = false) String district) {
		logger.info("热门榜接口参数：=>{}", district);
//		return hotsearchService.newhouse(district);
		return null;

	}

	@ApiOperation("热搜榜")
	@RequestMapping(value = "/hotBot", method = RequestMethod.GET)
	public ResultDTO<?> hotBot(
			@ApiParam(value = "区域") @RequestParam(name = "district", required = false) String district) {
		logger.info("热搜榜接口参数：=>{}", district);
//		return hotsearchService.newhouse(district);
		return null;

	}

	@ApiOperation("热评榜")
	@RequestMapping(value = "/hotTopic", method = RequestMethod.GET)
	public ResultDTO<?> hotTopic(
			@ApiParam(value = "区域") @RequestParam(name = "district", required = false) String district) {
		logger.info("热评榜接口参数：=>{}", district);
//		return hotsearchService.newhouse(district);
		return null;

	}

	@ApiOperation("咨询榜")
	@RequestMapping(value = "/consultList", method = RequestMethod.GET)
	public ResultDTO<?> consultList(
			@ApiParam(value = "区域") @RequestParam(name = "district", required = false) String district) {
		logger.info("咨询榜接口参数：=>{}", district);
//		return hotsearchService.newhouse(district);
		return null;

	}

	@ApiOperation("关注榜")
	@RequestMapping(value = "/attentionList", method = RequestMethod.GET)
	public ResultDTO<?> attentionList() {
		logger.info("关注榜无参接口");
//		return hotsearchService.newhouse(district);
		return null;

	}

}
