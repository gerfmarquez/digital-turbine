package com.maxor.digitalturbine.games

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.maxor.digitalturbine.R
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.games_view.view.*
import javax.inject.Inject

class GameAdsFragment : DaggerFragment() , GamesMvpContract.View {

    @Inject
    lateinit var gamePresenter : GamesPresenter
    var gameAdapter: GameAdapter? = null
    var gameData : List<GameData>? = null

    override fun onCreateView(inflater: LayoutInflater, container:  ViewGroup?,
                              savedInstanceState: Bundle?): View {

        gamePresenter.bindView(this)
        gamePresenter.fetchGames()

        val layout : LinearLayout = inflater.inflate(R.layout.games_view,   container,  false) as LinearLayout

        val rvAdapter = GameAdapter(context!!)

        gameAdapter = rvAdapter
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
    }

    override fun showGamesFail() {
        val builder = AlertDialog.Builder(this.context)
        builder.setMessage("Error Fetching Game Ads").create().show()
    }

}