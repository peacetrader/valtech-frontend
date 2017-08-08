package steps

import acceptance.pages.{AboutPage, ContactPage, ServicesPage, WorkPage}
import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.WebDriver
import org.scalatest.Matchers
import pages.{HomePage, NavigationSugar}


class TestSteps extends ScalaDsl with EN with Matchers with NavigationSugar {

  implicit val webDriver: WebDriver = Env.driver

  Given("""^I am in the homepage$"""){ () =>
    goTo(HomePage)
    on(HomePage)
  }

  Then("""^I should be able to see the Latest News Section$"""){ () =>
     HomePage.assertLatestNewsSectionIsDisplayed()
  }


  Given("""^I navigate to the homepage$"""){ () =>
    goTo(HomePage)
    on(HomePage)
  }

  When("""^I navigate to '(.*)'$"""){ (topNavigation: String) =>
    HomePage.navigationLink(topNavigation).click()
  }

  Then("""^I should be able to see the 'About' page name$"""){ () =>
    on(AboutPage)
  }

  Then("""^I should be able to see the 'Work' page name$"""){ () =>
    on(WorkPage)
  }

  Then("""^I should be able to see the 'Services' page name$"""){ () =>
    on(ServicesPage)
  }

  When("""^I navigate to Contact Page$"""){ () =>
     HomePage.earthContactIcon.click()
  }

  Then("""^I should be able to see 36 offices in the Contact page$""") { () =>
     ContactPage.noOfOffices shouldBe 36
  }


}
