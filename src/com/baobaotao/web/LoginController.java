package com.baobaotao.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.baobaotao.domain.TUser;
import com.baobaotao.service.UserService;
import com.baobaotao.test.Tree;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index.html")
	public String loginPage(){
		return "login";
	}
	@RequestMapping("/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request,TUser loginuser ){
		//ApplicationContext context=(ApplicationContext)request.getSession().getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		//Tree tree=context.getBean("tree", Tree.class);
		
		boolean match=userService.hasMatcher(loginuser.getUserName(), loginuser.getPassword());
		if(!match){
			return new ModelAndView("login", "error", "用户名或者密码错误");
		}else{
			TUser user=userService.getUserByName(loginuser.getUserName());
			request.setAttribute("user", user);
			return new ModelAndView("main");
		}
	}
}
