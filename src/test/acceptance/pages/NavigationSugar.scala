package pages

import org.openqa.selenium.support.ui.{ExpectedCondition, WebDriverWait}
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.scalatest._
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.WebBrowser
import org.scalatest.selenium.WebBrowser.{go => goo}
import org.scalatest.time.{Millis, Seconds, Span}

trait NavigationSugar extends WebBrowser with Eventually with Assertions with Matchers {

  implicit override val patienceConfig = PatienceConfig(timeout = scaled(Span(3, Seconds)), interval = scaled(Span(100, Millis)))

  def goTo(page: WebPage)(implicit webDriver: WebDriver) = {
    go(page)
  }

  def go(page: WebLink)(implicit webDriver: WebDriver) = {
    goo to page
  }

  def on(page: WebPage)(implicit webDriver: WebDriver) {
    eventually {
      page.isCurrentPage
    }
    withClue(s"Currently in page: $currentUrl") {
      assert(page.isCurrentPage, s"Page was not loaded: $page (${page.url}), current Url: $currentUrl")
    }
  }

  def loadPage()(implicit webDriver: WebDriver) = {
    val wait = new WebDriverWait(webDriver, 30)
    wait.until(
      new ExpectedCondition[WebElement] {
        override def apply(d: WebDriver) = d.findElement(By.tagName("body"))
      }
    )
  }
}