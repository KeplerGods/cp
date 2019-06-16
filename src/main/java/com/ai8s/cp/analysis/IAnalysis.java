/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月3日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.analysis;

import java.util.List;

import com.ai8s.cp.bean.CPResult;
import com.ai8s.cp.bean.CPViewBean;

/**
 * @author Aaron
 *
 */
public interface IAnalysis {

	/**
	 * 解析当前结果并返回
	 * 
	 * @描述
	 * @param
	 * @return CPResult<List<CPViewBean>>
	 * @exception @author
	 *                李金泽
	 * @Time 2019年6月16日 上午10:01:38
	 *
	 */
	CPResult<List<CPViewBean>> analysis();

	/**
	 * 解析已当天时间为基准进行计算的天数数据
	 * 
	 * @描述
	 * @param startDay
	 *            以当前时间向前推的天数
	 * @param endDay
	 *            以 startDay 为起始的结束天数
	 * @return CPResult<List<CPViewBean>>
	 * @exception @author
	 *                李金泽
	 * @Time 2019年6月16日 上午10:01:51
	 *
	 */
	CPResult<List<CPViewBean>> analysis(int startDay, int endDay);
}
