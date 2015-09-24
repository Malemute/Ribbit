package com.emamontov.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by MamontovEU on 17.09.2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
// Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "8dLxoQJekV7x4QYF10YUXeTyL3esAyZtiluNhd5V", "f38tCUxJQGl0EZMKJkLGxCiwWh2VMJZla3lw0nkR");

    }
}
