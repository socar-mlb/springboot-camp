package org.inframincer.spring02.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
//class WebConfigurer : WebMvcConfigurerAdapter // This type has a constructor, and thus must be initialized here
class WebConfigurer : WebMvcConfigurer
