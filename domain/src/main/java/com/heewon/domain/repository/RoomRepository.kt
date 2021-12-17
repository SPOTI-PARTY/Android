package com.heewon.domain.repository

import com.heewon.domain.entity.RoomEntity
import com.heewon.domain.entity.RoomIdEntity
import com.heewon.domain.param.CreateRoomParam
import com.heewon.domain.param.FetchRoomParam
import com.heewon.domain.param.SearchRoomParam
import kotlinx.coroutines.flow.Flow

interface RoomRepository {

    suspend fun createRoom(createRoomParam: CreateRoomParam): Flow<RoomIdEntity>

    suspend fun fetchRoomList(fetchRoomParam: FetchRoomParam): Flow<RoomEntity>

    suspend fun searchRoom(searchRoomParam: SearchRoomParam): Flow<RoomEntity>
}