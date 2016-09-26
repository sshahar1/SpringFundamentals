package controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Inject
    @Qualifier("rivki")
    private String myString;

    @RequestMapping(value ="/getrivki", method = RequestMethod.GET)
    public String getRivki() {
        return myString;
    }
}
