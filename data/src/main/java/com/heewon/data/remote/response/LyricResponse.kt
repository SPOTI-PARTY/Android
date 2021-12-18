package com.heewon.data.remote.response

import com.google.gson.annotations.SerializedName

data class LyricResponse(
    @SerializedName("lyrics") val lyric: String
)