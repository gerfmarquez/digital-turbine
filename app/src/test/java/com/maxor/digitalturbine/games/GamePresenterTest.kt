package com.maxor.digitalturbine.games

import com.maxor.digitalturbine.RxImmediateSchedulerRule
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
        val gamesData  = listOf(GameData(
            1234,"gamerush","thumbnail.png","4.5"))

        val gameAdsResponse = AdsResponse(gamesData)

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


        verify(gameView).showGames(gamesData)


    }
}