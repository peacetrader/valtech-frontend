
package acceptance.pages

import pages.WebPage

object ServicesPage extends WebPage {

  override val url: String = "https://www.valtech.com/services/"
  override def isCurrentPage : Boolean = find(tagName("h1")).fold(false)(_.text == "Services")

}
