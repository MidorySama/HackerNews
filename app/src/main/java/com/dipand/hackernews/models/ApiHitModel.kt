package com.dipand.hackernews.models

import com.google.gson.annotations.SerializedName

data class ApiHitModel(
    @SerializedName("ObjetcId") val ObjetcId: String = "",
    @SerializedName("title") val title: String = "",
    @SerializedName("author") val author: String = "",
    @SerializedName("story_url") val story_Url: String = "",
    @SerializedName("url") val url: String = "",
    @SerializedName("story_title") val story_Title: String = "",
    @SerializedName("comment_text") val comment_Text: String = ""
)
