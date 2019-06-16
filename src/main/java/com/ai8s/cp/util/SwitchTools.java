/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月13日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.util;

/**
 * @author Aaron
 *
 */
public enum SwitchTools {
	SSC_AICAI;

	private volatile boolean on;

	SwitchTools() {
		on = true;
	}

	public synchronized void onOrOff() {
		this.on = !this.on;
	}

	public boolean isOn() {
		return this.on;
	}
}
