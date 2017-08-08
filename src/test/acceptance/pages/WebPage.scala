package pages

import org.openqa.selenium.{WebDriver}
import org.scalatest._
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.{Page, WebBrowser}
import steps.Env

case class Link(href: String, text: String)

trait WebLink extends Page with WebBrowser with Eventually with Assertions with ShouldMatchers {
  implicit val webDriver: WebDriver = Env.driver

  override def toString = this.getClass.getSimpleName
}

trait WebPage extends WebLink {

  def isCurrentPage: Boolean
}
