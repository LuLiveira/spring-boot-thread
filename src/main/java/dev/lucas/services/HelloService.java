package dev.lucas.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {



    private final AsyncHelloService asyncHelloService;

    public HelloService(AsyncHelloService asyncHelloService) {
        this.asyncHelloService = asyncHelloService;
    }


    public void start() {

        System.out.println("Inicio");

        asyncHelloService.asyncMethod();

        System.out.println("Fim");
    }


}
