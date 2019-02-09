package org.inframincer.spring04.config

import org.springframework.boot.autoconfigure.security.servlet.PathRequest
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.web.util.matcher.AntPathRequestMatcher

class SecurityConfig : WebSecurityConfigurerAdapter {

    constructor() : super()
    constructor(disableDefaults: Boolean) : super(disableDefaults)

    override fun configure(web: WebSecurity?) {
        web!!.ignoring()
            .requestMatchers(PathRequest.toStaticResources().atCommonLocations())
            .requestMatchers(AntPathRequestMatcher("/**.html"))
            .requestMatchers(AntPathRequestMatcher("/static/**"))
    }

    override fun configure(http: HttpSecurity?) {
        http!!
            .logout()
            .logoutRequestMatcher(AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/main")
            .permitAll().and()
            .authorizeRequests()
            .antMatchers("/users/login").permitAll()
            .antMatchers("/main").permitAll()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .antMatchers("/h2-console/**").permitAll()
            .anyRequest().fullyAuthenticated()
            .and()
            .csrf().ignoringAntMatchers("/**")
            .and().headers().frameOptions().disable()
            .and().formLogin()
            .loginPage("/users/login")
            .loginProcessingUrl("/users/login")
            .usernameParameter("email")
            .passwordParameter("password")
            .failureUrl("/users/login?fail=true")
    }
}