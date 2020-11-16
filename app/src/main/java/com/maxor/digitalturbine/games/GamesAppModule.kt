package com.maxor.digitalturbine.games

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

@Module(includes = [GamesActivityModule::class,GamesModule::class])
class GamesAppModule {
    @Singleton
    @Provides
    fun provideGamesService(): GamesService {
        return GamesService.create()
    }
}