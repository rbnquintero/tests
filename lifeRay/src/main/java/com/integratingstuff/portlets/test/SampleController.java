package com.integratingstuff.portlets.test;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value = "/demo**", method = RequestMethod.GET)
	public ModelAndView demoPage(RenderRequest request,
			RenderResponse response) throws Exception {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;
	}

}