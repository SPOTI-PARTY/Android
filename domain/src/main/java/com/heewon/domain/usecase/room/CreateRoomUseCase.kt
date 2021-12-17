package com.heewon.domain.usecase.room

import com.heewon.domain.base.UseCase
import com.heewon.domain.entity.RoomIdEntity
import com.heewon.domain.param.CreateRoomParam
import com.heewon.domain.repository.RoomRepository
import kotlinx.coroutines.flow.Flow

class CreateRoomUseCase(
    private val roomRepository: RoomRepository
) : UseCase<CreateRoomParam, Flow<RoomIdEntity>>() {

    override suspend fun execute(param: CreateRoomParam): Flow<RoomIdEntity> =
        roomRepository.createRoom(param)
}