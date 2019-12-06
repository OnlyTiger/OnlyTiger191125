/**
 * com.zhanghu.admin
 * App.java
 * 创建人:OnlyTiger
 * 时间：2019年11月25日-下午4:03:44 
 * 2019 湖北省楚天云有限公司-版权所有
 */
package com.zhanghu.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * 启动类
 * 创建人:OnlyTiger
 * 时间：2019年11月25日-下午4:03:44 
 * @version 1.0.0 
 */
@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
@ComponentScan({ "com.zhanghu.admin.service", "com.zhanghu.admin.contorller" })
@MapperScan("com.zhanghu.admin.dao")
@EnableSwagger2Doc
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}