package com.zsquared.multimedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsquared.multimedia.dao.SongListDAO;
import com.zsquared.multimedia.entity.SongList;

@Controller
public class PracticeListController {
	
	@Autowired
	private SongListDAO songListDAO;
	
	@RequestMapping("/practiceList")
	public String showPracticeList(Model theModel) {
		List<SongList> theSongList = songListDAO.getSongList();
		theModel.addAttribute("songList", theSongList);
		return "practice-list";
	}

}
