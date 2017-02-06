package controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by sigals on 26/09/2016.
 */
@RestController
@RequestMapping(value = "/workshop", produces = "application/json")
@Api(value = "workshop", description = "Workshop")
public class MyRestController {

    private String sigals1;

    @Value("${sigals}")
    private String sigals2;

    public MyRestController(@Value("${sigals}") String sigals) {
        this.sigals1 = sigals;
    }

    @Inject
    @Qualifier("rivki")
    private String myString;

    @RequestMapping(value ="/getrivki", method = RequestMethod.GET, produces = "text/plain")
    public String getRivki() {
        return myString;
    }

    @RequestMapping(value = "/propertyConstructor", method = RequestMethod.GET, produces = "text/plain")
    public String getPropertyConstructor() {
        return sigals1;
    }

    @RequestMapping(value = "/propertyAnnotation", method = RequestMethod.GET, produces = "text/plain")
    public String getPropertyAnnotation() {
        return sigals2;
    }
}
