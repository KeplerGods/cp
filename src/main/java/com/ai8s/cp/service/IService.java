/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月8日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.service;

import java.util.List;

import com.ai8s.cp.bean.CPResult;
import com.ai8s.cp.bean.CPSearchBean;
import com.ai8s.cp.bean.CPViewBean;

/**
 * @author Aaron
 *
 */
public interface IService {
	CPResult<List<CPViewBean>> search(CPSearchBean searchBean);
}
