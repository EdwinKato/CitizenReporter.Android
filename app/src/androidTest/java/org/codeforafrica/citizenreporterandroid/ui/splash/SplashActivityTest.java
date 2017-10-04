package org.codeforafrica.citizenreporterandroid.ui.splash;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.codeforafrica.citizenreporterandroid.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SplashActivityTest {

    @Rule
    public ActivityTestRule<SplashActivity> mActivityTestRule = new ActivityTestRule<>(SplashActivity.class);

    @Test
    public void splashActivityTest() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.next),
                        withParent(allOf(withId(R.id.bottomContainer),
                                withParent(withId(R.id.bottom)))),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction appIntroViewPager = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        appIntroViewPager.perform(swipeLeft());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withId(R.id.next),
                        withParent(allOf(withId(R.id.bottomContainer),
                                withParent(withId(R.id.bottom)))),
                        isDisplayed()));
        appCompatImageButton2.perform(click());

        ViewInteraction appIntroViewPager2 = onView(
                allOf(withId(R.id.view_pager), isDisplayed()));
        appIntroViewPager2.perform(swipeLeft());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.done), withText("DONE"),
                        withParent(allOf(withId(R.id.bottomContainer),
                                withParent(withId(R.id.bottom)))),
                        isDisplayed()));
        appCompatButton.perform(click());


    }

}
