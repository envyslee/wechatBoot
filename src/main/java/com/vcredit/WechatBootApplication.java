package com.vcredit;

import com.vcredit.framework.filter.DefaultFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WechatBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatBootApplication.class, args);
	}


	@Bean
	public FilterRegistrationBean defaultFilter(){
		FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean(new DefaultFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}
}
