package com.heewon.data.remote.datasource

import com.heewon.data.remote.response.LyricResponse
import com.heewon.data.remote.response.MusicResponse
import retrofit2.http.Query

interface RemoteMusicDataSource {

    suspend fun fetchLyric(
        roomId: String,
        musicId: Int
    ): LyricResponse

    suspend fun searchMusic(
        title: String
    ): MusicResponse
}