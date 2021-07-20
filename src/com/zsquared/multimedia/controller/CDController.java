package com.zsquared.multimedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsquared.multimedia.dao.BurnedDiscDAO;
import com.zsquared.multimedia.entity.BurnedDisc;

@Controller
public class CDController {
	
	@Autowired
	private BurnedDiscDAO burnedDiscDAO;
	
	@RequestMapping("/showCDList")
	public String showList() {
		return "compact-disc-list-form";
	}

	@RequestMapping("/processCDList")
	public String processCDList(Model theModel) {
		List<BurnedDisc> theDiscs = burnedDiscDAO.getBurnedDiscs();
		theModel.addAttribute("burnedDiscs", theDiscs);
		return "list-burneddiscs";
	}
	
	@RequestMapping("/addToCDList")
	public String addToCDList(Model theModel) {
		List<BurnedDisc> theDiscs = burnedDiscDAO.getBurnedDiscs();
		theModel.addAttribute("burnedDiscs", theDiscs);
		return "add-to-discs";
	}
}
