package org.inframincer.spring03.repository

import org.inframincer.spring03.domain.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<Board, Int>