package com.zsquared.multimedia.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CDController {
	
	@RequestMapping("/showCDList")
	public String showList() {
		return "compact-disc-list-form";
	}

	@RequestMapping("/processCDList")
	public String processCDList() {
		return "compact-disc-list";
	}
}
