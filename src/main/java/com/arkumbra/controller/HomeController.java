package com.arkumbra.controller;

import com.arkumbra.config.PageKeys;
import com.arkumbra.model.blog.BlogLoader;
import com.arkumbra.model.blog.Post;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

  private static final String POSTS_ATTR_KEY = "posts";

  private final BlogLoader blogLoader;

  public HomeController(BlogLoader blogLoader) {
    this.blogLoader = blogLoader;
  }

	@RequestMapping(method=RequestMethod.GET)
	public String loadHomePage(Locale locale, Model model) {
		model.addAttribute("greeting", "Hello!");

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);        
		String formattedDate = dateFormat.format(date);
		model.addAttribute("currentTime", formattedDate);

		List<Post> posts = blogLoader.getRecentPosts();
		model.addAttribute(POSTS_ATTR_KEY, posts);

		return PageKeys.HOME.getFileName();
	}

}