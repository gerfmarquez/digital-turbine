package com.maxor.digitalturbine.games

import com.maxor.digitalturbine.games.GameAdsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

@Module
abstract class GameFragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeGameAdFragment() : GameAdsFragment
}