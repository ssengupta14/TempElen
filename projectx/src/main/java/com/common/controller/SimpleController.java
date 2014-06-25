package com.common.controller;




import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.common.beans.Product;
import com.common.logic.ProductParser;

 
@Controller
@RequestMapping("/")
public class SimpleController {
	

	 /*	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {
 
	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Spring Security Login Form - Database Authentication");
	  model.addObject("message", "This is default page!");
	  model.setViewName("hello");
	  return model;
 
	}
 
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
 
	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Spring Security Login Form - Database Authentication");
	  model.addObject("message", "This page is for ROLE_ADMIN only!");
	  model.setViewName("admin");
	  return model;
 
	}
 
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {
 
	  ModelAndView model = new ModelAndView();
	  if (error != null && error.trim().length()>0) {
		  System.out.println("error is "+error);
		model.addObject("error", "Invalid username and password!"+error);
	  }
 
	  if (logout != null) {
		model.addObject("msg", "You've been logged out successfully.");
	  }
	  model.setViewName("login");
 
	  return model;
 
	}
 
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {
 
	  ModelAndView model = new ModelAndView();
 
	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		UserDetails userDetail = (UserDetails) auth.getPrincipal();	
		model.addObject("username", userDetail.getUsername());
	  }
 
	  model.setViewName("403");
	  return model;
 
	}
	
*/	
	
	@RequestMapping(value={ "/", "/welcome**" }, method = RequestMethod.GET)
	public String welcome(ModelMap model,HttpServletRequest request) {
	
		/*
		List<Message> prodList = new ArrayList<Message>();
		
		
		Message msg = new Message();
		msg.setValue1("Motorola 156 MX-VL");
		msg.setValue2("/resources/images/laptop.gif");
		msg.setValue3("350");
		msg.setValue4("270");
 		prodList.add(msg);

 		msg = new Message();
		msg.setValue1("Iphone Apple");
		msg.setValue2("/resources/images/p4.gif");
		msg.setValue3("0");
		msg.setValue4("270");
 		prodList.add(msg);

 		msg = new Message();
		msg.setValue1("Samsung Webcam");
		msg.setValue2("/resources/images/p5.gif");
		msg.setValue3("350");
		msg.setValue4("290");
 		prodList.add(msg);
		
 		msg = new Message();
		msg.setValue1("Motorola 196 MX-VL");
		msg.setValue2("/resources/images/laptop.gif");
		msg.setValue3("350");
		msg.setValue4("290");
 		prodList.add(msg);
 		
 		msg = new Message();
		msg.setValue1("Iphone Apple");
		msg.setValue2("/resources/images/p4.gif");
		msg.setValue3("0");
		msg.setValue4("270");
 		prodList.add(msg);

 		msg = new Message();
		msg.setValue1("Samsung Webcam");
		msg.setValue2("/resources/images/p5.gif");
		msg.setValue3("350");
		msg.setValue4("290");
 		prodList.add(msg);
		
 		msg = new Message();
		msg.setValue1("Motorola 196 MX-VL");
		msg.setValue2("/resources/images/laptop.gif");
		msg.setValue3("350");
		msg.setValue4("290");
 		prodList.add(msg);
 		
 		msg = new Message();
		msg.setValue1("Iphone Apple");
		msg.setValue2("/resources/images/p4.gif");
		msg.setValue3("0");
		msg.setValue4("270");
 		prodList.add(msg);

 		msg = new Message();
		msg.setValue1("Samsung Webcam");
		msg.setValue2("/resources/images/p5.gif");
		msg.setValue3("350");
		msg.setValue4("290");
 		prodList.add(msg);
		
 		msg = new Message();
		msg.setValue1("Motorola 196 MX-VL");
		msg.setValue2("/resources/images/laptop.gif");
		msg.setValue3("350");
		msg.setValue4("290");
 		prodList.add(msg);
 		*/
		/*
		 final String userAgent = request.getHeader("user-agent");
		  String ipAddress = request.getHeader("X-FORWARDED-FOR");  
		   if (ipAddress == null) {  
			   ipAddress = request.getRemoteAddr();  
		   }
		
		   Map<String,String> headers = new HashMap<String,String>();
		   Enumeration headerNames = request.getHeaderNames();
			while (headerNames.hasMoreElements()) {
				String key = (String) headerNames.nextElement();
				String value = request.getHeader(key);
				//headers.put(key, value);
				model.addAttribute(key, value);
				System.out.println("Key ="+key+" value ="+value);
			}
		*/
	
	
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();		
		model.addAttribute("prodList", prodList);
		/*
		
		model.addAttribute("ipAddress", ipAddress);
		model.addAttribute("userAgent", userAgent);
		model.addAttribute("userAgent", userAgent);
		//model.addAttribute("headers", headers);
		
		
		//Spring uses InternalResourceViewResolver and return back index.jsp
		*/

		/*
		String deviceType = "unknown";
        if (device.isNormal()) {
            deviceType = "normal";
        } else if (device.isMobile()) {
            deviceType = "mobile";
        } else if (device.isTablet()) {
            deviceType = "tablet";
        }
        
        model.addAttribute("deviceType", "You are accessing the site via. "+deviceType);
        */
		
	return "index1";
 
	}
 
	@RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - " + name);
		return "index1";
 
	}
 
}