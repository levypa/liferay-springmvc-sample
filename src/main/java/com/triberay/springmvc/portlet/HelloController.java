package com.triberay.springmvc.portlet;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * @author Wouter Vernaillen
 */
@Controller
@RequestMapping("VIEW")
public class HelloController {

	@RenderMapping
	public String view(RenderRequest request, RenderResponse response) {
		return "view";
	}
}