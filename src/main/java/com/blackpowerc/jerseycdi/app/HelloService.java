package com.blackpowerc.jerseycdi.app;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService
{
    public String sayHello() {
        return "Hello" ;
    }
}
