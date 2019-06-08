/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月8日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Aaron
 *
 */
@Setter
@Getter
@ToString
public class CPViewBean {
	private String qh;
	private String kjh;
	private String time;

	public CPViewBean(String qh, String kjh, String time) {
		this.qh = qh;
		this.kjh = kjh;
		this.time = time;
	}

	public CPViewBean(String qh, String kjh) {
		this.qh = qh;
		this.kjh = kjh;
	}
}
