package com.elenverve.common.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elenverve.dpo.pages.Home;
import com.elenverve.model.Product;
import com.elenverve.parser.ProductParser;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(value={ "/", "/welcome**" }, method = RequestMethod.GET)
	public String index(ModelMap model,HttpServletRequest request) {

		return "index";

	}
	@RequestMapping(value={ "/home", "/welcome**" }, method = RequestMethod.GET)
	public String index2(ModelMap model,HttpServletRequest request) {
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);

		Home homeDpo = new Home();
		model.addAttribute("homedpo", homeDpo);
		return "home";
	}

	@RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - " + name);
		return "index1";
	}
	
	@RequestMapping(value={ "/myhome", "/welcome**" }, method = RequestMethod.GET)
	public String myhome(ModelMap model,HttpServletRequest request) {
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);

		Home homeDpo = new Home();
		model.addAttribute("homedpo", homeDpo);
		return "myhome";
	}
	
	@RequestMapping(value="/links", method=RequestMethod.GET)
	public void links() {}
	
	@RequestMapping(value="/secure", method=RequestMethod.GET)
	public void secure() {}
}