package com.maxor.digitalturbine.games

import android.app.Activity
import android.os.Bundle
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class GamesActivity : DaggerAppCompatActivity(){

    @Inject
    lateinit var gamesService: GamesService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread {
            gamesService.fetchGameAds(236,
                "OVUJ1DJN",
                10777,
                4230,
                "techtestsession",
                10,
                "Marquez").subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
        }.start()
    }

}