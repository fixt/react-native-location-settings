package co.fixt.react.location.settings;

import android.content.Context;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public final class RNLocationSettings extends ReactContextBaseJavaModule {
  private ReactApplicationContext mContext;
  private static final String TAG = "RNLocationSettings";

  public RCTDropDetection(ReactApplicationContext reactContext) {
    super(reactContext);
    mContext = reactContext;
  }

  @Override
  public String getName() {
    return TAG;
  }

  @ReactMethod
  public void open() {
    Intent viewIntent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    mContext.startActivity(viewIntent);
  }
}
