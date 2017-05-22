package com.niit.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.RegisterDao;
import com.niit.model.CreateUser;

@Controller
public class HomeController 
{
	

	@Autowired	
	RegisterDao regdao;
	
	@RequestMapping("/")
	public ModelAndView Home(Principal principal)
	{
		if(principal!=null)
		{
			CreateUser user=regdao.getEmail(principal.getName());
			if(user.getRole().equals("ROLE_ADMIN"))
			{
				return new ModelAndView("Adminhomepage");
			}
			else
			{
				return new ModelAndView("customer");
			}
		}
		return new ModelAndView("index");
	}
	
	@RequestMapping("/reg")
	public ModelAndView signup()
	{
		CreateUser createuser=new CreateUser();
		return new ModelAndView("Createuser","UserDetails",createuser);
	}
	
	@RequestMapping("/register")
	public ModelAndView Regi(@ModelAttribute("UserDetails") CreateUser cuser , BindingResult result)
	{
		
		if(result.hasErrors())
		{
			return new ModelAndView("CreateUser");
		}
		regdao.addData(cuser);
		return new ModelAndView("index");
	}
	//@RequestMapping("/signin")
	@GetMapping("/login")
	public String login(@RequestParam(value="error", required=false) String error, ModelMap model)
	{
		System.out.println(error);
		if(error!=null)
		{
			model.addAttribute("error","Authentication Failed-Invalid credentials!");
			return "loginform";
		}
		model.addAttribute("title","login");
		return "loginform";
	}
	
}
