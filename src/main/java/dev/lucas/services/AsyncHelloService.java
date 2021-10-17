package dev.lucas.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncHelloService {

    @Async
    public void asyncMethod() {

        System.out.println("Meio " + Thread.currentThread().getName() );

    }

}
