package com.arkumbra.config;

import sun.jvm.hotspot.debugger.Page;

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
