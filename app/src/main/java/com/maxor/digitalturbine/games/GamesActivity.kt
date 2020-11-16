package com.maxor.digitalturbine.games


import android.os.Bundle
import android.view.View
import com.maxor.digitalturbine.R
import com.maxor.digitalturbine.games.model.AdsResponse

import dagger.android.support.DaggerAppCompatActivity

import javax.inject.Inject

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

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