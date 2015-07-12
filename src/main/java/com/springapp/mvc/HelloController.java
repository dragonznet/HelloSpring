package com.springapp.mvc;

import com.springapp.mvc.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(value = "yoseop", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value = "yoseop2", method = RequestMethod.GET)
	public ModelAndView printWelcome() {
		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("message", "Hello world!!!!");
		return model;
	}

	@RequestMapping(value="restful", method = RequestMethod.GET)
	public @ResponseBody Person restful() {
		Person person =  new Person();
		person.setName("ÀÌ½ÂÇö");
		person.setAge(25);
		person.setAdress("¸â¹ö½Ê");
		return person;
	}

	@RequestMapping(value="restful", method = RequestMethod.POST)
	public @ResponseBody Person restful(@RequestBody Person input) {
		System.out.println("input : " + input);

		Person person =  new Person();
		person.setName("ÀÌ½ÂÇö");
		person.setAge(25);
		person.setAdress("¸â¹ö½Ê");
		return person;
	}
}