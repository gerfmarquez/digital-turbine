package com.maxor.digitalturbine.games

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [GamesActivityModule::class,GamesModule::class])
class GamesAppModule {
    @Singleton
    @Provides
    fun provideGamesService(): GamesService {
        return GamesService.create()
    }
}