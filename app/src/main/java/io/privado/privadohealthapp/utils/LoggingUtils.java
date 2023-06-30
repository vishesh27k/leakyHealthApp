package io.privado.privadohealthapp.utils;

import static com.facebook.FacebookSdk.getApplicationContext;

import android.content.Context;
import android.os.Bundle;

import com.amplitude.android.Amplitude;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mixpanel.android.mpmetrics.MixpanelAPI;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class LoggingUtils {

    public static void logPIIFacebook(Context context, String email){
        String wlanMac = PIIUtils.getMACAddress("wlan0");
        String eth0Mac = PIIUtils.getMACAddress("eth0");
        String ipv4 = PIIUtils.getIPAddress(true); // IPv4
        String ipv6 = PIIUtils.getIPAddress(false); // IPv6
        String imei = PIIUtils.getDeviceIMEI(context);
        String adId = PIIUtils.getAdId(context);

        Bundle parameters = new Bundle();
        parameters.putString("device_id", imei);
        parameters.putString("wlan_mac", wlanMac);
        parameters.putString("eth0_mac", eth0Mac);
        parameters.putString("ipv4", ipv4);
        parameters.putString("ipv6", ipv6);
        parameters.putString("advertising_id", adId);
        parameters.putString("user_email", HashUtils.getHash(email));

        AppEventsLogger logger = AppEventsLogger.newLogger(context);
        logger.logEvent("health_data", parameters);
        logger.logEvent("login", parameters);
        FirebaseAnalytics.getInstance(getApplicationContext()).logEvent("login", parameters);
    }

    public static void logPIIAmplitude(Context context, Amplitude amplitude, String email){
        String wlanMac = PIIUtils.getMACAddress("wlan0");
        String eth0Mac = PIIUtils.getMACAddress("eth0");
        String ipv4 = PIIUtils.getIPAddress(true); // IPv4
        String ipv6 = PIIUtils.getIPAddress(false); // IPv6

        String imei = PIIUtils.getDeviceIMEI(context);
        String adId = PIIUtils.getAdId(context);

        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("user_email", email);
        hashMap.put("device_id", imei);
        hashMap.put("wlan_mac", wlanMac);
        hashMap.put("eth0_mac", eth0Mac);
        hashMap.put("ipv4", ipv4);
        hashMap.put("ipv6", ipv6);
        hashMap.put("advertising_id", adId);

        amplitude.track("health_data", hashMap);
    }

    public static void logPIIMixpanel(Context context, MixpanelAPI mixpanel, String email){
        String wlanMac = PIIUtils.getMACAddress("wlan0");
        String eth0Mac = PIIUtils.getMACAddress("eth0");
        String ipv4 = PIIUtils.getIPAddress(true); // IPv4
        String ipv6 = PIIUtils.getIPAddress(false); // IPv6

        String imei = PIIUtils.getDeviceIMEI(context);
        String adId = PIIUtils.getAdId(context);

        JSONObject props = new JSONObject();
        try {
            props.put("user_email", email);
            props.put("device_id", imei);
            props.put("wlan_mac", wlanMac);
            props.put("eth0_mac", eth0Mac);
            props.put("ipv4", ipv4);
            props.put("ipv6", ipv6);
            props.put("advertising_id", adId);
            mixpanel.track("health_data", props);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

}
