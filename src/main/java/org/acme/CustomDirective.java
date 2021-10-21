package org.acme;

import io.smallrye.graphql.api.Directive;
import io.smallrye.graphql.api.DirectiveLocation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.eclipse.microprofile.graphql.NonNull;

@Directive(
    on = {DirectiveLocation.OBJECT, DirectiveLocation.INTERFACE}
)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomDirective{
    @NonNull
    String[] fields();
}