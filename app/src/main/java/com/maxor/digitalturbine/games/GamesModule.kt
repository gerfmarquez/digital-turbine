package com.maxor.digitalturbine.games

import dagger.Binds
import dagger.Module

@Module
abstract class GamesModule {
    @Binds
    abstract fun bindGamesPresenter(gamesPresenter: GamesPresenter)
            : GamesMvpContract.Presenter
}