package com.arkumbra.config;

public enum AttributeKeys {

  LANGUAGE("lang"),
  POST_SUMMARIES("postSummaries"),
  POST("post");

  private final String attr;

  AttributeKeys(String attr) {
    this.attr = attr;
  }

  public String getAttr() {
    return attr;
  }
}
