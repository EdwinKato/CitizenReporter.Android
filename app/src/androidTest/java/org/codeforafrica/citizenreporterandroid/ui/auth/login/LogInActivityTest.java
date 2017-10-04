package org.codeforafrica.citizenreporterandroid.ui.auth.login;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import org.codeforafrica.citizenreporterandroid.R;
import org.codeforafrica.citizenreporterandroid.ui.splash.SplashActivity;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by edwinkato on 10/4/17.
 */

public class LogInActivityTest {

    @Rule
    public ActivityTestRule<SplashActivity> mActivityTestRule = new ActivityTestRule<>(SplashActivity.class);

    @Test
    public void shouldHaveLoginButtons() {
        ViewInteraction facebookSignInButton = onView(
                allOf(withId(R.id.facebook_login_button), withText("SIGN IN WITH FACEBOOK"), isDisplayed()));
//        facebookSignInButton.perform(click());

        ViewInteraction emailSignInButton = onView(
                allOf(withId(R.id.email_login_button), withText("JOIN WITH EMAIL"), isDisplayed()));
//        emailSignInButton.perform(click());

        ViewInteraction googleSignInButton = onView(
                allOf(withId(R.id.google_login_button), withText("SIGN IN WITH GOOGLE"), isDisplayed()));
    }
}
