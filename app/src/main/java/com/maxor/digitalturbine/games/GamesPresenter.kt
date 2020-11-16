package com.maxor.digitalturbine.games


import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */


class GamesPresenter @Inject constructor (private val gamesService: GamesService )
    : GamesMvpContract.Presenter {

    private lateinit var view :  GamesMvpContract.View

    private val disposables : MutableList<Disposable> = mutableListOf()


    override fun bindView(view: GamesMvpContract.View) {
        this.view = view
    }

    override fun fetchGames() {

        disposables.add(gamesService.fetchGameAds(236,
            "OVUJ1DJN",
            10777,
            4230,
            "techtestsession",
            100,
            "Marquez").subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe( {response ->
                view.showGames(response.ads.map {
                    GameData(it.productId,
                        it.productName,
                        it.productThumbnail,
                        it.rating)
                })
            }, {
                view.showGamesFail()
            })
        )

    }

    override fun cleanup() {

        for(disposable in disposables) {
            if (!disposable.isDisposed) {
                disposable.dispose()
            }
        }
    }
}