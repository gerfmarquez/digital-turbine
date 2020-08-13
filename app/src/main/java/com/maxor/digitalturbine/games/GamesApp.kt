package com.maxor.digitalturbine.games


import dagger.android.DaggerApplication

class GamesApp : DaggerApplication() {

    override fun applicationInjector() = DaggerGamesComponent.builder()
        .application(this)
        .build()
}