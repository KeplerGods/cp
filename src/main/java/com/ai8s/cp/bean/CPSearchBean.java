/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月8日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.bean;

import java.util.Date;

import lombok.Data;

/**
 * @author Aaron
 *
 */
@Data
public class CPSearchBean {
	private int pageSize;
	private int pageNum;
	private Date startTime;
	private Date endTime;
}
