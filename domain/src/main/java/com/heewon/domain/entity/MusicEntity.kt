package com.heewon.domain.entity

data class MusicEntity(
    val musicList: List<Music>
)

data class Music(
    val songId: String,
    val imageUrl: String,
    val title: String,
    val artist: String,
    val length: Int
)