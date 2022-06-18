package me.java.clean.chp03_function.findfitnesse;

import me.java.clean.chp03_function.findfitnesse.lib.PageData;

public class FindFitNessEvenBetter {
  public static String renderPageWithSetupsAndTearDowns(PageData pageData, boolean isSuite) throws Exception {
    if (isTestPage(pageData)) {
      includeSetupAndTeardownPages(pageData, isSuite);
    }
    return pageData.getHtml();
  }
}
