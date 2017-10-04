package org.codeforafrica.citizenreporterandroid.ui.auth.signin;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.codeforafrica.citizenreporterandroid.R;
import org.codeforafrica.citizenreporterandroid.ui.auth.signin.SignInActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by edwinkato on 10/4/17.
 */

@RunWith(AndroidJUnit4.class)
public class SignInActivityTest {

    @Rule
    public ActivityTestRule<SignInActivity> mActivityTestRule = new ActivityTestRule<>(SignInActivity.class);

    @Test
    public void shouldSignIn() {
        ViewInteraction appCompatAutoCompleteTextView4 = onView(
                allOf(withId(R.id.sign_in_email), isDisplayed()));
        appCompatAutoCompleteTextView4.perform(click());

        ViewInteraction appCompatAutoCompleteTextView5 = onView(
                allOf(withId(R.id.sign_in_email), isDisplayed()));
        appCompatAutoCompleteTextView5.perform(replaceText("katedwin88@gmail.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.sign_in_password), isDisplayed()));
        appCompatEditText2.perform(replaceText("Edwin"), closeSoftKeyboard());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.sign_in_button_done), withText("Done"), isDisplayed()));
        appCompatButton5.perform(click());

    }

}
