package com.maxor.digitalturbine.games

import com.maxor.digitalturbine.FragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class GamesActivityModule {

    @ContributesAndroidInjector ( modules = [FragmentModule::class])
    abstract fun bindGamesActivity() : GamesActivity
}