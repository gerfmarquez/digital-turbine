package com.maxor.digitalturbine.games

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [GamesModule::class])
class GamesAppModule {
    @Singleton
    @Provides
    fun provideGamesService(): GamesService {
        return GamesService.create()
    }
}