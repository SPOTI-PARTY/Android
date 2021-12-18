package com.heewon.data.remote.request

import com.google.gson.annotations.SerializedName

data class TokenRefreshRequest(
    @SerializedName("refresh_token") val refreshToken: String
)