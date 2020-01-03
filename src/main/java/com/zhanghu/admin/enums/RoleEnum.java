/**
 * com.zhanghu.admin.enums
 * RoleEnum.java
 * 创建人:OnlyTiger
 * 时间：2020年1月2日-上午11:41:37 
 * 2020 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin.enums;

import com.zhanghu.admin.API.RoleOperation;

/**
 * (用一句话描述该类/接口作用)
 * 创建人:OnlyTiger
 * 时间：2020年1月2日-上午11:41:37 
 * @version 1.0.0 
 */
public enum RoleEnum implements RoleOperation {

	// 系统管理员（有A操作权限）
	ROLE_ROOT_ADMIN {
		@Override
		public String op() {
			// TODO Auto-generated method stub
			return "我的角色是系统管理员";
		}
	},
	// 订单管理员（有B操作权限）
	ROLE_ORDER_ADMIN {
		@Override
		public String op() {
			// TODO Auto-generated method stub
			return "我的角色是订单管理员";
		}
	},
	// 普通用户（有C操作权限）
	ROLE_NORMAL {
		@Override
		public String op() {
			// TODO Auto-generated method stub
			return "我的角色是普通用户";
		}
	};

}
