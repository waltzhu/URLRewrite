package com.waltzhu.demo.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/webss")
public class UrlWriteController {
	
	  
	    
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public void main(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String sessionId = (String) session.getAttribute("sessionId");
		response.sendRedirect(response.encodeRedirectURL("/webss/word"));  
	}
	
	
	@RequestMapping(value="/word", method=RequestMethod.GET)
	public String login() {
		return "/word";
	}
	
	 
}
