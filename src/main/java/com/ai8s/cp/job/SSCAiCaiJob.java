/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月13日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.job;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ai8s.cp.analysis.IAnalysis;
import com.ai8s.cp.analysis.impl.SSCAicaiAnalysisImpl;

/**
 * <li>第一段00:30至03:10，共9期；第二段为07:30至23:50，共50期；20分钟一期，共59期
 * 
 * @author Aaron
 *
 */
@Component
public class SSCAiCaiJob {

	@Resource(type = SSCAicaiAnalysisImpl.class)
	private IAnalysis analysis;

	@Scheduled(cron = "0/2 0/10 7-23 * * ?")
	public void task() {
		process();
	}

	@Scheduled(cron = "0/2 0/10 0-3 * * ?")
	public void task2() {
		process();
	}

	private void process() {
		try {
			analysis.analysis();
		} catch (Exception e) {
		}
	}
}
