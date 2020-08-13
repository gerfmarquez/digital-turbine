package com.maxor.digitalturbine.games

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import retrofit2.http.GET

interface GamesService {

    companion object {
        val baseUrl: String = "http://ads.appia.com/"

        fun create(): GamesService {
            val httpClient = OkHttpClient.Builder()

            return  Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(SimpleXmlConverterFactory.create())

                .client(httpClient.build())
                .build().create(GamesService::class.java)
        }
    }

}