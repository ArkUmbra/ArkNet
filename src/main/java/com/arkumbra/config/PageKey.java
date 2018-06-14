package com.arkumbra.config;

public enum PageKey {
  HOME("home"),
  POST("post");

  private final String page;

  PageKey(String page) {
    this.page = page;
  }

  public String with(String key) {
    return page + "/" + key;
  }

  public String getPage() {
    return page;
  }

}
