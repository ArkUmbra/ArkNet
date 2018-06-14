package com.arkumbra.controller;

import com.arkumbra.config.AttributeKeys;
import com.arkumbra.config.PageKey;
import com.arkumbra.model.blog.BlogLoader;
import com.arkumbra.model.blog.PostSummary;
import java.util.List;
import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController {

  private final BlogLoader blogLoader;

  public HomeController(BlogLoader blogLoader) {
    this.blogLoader = blogLoader;
  }


	@RequestMapping(method = RequestMethod.GET)
	public String loadHomePage(Locale locale, Model model) {

  	System.out.println(locale.getLanguage());
  	System.out.println(locale.getDisplayLanguage());
  	System.out.println(locale.getDisplayName());
  	System.out.println(locale.toLanguageTag());


		List<PostSummary> posts = blogLoader.getRecentPosts(locale);
		model.addAttribute(AttributeKeys.POST_SUMMARIES.getAttr(), posts);
		model.addAttribute(AttributeKeys.LANGUAGE.getAttr(), locale.toLanguageTag());

		return getLanguageSpecificPage(locale, PageKey.HOME);
	}

	// TODO set language via filter

}