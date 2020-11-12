package runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * @Author: liupeng
 * @Description:
 * @Date: Created in 11:02 2019/2/22
 * @Modified By:
 */
public class RunCukesByCompositionBase {

    @BeforeClass
    public void beforeClass() {
        // do expensive setup
    }

    @BeforeMethod
    public void beforeMethod() {
        // do expensive setup
    }
}
