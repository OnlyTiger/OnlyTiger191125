/**
 * com.zhanghu.admin.service
 * FangService.java
 * 创建人:OnlyTiger
 * 时间：2019年11月25日-下午5:51:24 
 * 2019 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anxhit.fw.core.result.ResultDTO;
import com.zhanghu.admin.utils.UrlUtils;

/**
 * (用一句话描述该类/接口作用)
 * 创建人:OnlyTiger
 * 时间：2019年11月25日-下午5:51:24 
 * @version 1.0.0 
 */
@Service
@Transactional
public class FangService {

	/**
	 * 买新房
	 * 方法名：newhouse
	 * 创建人：OnlyTiger 
	 * 时间：2019年11月25日-下午6:00:22 
	 * @param keyword 
	 * @return ResultDTO<?>
	 * @exception 
	 * @since  1.0.0
	 */
	public ResultDTO<?> newhouse(String keyword) {

		ResultDTO<Object> resultDTO = new ResultDTO<>();
//		String url = "//wuhan.newhouse.fang.com/house/s/";
		String url = "https://wuhan.newhouse.fang.com/house/s/";
		String urlContent = UrlUtils.getURLContent(url);
		System.out.println("urlContent:" + urlContent);

		Document doc;
		try {
			doc = Jsoup.connect("http://www.baidu.com/").get();
			String title = doc.title();
			Attributes attributes = doc.attributes();
			System.out.println("title:" + title);
			System.out.println("attributes:" + attributes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		resultDTO.setCode(0);
		resultDTO.setData(urlContent);
		resultDTO.setMsg("返回结果");

		return resultDTO;

	}

}
