package com.arkumbra.config;

public enum PageKeys {
  HOME("home");

  private final String fileName;

  PageKeys(String fileName) {
    this.fileName = fileName;
  }

  public String getFileName() {
    return fileName;
  }
}
