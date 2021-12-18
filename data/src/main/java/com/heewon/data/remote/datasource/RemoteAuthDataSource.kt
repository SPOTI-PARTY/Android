package com.heewon.data.remote.datasource

import com.heewon.data.remote.response.AuthLinkResponse
import com.heewon.data.remote.response.TokenResponse

interface RemoteAuthDataSource {

    suspend fun fetchAuthLink(
        authType: String
    ): AuthLinkResponse

    suspend fun signIn(
        code: String,
        authType: String
    ): TokenResponse

    suspend fun tokenRefresh(
        refreshToken: String
    ): TokenResponse
}