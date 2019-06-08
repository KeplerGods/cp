/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月8日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.util;

import com.ai8s.cp.bean.CPResult;

/**
 * @author Aaron
 *
 */
public class ResultUtil {
	private ResultUtil() {
	}

	public final static <T> CPResult<T> success() {
		return success(0, "OK", null);
	}

	public final static <T> CPResult<T> success(T data) {
		return success(0, "OK", data);
	}

	public final static <T> CPResult<T> success(int code, String msg, T data) {
		CPResult<T> result = new CPResult<>();
		result.setCode(code);
		result.setMsg(msg);
		result.setData(data);
		return result;
	}
}
