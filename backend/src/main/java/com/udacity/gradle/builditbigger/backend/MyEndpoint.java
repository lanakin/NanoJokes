/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.builditbigger.jokeslib.JokeTeller;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }

    //jokes modification
    @ApiMethod(name = "getJokesData")
    public MyBean getJokesData() {
      /*  MyBean backendObj = new MyBean();

        //set data
        JokeTeller jokester = new JokeTeller();
        //backendObj.setJokesSetupData(jokester.getJokesSetup());
        //backendObj.setJokesPunchlineData(jokester.getJokesPunchline());

        return backendObj;*/

       //repeated here for now  as weird error where tellMeAJoke is not showing up as a GCE api method
        MyBean response = new MyBean();

        JokeTeller jokester = new JokeTeller();
        response.setData(jokester.getAJoke());

        return response;
    }

    @ApiMethod(name = "tellMeAJoke")
    public MyBean tellMeAJoke()
    {
        MyBean response = new MyBean();

        JokeTeller jokester = new JokeTeller();
        response.setData(jokester.getAJoke());

        return response;
    }

}
