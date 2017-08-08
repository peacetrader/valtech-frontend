name := "valtech-frontend"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium"   %   "selenium-java"             %  "2.53.1",
  "org.scalatest"             %   "scalatest_2.11"            %  "2.2.6",
  "org.pegdown"               %   "pegdown"                   %  "1.1.0"   %  "test",
  "info.cukes"                %   "cucumber-scala_2.11"       %  "1.2.5",
  "info.cukes"                %   "cucumber-junit"            %  "1.2.5",
  "info.cukes"                %   "cucumber-picocontainer"    %  "1.2.4",
  "junit"                     %   "junit"                     %  "4.11"    %  "test",
  "com.novocode"              %   "junit-interface"           %  "0.11"    %  "test"
)
    