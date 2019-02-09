package org.inframincer.spring04.security

import lombok.RequiredArgsConstructor
import org.inframincer.spring04.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@RequiredArgsConstructor
class ShowUserDetailsService : UserDetailsService {

    @Autowired
    lateinit var userRepository: UserRepository

    @Throws(UsernameNotFoundException::class)
    @Transactional(readOnly = true)
    override fun loadUserByUsername(email: String?): UserDetails {
        val userByEmail = userRepository.getUserByEmail(email!!)
        val authorities = mutableListOf<SimpleGrantedAuthority>()
        val roles = userByEmail.roles!!.forEach {
            authorities.add(SimpleGrantedAuthority("ROLE_${it.name}"))
        }
        return User(userByEmail.email, userByEmail.password, authorities)
    }
}
