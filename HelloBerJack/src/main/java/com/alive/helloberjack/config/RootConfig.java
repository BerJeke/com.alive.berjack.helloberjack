/**
 * Project Name:HelloBerJack
 * File Name:RootConfig.java
 * Package Name:com.alive.helloberjack.config
 * Date:2017年10月14日下午8:22:54
 * Copyright (c) 2017, kapianzhe@163.com All Rights Reserved.
 *
 */
package com.alive.helloberjack.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * ClassName: RootConfig <br/>
 * Function: TODO <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年10月14日 下午8:22:54 <br/>
 *
 * @author Administrator
 * @version
 * @since
 */
@Configuration
@ComponentScan(basePackages = "com.alive.helloberjack", excludeFilters =
{ @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class RootConfig
{
}
