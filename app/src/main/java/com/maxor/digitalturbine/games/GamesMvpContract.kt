package com.maxor.digitalturbine.games

import com.maxor.digitalturbine.games.model.AdsResponse

interface GamesMvpContract {
    interface View {
        fun showGames(adsResponse : AdsResponse)
        fun showGamesFail()
    }
    interface Presenter {
        fun bindView(view: View)
        fun fetchGames()
        fun cleanup()
    }

}