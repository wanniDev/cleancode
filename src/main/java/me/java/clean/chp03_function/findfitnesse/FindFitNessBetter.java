package me.java.clean.chp03_function.findfitnesse;

import me.java.clean.chp03_function.findfitnesse.lib.PageData;
import me.java.clean.chp03_function.findfitnesse.lib.WikiPage;

public class FindFitNessBetter {
  public static String renderPageWithSetupAndTearDowns(PageData pageData, boolean isSuite) throws Exception {
    final boolean isTestPage = pageData.hasAttribute("Test");
    if (isTestPage) {
      final WikiPage testPage = pageData.getWikiPage();
      final StringBuffer newPageContent = new StringBuffer();
      includeSetupPages(testPage, newPageContent, isSuite);
      newPageContent.append(pageData.getContent());
      includeTearDownPages(testPage, newPageContent, isSuite);
      pageData.setContent(newPageContent.toString());
    }
    return pageData.getHtml();
  }
}
