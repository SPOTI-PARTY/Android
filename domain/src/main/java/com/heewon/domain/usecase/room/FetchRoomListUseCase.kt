package com.heewon.domain.usecase.room

import com.heewon.domain.base.UseCase
import com.heewon.domain.entity.RoomEntity
import com.heewon.domain.param.FetchRoomParam
import com.heewon.domain.repository.RoomRepository
import kotlinx.coroutines.flow.Flow

class FetchRoomListUseCase(
    private val roomRepository: RoomRepository
) : UseCase<FetchRoomParam, Flow<RoomEntity>>() {

    override suspend fun execute(param: FetchRoomParam): Flow<RoomEntity> =
        roomRepository.fetchRoomList(param)
}