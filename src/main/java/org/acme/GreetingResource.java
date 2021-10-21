package org.acme;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@GraphQLApi
public class GreetingResource {

    @Query
    public World helloWorld(){
        return new World();
    }

}