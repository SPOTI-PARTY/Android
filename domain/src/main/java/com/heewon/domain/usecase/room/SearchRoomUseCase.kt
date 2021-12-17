package com.heewon.domain.usecase.room

import com.heewon.domain.base.UseCase
import com.heewon.domain.entity.RoomEntity
import com.heewon.domain.param.SearchRoomParam
import com.heewon.domain.repository.RoomRepository
import kotlinx.coroutines.flow.Flow

class SearchRoomUseCase(
    private val roomRepository: RoomRepository
) : UseCase<SearchRoomParam, Flow<RoomEntity>>() {

    override suspend fun execute(param: SearchRoomParam): Flow<RoomEntity> =
        roomRepository.searchRoom(param)
}