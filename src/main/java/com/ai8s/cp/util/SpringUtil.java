/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月8日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.util;

import org.springframework.context.ApplicationContext;

/**
 * 该工具只有项目启动后才能使用
 * 
 * @author Aaron
 *
 */
public class SpringUtil {
	private volatile static ApplicationContext context;

	public static void init(ApplicationContext ac) {
		if (context == null) {
			context = ac;
		}
	}

	public static <T> T getBean(Class<T> calzz) {
		if (context == null) {
			return null;
		}
		return context.getBean(calzz);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		if (context == null) {
			return null;
		}

		return (T) context.getBean(name);
	}
}
