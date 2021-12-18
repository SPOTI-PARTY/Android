package com.heewon.data.remote.response

import com.google.gson.annotations.SerializedName

data class AuthLinkResponse(
    @SerializedName("link") val link: String
)