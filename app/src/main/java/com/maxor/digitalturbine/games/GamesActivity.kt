package com.maxor.digitalturbine.games


import android.os.Bundle
import android.view.View
import com.maxor.digitalturbine.R
import com.maxor.digitalturbine.games.model.AdsResponse

import dagger.android.support.DaggerAppCompatActivity

import javax.inject.Inject

class GamesActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_ads)
    }
    fun onGameAdClicked(view: View) {
        val gameData : GameData = view.tag as GameData
        startActivity(GameDetailActivity.newInstance(this,gameData))
    }

}