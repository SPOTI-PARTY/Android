package com.heewon.domain.usecase.music

import com.heewon.domain.base.UseCase
import com.heewon.domain.entity.LyricEntity
import com.heewon.domain.param.FetchLyricParam
import com.heewon.domain.repository.MusicRepository
import kotlinx.coroutines.flow.Flow

class FetchLyricUseCase(
    private val musicRepository: MusicRepository
) : UseCase<FetchLyricParam, Flow<LyricEntity>>() {

    override suspend fun execute(param: FetchLyricParam): Flow<LyricEntity> =
        musicRepository.fetchLyric(param)
}