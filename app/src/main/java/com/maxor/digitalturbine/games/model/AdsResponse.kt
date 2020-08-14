package com.maxor.digitalturbine.games.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(strict = false, name="ads")
data class AdsResponse constructor(
    @field:ElementList(name="ad", inline = true, required = false)
    @field:Element var ads: List<Ad>? = null,
    @field:Element var totalCampaignsRequested: String? = "",
    @field:Element var responseTime: String? = "",
    @field:Element var version: String? = "")

