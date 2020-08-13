package com.maxor.digitalturbine.games

import android.app.Activity
import android.os.Bundle
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class GamesActivity : DaggerAppCompatActivity(){

    @Inject
    lateinit var gamesService: GamesService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread {
            gamesService.hashCode()
        }.start()
    }

}