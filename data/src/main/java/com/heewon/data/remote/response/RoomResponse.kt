package com.heewon.data.remote.response

import com.google.gson.annotations.SerializedName

data class RoomResponse(
    @SerializedName("room_id") val roomId: String,
    @SerializedName("title") val title: String,
    @SerializedName("tags") val tags: List<String>,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("head_count") val headcount: Int,
    @SerializedName("current_head_count") val curHeadcount: Int
)