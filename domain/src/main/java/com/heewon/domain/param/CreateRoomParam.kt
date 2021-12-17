package com.heewon.domain.param

data class CreateRoomParam(
    val name: String,
    val public: Boolean,
    val headcount: Int,
    val tags: List<String>,
    val musics: List<String>
)