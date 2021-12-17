package com.heewon.domain.usecase.music

import com.heewon.domain.base.UseCase
import com.heewon.domain.entity.MusicEntity
import com.heewon.domain.param.SearchMusicParam
import com.heewon.domain.repository.MusicRepository
import kotlinx.coroutines.flow.Flow

class SearchMusicUseCase(
    private val musicRepository: MusicRepository
) : UseCase<SearchMusicParam, Flow<MusicEntity>>() {

    override suspend fun execute(param: SearchMusicParam): Flow<MusicEntity> =
        musicRepository.searchMusic(param)
}