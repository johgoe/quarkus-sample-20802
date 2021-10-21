package org.acme;

@CustomDirective(fields = "grettings")
public class World {

    public World() {
        this.greeting = "Hello World!";
    }

    private String greeting;

    public World(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }


}
