package com.maxor.digitalturbine.games.model

data class Ads(
    val totalCampaignsRequested: String,
    val ad: List<Ad>,
    val responseTime: String,
    val version: String
)