package com.arkumbra.model.blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.util.StringUtils;

public class BlogLoaderImpl implements BlogLoader {

  private static final String loremIpsum = "Hello. This is a message in English. If you use your browser in a different language, then this message may change. ";
  private static final String loremIpsumJpn = "こんにちは、これは日本語のメッセージです。もし別の言語でブラウザーを使ったらこのメッセージが変えられるかもしれません。";

  private static final String postTitleEng = "This is post {}";
  private static final String postTitleJpn = "これは{}番目投稿";

  @Override
  public Post getPostById(Locale locale, String postId) {
    return new Post(
        getPostTitle(postId, locale),
        getPostContent(locale)
    );
  }

  @Override
  public List<PostSummary> getRecentPosts(Locale locale) {
    List<PostSummary> posts = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      PostSummary post = new PostSummary(
          getPostTitle(String.valueOf(i), locale),
          getPostContent(locale),
          locale.getLanguage(),
          String.valueOf(i)
          );
      posts.add(post);
    }

    return posts;
  }

  private String getPostTitle(String postNum, Locale locale) {
    if (locale.equals(Locale.JAPANESE)) {
      return StringUtils.replace(postTitleJpn, "{}", postNum);
    } else {
      return StringUtils.replace(postTitleEng, "{}", postNum);
    }
  }

  private String getPostContent(Locale locale) {
    if (locale.equals(Locale.JAPANESE)) {
      return loremIpsumJpn + loremIpsumJpn + loremIpsumJpn;
    } else {
      return loremIpsum + loremIpsum + loremIpsum;
    }
  }

}
