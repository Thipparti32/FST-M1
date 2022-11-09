package testRunner;


    import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            //features = "C:\\Users\\002F6E744\\IdeaProjects\\FST_Training\\src\\test\\java\\features",
            //glue = {"stepDefinitions"},
           // tags = "@SimpleAlert",
            //plugin = {"pretty"},
            //monochrome = true
           // tags = "@activity1"
           // tags = "@activity2"
            //tags = "@activity3"
            //tags = "@activity4"
            //tags = "@activity5"
            // for HTML Report
            //features = "C:\\Users\\002F6E744\\IdeaProjects\\FST_Training\\src\\test\\java\\features",
            //glue = {"stepDefinitions"},
            //tags = "@SimpleAlert",
            //plugin = {"html: test-reports"},
           // monochrome = true
            // for JSON
            features = "C:\\Users\\002F6E744\\IdeaProjects\\FST_Training\\src\\test\\java\\features",
            glue = {"stepDefinitions"},
            tags = "@SimpleAlert",
            plugin = {"json: test-reports/json-report.json"},
            monochrome = true


    )

    public class ActivitiesRunner {
        //empty
    }

