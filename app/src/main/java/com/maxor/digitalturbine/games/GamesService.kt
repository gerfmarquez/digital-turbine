package com.maxor.digitalturbine.games

import com.maxor.digitalturbine.games.model.AdsResponse
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface GamesService {
    /*
     * id=236
     * password=OVUJ1DJN
     * siteId=10777
     * deviceId=4230
     * sessionId=techtestsession
     * totalCampaignsRequested=10
     */
    @GET("getAds")
    fun fetchGameAds(
        @Query("id") id : Int,
        @Query("password") password : String,
        @Query("siteId") siteId : Int,
        @Query("deviceId") deviceId : Int,
        @Query("sessionId") sessionId : String,
        @Query("totalCampaignsRequested") totalCampaignsRequested : Int,
        @Query("lname") lname : String
    ) : Single<AdsResponse>


    companion object {
        val baseUrl: String = "https://ads.appia.com/"

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