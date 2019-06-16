/**
 *  @描述：
 *  
 *  版本    作者        时间           邮箱                描述
 * =============================================================
 * v1.0   李金泽   2019年6月2日  ljz1318078262@163.com     初版
 * =============================================================
 * */
package com.ai8s.cp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ai8s.cp.util.SpringUtil;

/**
 * @author Aaron
 *
 */
@EnableScheduling
@SpringBootApplication
public class CPApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext application = SpringApplication.run(CPApp.class, args);
		SpringUtil.init(application);
	}
}
