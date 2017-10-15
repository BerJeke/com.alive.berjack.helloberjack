/**
 * Project Name:HelloBerJack
 * File Name:HelloMVCConfig.java
 * Package Name:com.alive.helloberjack.config
 * Date:2017年10月14日下午8:22:37
 * Copyright (c) 2017, kapianzhe@163.com All Rights Reserved.
 *
 */
package com.alive.helloberjack.config;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

/**
 * ClassName: HelloMVCConfig <br/>
 * Function: TODO <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年10月14日 下午8:22:37 <br/>
 *
 * @author Administrator
 * @version
 * @since
 */
@Configuration
@ComponentScan(basePackages = "com.alive.helloberjack.control")
@EnableWebMvc
public class HelloMVCConfig implements WebMvcConfigurer
{
	@Bean
	public ViewResolver viewResolver(ITemplateEngine templateEngine)
	{
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setTemplateEngine(templateEngine);
		return resolver;
	}

	@Bean
	public ITemplateEngine templateEngine(ITemplateResolver templateResolver)
	{
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver);
		return templateEngine;
	}

	@Bean
	public ITemplateResolver templateResolver(ServletContext servletContext)
	{
		ServletContextTemplateResolver resolver = new ServletContextTemplateResolver(servletContext);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".html");
		resolver.setTemplateMode("HTML5");
		return resolver;
	}

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
	{
		configurer.enable();
	}
}
