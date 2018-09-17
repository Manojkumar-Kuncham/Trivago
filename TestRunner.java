package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features= {"src/features/FeaturedArticle.feature"},glue= {"com.trivago"})
@CucumberOptions(features= {"src/features/"},glue="com.trivago")

public class TestRunner {

}