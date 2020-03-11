package com.blackpowerc.jerseycdi.app;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@RequestScoped
public class HelloResource
{
    @Inject
    private HelloService helloService ;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return helloService.sayHello() ;
    }
}
