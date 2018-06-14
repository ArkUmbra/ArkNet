package com.arkumbra.controller;

import com.arkumbra.config.AttributeKeys;
import com.arkumbra.config.PageKey;
import com.arkumbra.model.blog.BlogLoader;
import com.arkumbra.model.blog.Post;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/post")
public class PostController extends BaseController {

  private final BlogLoader blogLoader;

  public PostController(BlogLoader blogLoader) {
    this.blogLoader = blogLoader;
  }


  @RequestMapping(value = "/{postId}", method = RequestMethod.GET)
  public String loadPost(Locale locale, Model model,
      @PathVariable("postId") String postId) {

    Post post = blogLoader.getPostById(locale, postId);
    model.addAttribute(AttributeKeys.POST.getAttr(), post);
    model.addAttribute(AttributeKeys.LANGUAGE.getAttr(), locale.toLanguageTag());

    return getLanguageSpecificPage(locale, PageKey.POST);
  }

  // TODO set language via filter

}
