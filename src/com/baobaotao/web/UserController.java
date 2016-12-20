package com.baobaotao.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.baobaotao.domain.TUser;
import com.baobaotao.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register.do")
	public String register(){
		return "register/register";
	}
	
	@RequestMapping(value="/user.do")
	public ModelAndView createUser(@ModelAttribute("user") TUser user){
		userService.createUser(user);
		ModelAndView view=new ModelAndView("user/createSuccess");
		return view;
		//return "user/createSuccess";
	}
	
	@RequestMapping("/{userId}/info.do")
	@ResponseBody
	public String pathTest(HttpServletRequest request,  @PathVariable String userId,@CookieValue("sessionId") String sessionId){
		String userName=WebUtils.findParameterValue(request, "userName");
		RestTemplate tmplate=new RestTemplate();
		return userId;
	}
}
