/**
 * Project Name:HelloBerJack
 * File Name:HelloBerJackServletInit.java
 * Package Name:com.alive.helloberjack.config
 * Date:2017年10月14日下午8:20:36
 * Copyright (c) 2017, kapianzhe@163.com All Rights Reserved.
 *
 */
package com.alive.helloberjack.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * ClassName: HelloBerJackServletInit <br/>
 * Function: TODO  <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年10月14日 下午8:20:36 <br/>
 *
 * @author Administrator
 * @version 
 * @since 
 */
public class HelloBerJackServletInit extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class[] {HelloMVCConfig.class};
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[] {"/"};
	}

}
