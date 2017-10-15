/**
 * Project Name:HelloBerJack
 * File Name:HelloBerJackControl.java
 * Package Name:com.alive.helloberjack.control
 * Date:2017年10月14日下午8:44:24
 * Copyright (c) 2017, kapianzhe@163.com All Rights Reserved.
 *
 */
package com.alive.helloberjack.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ClassName: HelloBerJackControl <br/>
 * Function: TODO  <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年10月14日 下午8:44:24 <br/>
 *
 * @author Administrator
 * @version 
 * @since 
 */
@Controller
@RequestMapping("/")
public class HelloBerJackControl
{
	@RequestMapping(method = RequestMethod.GET)
	public String home()
	{
		return "index";
	}
}
