package modularization.features.currencyconveter
import androidx.test.core.app.ActivityScenario
import androidx.lifecycle.Lifecycle.State
import modularization.features.currencyconveter.ui.MainActivity
import org.junit.Assert
import org.junit.Test

class UserRegistrationFlowTest {

        @Test
        fun testEvent() {
            val scenario = ActivityScenario.launch(MainActivity::class.java)
            Assert.assertNotNull(scenario)
            Assert.assertEquals(scenario.state, State.RESUMED)


        }

        }

