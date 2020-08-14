package com.maxor.digitalturbine

import com.maxor.digitalturbine.games.GameAdsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeGameAdFragment() : GameAdsFragment
}