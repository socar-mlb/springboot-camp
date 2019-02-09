package org.inframincer.spring04

import org.junit.Test
import org.springframework.security.crypto.factory.PasswordEncoderFactories

class PasswordTest {

    @Test
    fun passwordEncodeTest() {
        val passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder()

        val encode = passwordEncoder.encode("1234")
        println(encode)
    }
}
