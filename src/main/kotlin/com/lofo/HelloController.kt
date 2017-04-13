package com.lofo

import com.lofo.event.SendMailEvent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationEventPublisher
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by bestw on 4/13/2017.
 */
@RestController
class HelloController @Autowired constructor(val applicationEventPublisher: ApplicationEventPublisher) {

    @GetMapping("/")
    fun sendTestEvent(): String {
        applicationEventPublisher.publishEvent(SendMailEvent(this, "hello! this come from kotlin!"))
        return "hello world from kotlin"
    }

}