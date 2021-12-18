package com.heewon.data.remote.api

import com.heewon.data.remote.request.CreateRoomRequest
import com.heewon.data.remote.response.RoomIdResponse
import com.heewon.data.remote.response.RoomResponse
import retrofit2.http.*

interface RoomApi {

    @POST("create")
    suspend fun createRoom(
        @Header("Authorization") token: String,
        @Body createRoomRequest: CreateRoomRequest
    ): RoomIdResponse

    @GET
    suspend fun fetchRoomList(
        @Query("page") page: Int,
        @Query("range") range: Int
    ): List<RoomResponse>

    @GET("search")
    suspend fun searchRoom(
        @Query("page") page: Int,
        @Query("range") range: Int,
        @Query("title") title: String,
        @Query("filter") filter: String
    ): List<RoomResponse>
}