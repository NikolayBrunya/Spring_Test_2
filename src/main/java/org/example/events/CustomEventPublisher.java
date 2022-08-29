package org.example.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {

    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(String message){
        System.out.println("publish event" + message);
        applicationEventPublisher.publishEvent(new CustomEvent(this));
    }
}
