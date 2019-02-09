package org.inframincer.spring04.domain

import lombok.Getter
import lombok.Setter
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "users")
@Getter
@Setter
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(length = 100)
    var name: String = ""

    @Column(length = 255)
    var email: String = ""

    @Column(length = 255)
    var password: String = ""
    var localDateTime: LocalDateTime = LocalDateTime.now()

    @ManyToMany
    @JoinTable(name = "users_roles",
        joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")])
    var roles: Set<Role>? = null
}
