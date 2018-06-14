package com.arkumbra.model.blog;

import java.util.List;
import java.util.Locale;

public interface BlogLoader {

  Post getPostById(Locale locale, String postId);

  List<PostSummary> getRecentPosts(Locale locale);

}
