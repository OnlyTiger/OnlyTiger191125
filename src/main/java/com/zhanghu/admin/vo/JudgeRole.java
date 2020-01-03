/**
 * com.zhanghu.admin.vo
 * JudgeRole.java
 * 创建人:OnlyTiger
 * 时间：2020年1月2日-上午11:47:24 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.vo;

import com.zhanghu.admin.enums.RoleEnum;

/**
 * 角色
 * 创建人:OnlyTiger
 * 时间：2020年1月2日-上午11:47:24 
 * @version 1.0.0 
 */
public class JudgeRole {

	public String judge(String roleName) {
		// 一行代码搞定！之前的if/else没了！
		return RoleEnum.valueOf(roleName).op();

	}

}
