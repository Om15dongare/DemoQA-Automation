// package runners;

// import io.cucumber.testng.AbstractTestNGCucumberTests;
// import io.cucumber.testng.CucumberOptions;

// @CucumberOptions(
//         features = "src/test/resources/features/login_with_excel.feature",
//         glue = {"stepdefinitions", "hooks"},
//         plugin = {
//                 "pretty",
//                 "html:target/cucumber-report.html"
//         }
        
// )
// public class TestRunner extends AbstractTestNGCucumberTests {
// }
// package runners;

// import io.cucumber.testng.AbstractTestNGCucumberTests;
// import io.cucumber.testng.CucumberOptions;

// @CucumberOptions(
//         features = "src/test/resources/features",
//         glue = {"stepdefinitions", "hooks"},
//         plugin = {
//                 "pretty",
//                 "html:target/cucumber-report.html"
//         }
// )
// public class TestRunner extends AbstractTestNGCucumberTests {
// }
package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepdefinitions", "hooks"},
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber.json"
    }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
