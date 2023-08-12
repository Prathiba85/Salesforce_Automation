package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

	              
	        		@RunWith(Cucumber.class)
	        		@CucumberOptions (  			
	        				
	        				features = "src/test/java/Features",
	        				     				glue="StepDefinition",
	        						 plugin= {"pretty",
	        			                        "html:reports/myreport.html",
	        			                        "json:reports/myreport.json",
	        			                        "rerun:target/rerun.txt",    //Mandatory to capture failures
	        			                },
	                        dryRun=false,
	                        monochrome=true
	        )

	public class TestRunner {

	}

