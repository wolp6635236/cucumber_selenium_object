package runner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @Author: liupeng
 * @Description:
 * @Date: Created in 17:05 2019/3/6
 * @Modified By:
 */
public class serviceHooks {
        @Before
        public void initializeTest(){
            // Code to setup initial configurations
            System.out.print("这是前提");
        }

        @After
        public void embedScreenshot(Scenario scenario) {
            if (scenario.isFailed()) {
                try {
                    // Code to capture and embed images in test reports (if scenario fails)
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
}