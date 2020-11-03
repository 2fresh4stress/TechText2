package com.example.techtext1;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("D8gQBrY6W9ZNWkBxtUdTMuqCG1n8i3LRFo5IMOvA")
                .clientKey("zFnelYEx1kRLZgsUfdZNiqh26Kqdoz2JS1nb0ecT")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
