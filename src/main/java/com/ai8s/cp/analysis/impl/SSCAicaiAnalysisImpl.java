/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月8日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.analysis.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai8s.cp.analysis.IAnalysis;
import com.ai8s.cp.bean.CPResult;
import com.ai8s.cp.bean.CPViewBean;

/**
 * @author Aaron
 *
 */
@Service
public class SSCAicaiAnalysisImpl implements IAnalysis {

	@Override
	public CPResult<List<CPViewBean>> analysis() {
		return analysis(0, 0);
	}

	@Override
	public CPResult<List<CPViewBean>> analysis(int startDay, int endDay) {
		return new CPResult<>();
	}

}
