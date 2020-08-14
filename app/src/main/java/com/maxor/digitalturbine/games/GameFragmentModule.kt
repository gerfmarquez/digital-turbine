package com.maxor.digitalturbine.games

import com.maxor.digitalturbine.games.GameAdsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class GameFragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeGameAdFragment() : GameAdsFragment
}