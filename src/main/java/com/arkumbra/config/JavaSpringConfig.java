package com.arkumbra.config;

import com.arkumbra.model.blog.BlogLoader;
import com.arkumbra.model.blog.BlogLoaderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaSpringConfig {

  @Bean
  public BlogLoader getBlogLoader() {
    return new BlogLoaderImpl();
  }

}
