package com.maxor.digitalturbine.games.model

import org.simpleframework.xml.*

@Root(name="ad", strict = false)
data class Ad constructor (
    @field:Element(required = false) var averageRatingImageURL: String? = "",
    @field:Element(required = false) var isRandomPick: String? = "",
    @field:Element(required = false) var clickProxyURL: String? = "",
    @field:Element(required = false) var numberOfDownloads: String? = "",
    @field:Element(required = false) var tstiEligible: String? = "",
    @field:Element(required = false) var rating: String? = "",
    @field:Element(required = false) var bidRate: String? = "",
    @field:Element(required = false) var categoryName: String? = "",
    @field:Element(required = false) var creativeId: String? = "",
    @field:Element(required = false) var minOSVersion: String? = "",
    @field:Element(required = false) var productName: String? = "",
    @field:Element(required = false) var callToAction: String? = "",
    @field:Element(required = false) var campaignDisplayOrder: String? = "",
    @field:Element(required = false) var appId: String? = "",
    @field:Element(required = false) var numberOfRatings: String? = "",
    @field:Element(required = false) var campaignTypeId: String? = "",
    @field:Element(required = false) var stiEnabled: String? = "",
    @field:Element(required = false) var productDescription: String? = "",
    @field:Element(required = false) var productId: String? = "",
    @field:Element(required = false) var appPrivacyPolicyUrl: String? = "",
    @field:Element(required = false) var campaignId: String? = "",
    @field:Element(required = false) var homeScreen: String? = "",
    @field:Element(required = false) var impressionTrackingURL: String? = "",
    @field:Element(required = false) var postInstallActions: String? = "",
    @field:Element(required = false) var billingTypeId: String? = "",
    @field:Element(required = false) var productThumbnail: String? = ""
)
