package me.java.clean.chp03_function.findfitnesse;

import me.java.clean.chp03_function.findfitnesse.lib.PageData;
import me.java.clean.chp03_function.findfitnesse.lib.WikiPage;

public class FindFitNesseBad {
  public static String testableHtmlBad(PageData pageData, boolean includeSuiteSetup) throws Exception {
    WikiPage wikiPage = pageData.getWikiPage();
    StringBuffer buffer = new StringBuffer();
    if (pageData.hasAttribute("Test")) {
      PageCrawlerImpl.getIngeritedPage();
    }
  }
}
