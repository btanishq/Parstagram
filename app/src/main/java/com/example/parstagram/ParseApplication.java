package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import static com.parse.Parse.initialize;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        initialize(new Parse.Configuration.Builder(this)
                .applicationId("CiEBxSSxVlLtCofiphexefTmqaIzsqFpYz9r4nG2")
                .clientKey("5Vjxrd8dXKmTSpYNvvxNhgcyaM1HcyxSU4JRpN2u")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
