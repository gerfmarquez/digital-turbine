package com.maxor.digitalturbine.games

import android.content.Context
import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.maxor.digitalturbine.R
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.activity_game_detail.*

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

class GameDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_game_detail)

        val gameData : GameData? = this.intent?.getParcelableExtra(GameDetailActivity.EXTRA_GAME_INFO)

        tv_detail_title.text = gameData?.name
        Picasso.get().load(gameData?.thumbnail).into(iv_game_detail_image)
        tv_detail_rating.text = gameData?.rating

    }
    companion object {
        const val EXTRA_GAME_INFO = "EXTRA_GAME_INFO"

        fun newInstance(context: Context, gameAdData : GameData) : Intent {
            return Intent(context, GameDetailActivity::class.java).apply {
                putExtra(EXTRA_GAME_INFO, gameAdData)
            }
        }
    }
}