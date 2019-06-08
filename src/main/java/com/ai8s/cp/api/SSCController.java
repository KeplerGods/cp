/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月8日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp.api;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ai8s.cp.bean.CPResult;
import com.ai8s.cp.bean.CPSearchBean;
import com.ai8s.cp.bean.CPViewBean;
import com.ai8s.cp.service.IService;
import com.ai8s.cp.service.impl.SSCAicaiServcie;
import com.ai8s.cp.util.SpringUtil;

/**
 * 时时彩API
 * 
 * @author Aaron
 *
 */
@RestController
@RequestMapping("/ssc")
public class SSCController {
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public CPResult<List<CPViewBean>> list(@ModelAttribute CPSearchBean searchBean) {
		IService ssc = SpringUtil.getBean(SSCAicaiServcie.class);
		return ssc.search(searchBean);
	}
}
