package com.maxor.digitalturbine.games

import dagger.Binds
import dagger.Module

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

@Module
abstract class GamesModule {
    @Binds
    abstract fun bindGamesPresenter(gamesPresenter: GamesPresenter)
            : GamesMvpContract.Presenter
}