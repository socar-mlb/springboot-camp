package org.inframincer.spring04.repository

import org.inframincer.spring04.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface UserRepository : JpaRepository<User, Long> {

    @Query("select u from User u inner join fetch u.roles where email = :email")
    fun getUserByEmail(@Param("email") email: String): User
}
