
package acceptance.pages

import pages.WebPage

object WorkPage extends WebPage {

  override val url: String = "https://www.valtech.com/work/"
  override def isCurrentPage : Boolean = find(tagName("h1")).fold(false)(_.text == "Work")

}
