package com.maxor.digitalturbine.games

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.maxor.digitalturbine.R
import com.maxor.digitalturbine.util.EspressoIdlingResource
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.games_view.view.*
import org.jetbrains.annotations.TestOnly
import javax.inject.Inject

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

class GameAdsFragment : DaggerFragment() , GamesMvpContract.View {

    @Inject
    lateinit var gamePresenter : GamesPresenter
    var gameAdapter: GameAdapter? = null
    var gameData : List<GameData>? = null

    override fun onCreateView(inflater: LayoutInflater, container:  ViewGroup?,
                              savedInstanceState: Bundle?): View {

        gamePresenter.bindView(this)
        gamePresenter.fetchGames()

        EspressoIdlingResource().increment()

        val layout : LinearLayout = inflater.inflate(R.layout.games_view,   container,  false) as LinearLayout

        gameAdapter =  GameAdapter(context!!)
        layout.rv_game_ads.adapter = gameAdapter

        return layout
    }
    override fun onPause() {
        super.onPause()
        gamePresenter.cleanup()
    }

    override fun showGames(gamedata: List<GameData>) {
        gameData = gameData
        gameAdapter?.submitList(gamedata)

        EspressoIdlingResource().decrement()
    }

    override fun showGamesFail() {
        val builder = AlertDialog.Builder(this.context)
        builder.setMessage("Error Fetching Game Ads").create().show()

        EspressoIdlingResource().decrement()
    }

}