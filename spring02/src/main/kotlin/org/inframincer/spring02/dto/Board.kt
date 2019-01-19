package org.inframincer.spring02.dto

import java.time.LocalDateTime

data class Board(
    val id: Long,
    val name: String,
    val title: String,
    val content: String,
    val readCount: Int,
    val createTime: LocalDateTime
)