/**
 * com.zhanghu.admin.utils
 * UrlUtils.java
 * 创建人:OnlyTiger
 * 时间：2019年11月25日-下午5:46:12 
 * 2019 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * (用一句话描述该类/接口作用)
 * 创建人:OnlyTiger
 * 时间：2019年11月25日-下午5:46:12 
 * @version 1.0.0 
 */
public class UrlUtils {

	/**
	 * 请求的url链接  返回的是json字符串
	 * @param urlStr
	 * @return
	 */
	public static String getURLContent(String urlStr) {
		// 请求的url
		URL url = null;
		// 请求的输入流
		BufferedReader in = null;
		// 输入流的缓冲
		StringBuffer sb = new StringBuffer();
		try {
			url = new URL(urlStr);
			in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			String str = null;
			// 一行一行进行读入
			while ((str = in.readLine()) != null) {
				sb.append(str);
			}
		} catch (Exception ex) {

		} finally {
			try {
				if (in != null) {
					in.close(); // 关闭流
				}
			} catch (IOException ex) {

			}
		}
		String result = sb.toString();
		return result;
	}

}
