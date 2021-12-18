package com.heewon.data.remote.response

import com.google.gson.annotations.SerializedName

data class MusicResponse(
    @SerializedName("response") val musicList: List<Music>
)

data class Music(
    @SerializedName("song_id") val songId: String,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("title") val title: String,
    @SerializedName("artist") val artist: String,
    @SerializedName("length") val length: Int
)