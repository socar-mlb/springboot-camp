package org.inframincer.spring04.security

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.User

class SecurityUser : User {

    val id: Long = 0
    val name: String = ""

    constructor(
        email: String?,
        password: String?,
        authorities: MutableCollection<out GrantedAuthority>?
        ) : super(email, password, null)

    constructor(
        username: String?,
        password: String?,
        enabled: Boolean,
        accountNonExpired: Boolean,
        credentialsNonExpired: Boolean,
        accountNonLocked: Boolean,
        authorities: MutableCollection<out GrantedAuthority>?
    ) : super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities)
}
