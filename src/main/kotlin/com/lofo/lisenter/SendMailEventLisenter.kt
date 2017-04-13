package com.lofo.lisenter

import com.lofo.event.SendMailEvent
import org.springframework.context.event.EventListener

/**
 * Created by bestw on 4/12/2017.
 */
class SendMailEventLisenter {

    @EventListener
    fun sendMail(event: SendMailEvent) {
        println(">>>>>>>>>>>>>>>>>>This is event message :" + event.greeting)
    }

    @EventListener(condition = "#event.greeting == 'Hello'")
    fun onlyEqualHello(event: SendMailEvent) {
        println(">>>>>>>>>>>>>>>>>>This is event message :" + event.greeting)
    }

}
