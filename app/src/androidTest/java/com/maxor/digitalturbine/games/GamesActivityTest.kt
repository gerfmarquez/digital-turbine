package com.maxor.digitalturbine.games

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers

import androidx.test.espresso.matcher.ViewMatchers.*

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.maxor.digitalturbine.R
import com.maxor.digitalturbine.util.EspressoIdlingResource
import com.maxor.digitalturbine.util.ListAdapter
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GamesActivityTest {
    @get:Rule
    val homeActivity = ActivityTestRule(GamesActivity::class.java, true, false)

    @Before
    fun before() {
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResource)
    }
    @After
    fun after() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResource)
    }
    @Test
    fun testGameAdsClick() {
        homeActivity.launchActivity(null)

        onView(withId(R.id.activity_game_title)).check(matches(isDisplayed()))

        onView(withId(R.id.rv_game_ads)).check(matches(isDisplayed()))

        onView(withId(R.id.rv_game_ads)).perform(ViewActions.swipeUp())

        onView(withId(R.id.rv_game_ads)).perform(
            actionOnItemAtPosition<GameAdapter.GameHolder>(5,click()))

        onView(withId(R.id.tv_detail_title)).check(matches(isDisplayed()))

        onView(withId(R.id.iv_game_detail_image)).check(matches(isDisplayed()))



    }
}