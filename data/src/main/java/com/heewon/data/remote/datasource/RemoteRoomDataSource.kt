package com.heewon.data.remote.datasource

import com.heewon.data.remote.request.CreateRoomRequest
import com.heewon.data.remote.response.RoomIdResponse
import com.heewon.data.remote.response.RoomResponse

interface RemoteRoomDataSource {

    suspend fun createRoom(
        createRoomRequest: CreateRoomRequest
    ): RoomIdResponse

    suspend fun fetchRoomList(
        page: Int,
        range: Int
    ): List<RoomResponse>

    suspend fun searchRoom(
        page: Int,
        range: Int,
        title: String,
        filter: String
    ): List<RoomResponse>
}