
package pages

import org.openqa.selenium.WebElement

object HomePage extends WebPage {

  override val url: String = "https://www.valtech.com/"
  override def isCurrentPage : Boolean = find(cssSelector(".header__logo > span")).fold(false)(_.text == "Valtech")

  def assertLatestNewsSectionIsDisplayed() {
    find(cssSelector(".bloglisting.news-post__listing")).get.underlying.isDisplayed
  }

  def earthContactIcon: WebElement = find(cssSelector(".icons.glyph")).get.underlying

  def navigationLink(link:String): WebElement = {
    find(cssSelector(link)).get.underlying
  }
}
