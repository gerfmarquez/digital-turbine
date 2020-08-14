package com.maxor.digitalturbine.games

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class GamesActivityModule {

    @ContributesAndroidInjector ( modules = [GameFragmentModule::class])
    abstract fun bindGamesActivity() : GamesActivity
}