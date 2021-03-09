package modularization.features.postandcomments

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import modularization.features.postandcomments.ui.GetUsersAndPostActivity
import org.junit.Rule
import org.junit.Test

class UserRegistrationFlowTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(GetUsersAndPostActivity::class.java)

    @Test
    fun loginFlowTest() {
        onView(withId(R.id.button_user_registration_start)).perform(click())
        onView(withId(R.id.card_list)).perform(ViewActions.swipeUp())
        onView(withId(R.id.card_list)).perform(ViewActions.swipeDown())
        onView(withId(R.id.card_id_main))
    }
}
