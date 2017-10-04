package org.codeforafrica.citizenreporterandroid.ui.auth.signup;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.codeforafrica.citizenreporterandroid.R;
import org.codeforafrica.citizenreporterandroid.ui.auth.signup.SignUpActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
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
public class SignUpActivityTest {

    @Rule
    public ActivityTestRule<SignUpActivity> mActivityTestRule = new ActivityTestRule<>(SignUpActivity.class);

    @Test
    public void shouldSignUp() {
        ViewInteraction appCompatAutoCompleteTextView = onView(
                allOf(withId(R.id.sign_up_name), isDisplayed()));
        appCompatAutoCompleteTextView.perform(click());

        ViewInteraction appCompatAutoCompleteTextView2 = onView(
                allOf(withId(R.id.sign_up_name), isDisplayed()));
        appCompatAutoCompleteTextView2.perform(replaceText("Edwin  Kato"), closeSoftKeyboard());

        ViewInteraction appCompatAutoCompleteTextView3 = onView(
                allOf(withId(R.id.sign_up_email_address), isDisplayed()));
        appCompatAutoCompleteTextView3.perform(replaceText("katedwin88@gmail.com"), closeSoftKeyboard());

        pressBack();

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.sign_up_password), isDisplayed()));
        appCompatEditText.perform(replaceText("Edwin"), closeSoftKeyboard());

        pressBack();

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.sign_up_done_button), withText("Done"), isDisplayed()));
        appCompatButton4.perform(click());

    }

}
