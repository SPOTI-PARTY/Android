package com.heewon.data.remote.api

import com.heewon.data.remote.request.TokenRefreshRequest
import com.heewon.data.remote.response.AuthLinkResponse
import com.heewon.data.remote.response.TokenResponse
import retrofit2.http.*

interface AuthApi {

    @GET("oauth")
    suspend fun fetchAuthLink(
        @Query("type") authType: String
    ): AuthLinkResponse

    @POST("auth")
    suspend fun signIn(
        @Query("code") code: String,
        @Query("type") authType: String,
    ): TokenResponse

    @PUT("auth")
    suspend fun tokenRefresh(
        @Body tokenRefreshRequest: TokenRefreshRequest
    ): TokenResponse
}