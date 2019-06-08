/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月8日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ai8s.cp.bean.CPResult;
import com.ai8s.cp.bean.CPSearchBean;
import com.ai8s.cp.bean.CPViewBean;
import com.ai8s.cp.service.IService;
import com.ai8s.cp.util.ResultUtil;

/**
 * @author Aaron
 *
 */
@Service
public class SSCAicaiServcie implements IService {

	@Override
	public CPResult<List<CPViewBean>> search(CPSearchBean searchBean) {
		List<CPViewBean> cpList = new ArrayList<>();
		cpList.add(new CPViewBean("qh", "123"));
		return ResultUtil.success(cpList);
	}

}
