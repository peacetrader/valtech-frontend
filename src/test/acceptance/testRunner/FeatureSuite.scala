package testRunner

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.AfterClass
import org.junit.runner.RunWith
import steps.Env

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  //tags = Array("@local"),
  plugin = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"),
  glue = Array("steps")
)
class FeatureSuite

object FeatureSuite {

  @AfterClass
  def afterCukesRun() {
    Env.shutdown()
  }
}