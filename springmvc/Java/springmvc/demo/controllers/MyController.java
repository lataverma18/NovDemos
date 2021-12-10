package springmvc.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/greet")
	public ModelAndView greet()
	{
		ModelAndView mv=new ModelAndView("myviewpage");
		String data="Welcome to CG!!!";
		mv.addObject("modeldata",data);
		return mv;
	}
}
