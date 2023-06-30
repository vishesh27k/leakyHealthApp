package io.privado.privadohealthapp;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FacebookSdk.setApplicationId(getString(R.string.facebook_application_id));
        FacebookSdk.setClientToken(getString(R.string.facebook_client_token));
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);


//        Criteo.getInstance().init(getApplicationContext(), getString(R.string.criteo_id));

//        SnapPixel.init(this, getString(R.string.snap_pixel_id));

    }
}
