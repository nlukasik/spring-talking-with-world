package pl.edu.wszib.springtalkingwithworld;



import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)

public class Ciastko {

    private boolean zjedzone = false;

    public boolean isZjedzone() {
        return zjedzone;
    }

    public void zjedz (){
        this.zjedzone = true;
    }
}
