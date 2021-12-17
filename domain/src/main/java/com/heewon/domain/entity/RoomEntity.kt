package com.heewon.domain.entity

data class RoomEntity(
    val roomList: List<Room>
)

data class Room(
    val roomId: Int,
    val title: String,
    val tags: List<String>,
    val imageUrl: String?,
    val headCount: Int,
    val currentHeadCount: Int
)