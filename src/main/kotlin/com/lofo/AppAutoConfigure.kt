package com.lofo

import com.lofo.lisenter.SendMailEventLisenter
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by bestw on 4/12/2017.
 */
@Configuration
class AppAutoConfigure{

    @Bean
    @ConditionalOnProperty("app.sendMail.admin")
    fun mailSendLisenter(): SendMailEventLisenter {
        return SendMailEventLisenter()
    }
}