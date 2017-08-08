
package acceptance.pages

import pages.WebPage

object AboutPage extends WebPage {

  override val url: String = "https://www.valtech.com/about/"
  override def isCurrentPage : Boolean = find(tagName("h1")).fold(false)(_.text == "About")

}
