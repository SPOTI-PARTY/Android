package com.heewon.data.remote.response

import com.google.gson.annotations.SerializedName

data class RoomIdResponse(
    @SerializedName("room_id") val roomId: Int
)