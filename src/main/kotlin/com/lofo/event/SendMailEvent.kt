package com.lofo.event

import org.springframework.context.ApplicationEvent

/**
 * Created by bestw on 4/12/2017.
 */
class SendMailEvent(source: Any?, val greeting: String) : ApplicationEvent(source)