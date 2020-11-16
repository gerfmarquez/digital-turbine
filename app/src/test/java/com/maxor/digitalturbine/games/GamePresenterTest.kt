package com.maxor.digitalturbine.games

import com.maxor.digitalturbine.RxImmediateSchedulerRule
import com.maxor.digitalturbine.games.model.Ad
import com.maxor.digitalturbine.games.model.AdsResponse
import io.reactivex.Single
import org.junit.ClassRule
import org.junit.Rule
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

class WeatherPresenterTest {
    @get:Rule
    val mockitoRule: MockitoRule = MockitoJUnit.rule()

    companion object {
        @ClassRule
        @JvmField
        val schedulers = RxImmediateSchedulerRule()
    }
    @Mock
    lateinit var gamesService: GamesService
    @Mock
    lateinit var gameView: GamesMvpContract.View

    @InjectMocks
    lateinit var gamePresenter: GamesPresenter

    @Test
    fun presenterTestSuccessful() {
        val gamesData  = GameData(
            1234,"gamerush","thumbnail.png","4.5")

        val gameAdsResponse = AdsResponse(
            ads = listOf(Ad(
                productId = gamesData.productId,
                productName = gamesData.name,
                productThumbnail = gamesData.thumbnail,
                rating = gamesData.rating))
        )


        `when`(gamesService.fetchGameAds(
            Mockito.anyInt(),
            Mockito.anyString(),
            Mockito.anyInt(),
            Mockito.anyInt(),
            Mockito.anyString(),
            Mockito.anyInt(),
            Mockito.anyString()))
            .thenReturn(Single.just(gameAdsResponse))

        gamePresenter.bindView(gameView)
        gamePresenter.fetchGames()


        verify(gameView).showGames(listOf(gamesData))


    }
}