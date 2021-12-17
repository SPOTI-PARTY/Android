package com.heewon.domain.param

data class SearchRoomParam(
    val page: Int,
    val range: Int,
    val title: String,
    val filter: List<String>,
)