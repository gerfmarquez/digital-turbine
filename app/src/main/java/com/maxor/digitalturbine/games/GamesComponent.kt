package com.maxor.digitalturbine.games

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component( modules = [AndroidInjectionModule::class])
interface GamesComponent : AndroidInjector<GamesApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: GamesApp): Builder

        fun build(): GamesComponent
    }

    override fun inject(app: GamesApp)
}