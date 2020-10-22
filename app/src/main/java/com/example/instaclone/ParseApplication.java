package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jB8vT0hqdFo6OwBTtJEybPgA9KP11sV2stOAdYiX")
                .clientKey("513Losd9Yvy2Z6ulm16uAi8sm2noOCgDIPr7NjGd")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
