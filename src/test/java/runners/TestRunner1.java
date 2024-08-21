package runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/rigorousTestCases" }, 
		glue = { "stepDefinitions" }, tags = "@test",
		plugin = {"extentReport.ExtentCucumberAdapter"},
		monochrome = true,
		strict = true)
public class TestRunner1 extends BaseTestRunner {
	
	@BeforeClass
	public static void setLang() {
		path = "enExtent.html";
		language = "en";
		getExcelSheetData();
	}
	
}
