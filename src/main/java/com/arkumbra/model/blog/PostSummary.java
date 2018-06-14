package com.arkumbra.model.blog;

public class PostSummary {

  private final String title;
  private final String contentSummary;
  private final String language;
  private final String postId;

  public PostSummary(String title, String contentSummary, String language, String postId) {
    this.title = title;
    this.contentSummary = contentSummary;
    this.language = language;
    this.postId = postId;
  }

  public String getTitle() {
    return title;
  }

  public String getContentSummary() {
    return contentSummary;
  }

  public String getLanguage() {
    return language;
  }

  public String getPostId() {
    return postId;
  }

}
