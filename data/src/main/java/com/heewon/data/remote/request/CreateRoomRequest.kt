package com.heewon.data.remote.request

import com.google.gson.annotations.SerializedName

data class CreateRoomRequest(
    @SerializedName("name") val name: String,
    @SerializedName("public") val public: Boolean,
    @SerializedName("headcount") val headcount: Int,
    @SerializedName("tags") val tags: List<String>,
    @SerializedName("musics") val musics: List<String>
)