package com.javainuse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

		@RequestMapping("/home.html")
		public ModelAndView firstPage() {
			return new ModelAndView("home");
		}

		@RequestMapping("/home2.html")
		public ModelAndView thirdPage() {
			return new ModelAndView("home2");
		}

}
