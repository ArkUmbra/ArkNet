package com.arkumbra.controller;

import com.arkumbra.config.PageKey;
import java.util.Locale;

public class BaseController {

  private static final String JAPANESE = "ja/";
  private static final String ENGLISH = "en/";

  public final String getLanguageSpecificPage(Locale locale, PageKey pageKey) {
    if (locale.equals(Locale.JAPANESE))  {
      return pageKey.with(JAPANESE + pageKey.getPage());
    } else {
      return pageKey.with(ENGLISH + pageKey.getPage());
    }
  }

}
