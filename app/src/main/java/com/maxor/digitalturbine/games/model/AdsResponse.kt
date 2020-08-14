package com.maxor.digitalturbine.games.model

import com.maxor.digitalturbine.games.GameData
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(strict = false, name="ads")
data class AdsResponse (
    @field:ElementList(name="ad", inline = true, required = false)
    @field:Element var ads: List<Ad> = mutableListOf(),
    @field:Element var totalCampaignsRequested: String? = "",
    @field:Element var responseTime: String? = "",
    @field:Element var version: String? = "") {
    constructor(gameData : List<GameData>) :
            this (gameData.map {
                val ad = Ad()
                ad.productName = it.name
                ad.productId = it.productId.toString()
                ad.rating = it.rating
                ad.productThumbnail = it.thumbnail
                ad
            })
}

