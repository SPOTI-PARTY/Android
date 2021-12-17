package com.heewon.domain.repository

import com.heewon.domain.entity.LyricEntity
import com.heewon.domain.entity.MusicEntity
import com.heewon.domain.param.FetchLyricParam
import com.heewon.domain.param.SearchMusicParam
import kotlinx.coroutines.flow.Flow

interface MusicRepository {

    suspend fun fetchLyric(fetchLyricParam: FetchLyricParam): Flow<LyricEntity>

    suspend fun searchMusic(searchMusicParam: SearchMusicParam): Flow<MusicEntity>
}