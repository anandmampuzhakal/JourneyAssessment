package modularization.features.onboardingtest

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import modularization.features.onboardingtest.ui.GetUsersAndPostActivity
import org.junit.Rule
import org.junit.Test

class UserRegistrationFlowTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(GetUsersAndPostActivity::class.java)

    @Test
    fun loginFlowTest() {
        onView(withId(R.id.button_user_registration_start)).perform(click())
        onView(withId(R.id.post_with_comments_card_list)).perform(ViewActions.swipeUp())
    }
}
