package com.maxor.digitalturbine.games


import android.os.Bundle
import com.maxor.digitalturbine.games.model.AdsResponse

import dagger.android.support.DaggerAppCompatActivity

import javax.inject.Inject

class GamesActivity : DaggerAppCompatActivity(), GamesMvpContract.View {

    @Inject
    lateinit var gamesPresenter: GamesMvpContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        gamesPresenter.bindView(this)
        gamesPresenter.fetchGames()

    }

    override fun onPause() {
        super.onPause()

        gamesPresenter.cleanup()
    }

    override fun showGames(adsResponse: AdsResponse) {
        System.out.println(adsResponse)
    }

    override fun showGamesFail() {
        TODO("Not yet implemented")
    }
}