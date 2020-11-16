package com.maxor.digitalturbine.games.model

import com.maxor.digitalturbine.games.GameData
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

@Root(strict = false, name="ads")
data class AdsResponse (
    @field:ElementList(name="ad", inline = true, required = false)
    @field:Element( name = "ad") var ads: List<Ad> = mutableListOf(),
    @field:Element var totalCampaignsRequested: String = "",
    @field:Element var responseTime: String = "",
    @field:Element var version: String = "" )
