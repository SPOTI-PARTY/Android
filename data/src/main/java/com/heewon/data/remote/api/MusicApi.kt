package com.heewon.data.remote.api

import com.heewon.data.remote.response.LyricResponse
import com.heewon.data.remote.response.MusicResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MusicApi {

    @GET("lyrics")
    suspend fun fetchLyric(
        @Query("room_id") roomId: String,
        @Query("music_id") musicId: String
    ): LyricResponse

    @GET("/search")
    suspend fun searchMusic(
        @Query("name") title: String
    ): MusicResponse
}