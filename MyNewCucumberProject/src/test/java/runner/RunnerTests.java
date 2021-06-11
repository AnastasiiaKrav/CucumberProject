package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/main/resources/smoke.feature","src/main/resources/checkout.feature", "src/main/resources/product.feature", "src/main/resources/signIn&register.feature"},
    glue = "stepdefinitions"

)
public class RunnerTests {

}
