
package acceptance.pages

import pages.WebPage

object ContactPage extends WebPage {

  override val url: String = "https://www.valtech.com/"
  override def isCurrentPage : Boolean = find(cssSelector(".contactheader")).fold(false)(_.text == "Contact our other offices")

  def noOfOffices = findAll(cssSelector(".contactcities>li>a:nth-child(2)")).length

}
